package com.mkyong;
public class User {

    private int id;
    private String name;
	private int currGroup;

	public User (int id, String name,int currentGroup){
		this.id = id;
		this.name = name;
		this.currGroup = currentGroup;
	}
	public User (){}

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
	public int getCurrGroup() {
		return currGroup;
	}
	public void setCurrGroup(int currGroup) {
		this.currGroup = currGroup;
	}

}