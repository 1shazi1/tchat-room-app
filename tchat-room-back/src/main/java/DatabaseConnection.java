import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {

    public static void main(String[] args) {
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
                User u = new User(id,name,currentGroupId);
                System.out.println("id : "+u.getId()+" name : "+u.getName()+" gID : "+u.getCurrentGroupId());
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
