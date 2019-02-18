package com.qa.data;

//pojo -- means plain old java object
public class Users {

	String name; //define the variable without value
	String job;
	String id;
	String createAt;
	
	public Users(){
	
	}
	
	public Users(String name, String job){
		this.name = name;
		this.job = job;
	}

	//getters and setters methods:
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateAt() {
		return createAt;
	}

	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	
	
	

	
	
}