package edu.fiu.ffqr.user;


public class User {

    private Integer userId;
    private String username;
    private String password;
    private String status;


    public User(Integer userId, String username, String password, String status){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.status = status;

    }

    public Integer getUserId(){
        return this.userId;
    }

    public String getUserName(){
        return this.username;
    }

    public void setStudentId(Integer userId){
        this.userId = userId;
    }

    public String getPassword(){
        return this.password;
    }

    public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

    @Override
    public String toString() {
        return "User{" + 
                 "userId=" + userId +
                ", username='" + username + '\'' +
                '}';
    }



}
