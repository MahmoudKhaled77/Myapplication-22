package com.example.WhatsApp.data.model;

public class UserModel {
    private static int userimage;
    private String username;

    public UserModel(int userimage, String username) {
        UserModel.userimage = userimage;
        this.username = username;
    }

    public static int getUserimage() {
        return userimage;
    }

    public void setUserimage(int userimage) {
        UserModel.userimage = userimage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
