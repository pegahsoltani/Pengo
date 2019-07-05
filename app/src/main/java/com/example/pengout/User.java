package com.example.pengout;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Belal on 2/26/2017.
 */

@IgnoreExtraProperties
public class User {
    private String userId;
    private String userName;
    private String userInterest;

    public User(){
    }

    public User(String userId, String userName, String userInterest) {
        this.userId = userId;
        this.userName = userName;
        this.userInterest = userInterest;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserInterest() {
        return userInterest;
    }
}
