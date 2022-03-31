package com.revature.p2.waaik.com.revature.p2.musicme.user.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "music")
public class User {
    @Id
    @SequenceGenerator(name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private UUID userId;
    @Column(
            name = "user_firstname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String userFN;
    @Column(
            name = "user_lastname",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String userLN;
    @Column(
            name = "user_email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String userEmail;
    @Column(
            name = "user_password",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String userPW;

    public User(UUID userId, String userFN, String userLN, String userEmail, String userPW) {
        this.userId = userId;
        this.userFN = userFN;
        this.userLN = userLN;
        this.userEmail = userEmail;
        this.userPW = userPW;
    }

    public User() {
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserFN() {
        return userFN;
    }

    public void setUserFN(String userFN) {
        this.userFN = userFN;
    }

    public String getUserLN() {
        return userLN;
    }

    public void setUserLN(String userLN) {
        this.userLN = userLN;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userFN='" + userFN + '\'' +
                ", userLN='" + userLN + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPW='" + userPW + '\'' +
                '}';
    }
}
