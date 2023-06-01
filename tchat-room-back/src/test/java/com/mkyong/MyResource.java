package com.mkyong;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
@Path("/hello")
public class MyResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
      return "Jersey Jetty example.";
  }

  @Path("/{username}")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public User hello(@PathParam("username") String name) {

      User obj = new User();
      obj.setId(0);
      obj.setName(name);

      return obj;

  }
  @Path("/test")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public User abc() {
    String jdbcUrl = "jdbc:mariadb://localhost:3306/projet";
    String username = "root";
    String password = "root";
    try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
        
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("pseudo");
            int currentGroupId = resultSet.getInt("currentGroupId");
            User u = new User(id, name, currentGroupId);
            System.out.println(id+" "+name);
            return u;
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
  }

  @Path("/all")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<User> helloList() {

      List<User> list = new ArrayList<>();

      User obj1 = new User();
      obj1.setId(1);
      obj1.setName("mkyong");
      list.add(obj1);

      User obj2 = new User();
      obj2.setId(2);
      obj2.setName("zilap");
      list.add(obj2);

      return list;

  }
}

