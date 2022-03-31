package com.revature.springsecurity.entity;



@Entity
public class User {

    private Long userId;
    private String userFirstName;
    private String userLastname;
    private String userEmail;
    private String userPassword;

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserFirstName() {
        return userFirstName;
    }
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
    public String getUserLastname() {
        return userLastname;
    }
    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public User(Long userId, String userFirstName, String userLastname, String userEmail, String userPassword) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastname = userLastname;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User [userEmail=" + userEmail + ", userFirstName=" + userFirstName + ", userId=" + userId
                + ", userLastname=" + userLastname + ", userPassword=" + userPassword + "]";
    }
    
    
}
