import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("tchat-room")
public class User {
	
	private int id;
	private String name;
	private int currentGroupId;
	
	
	public User(int id, String name, int currentGroupId) {
		this.id = id;
		this.name = name;
		this.currentGroupId = currentGroupId;
	}
	@GET
	public JsonArray userTest() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentGroupId() {
		return currentGroupId;
	}
	public void setCurrentGroupId(int currentGroupId) {
		this.currentGroupId = currentGroupId;
	}
	
}