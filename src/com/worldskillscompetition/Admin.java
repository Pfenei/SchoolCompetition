package com.worldskillscompetition;

public class Admin {

    //Instance Variables
    private static int adminCounter = 0;
    private String aID;
    private String username;
    private String password;

    //Constructor

    public Admin( String username, String password) {
        this.aID = String.format("%02d", ++adminCounter);
        this.username = username;
        this.password = password;
    }

    //Getters

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //Setters

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString to show the class content
    @Override
    public String toString() {
        return "Admin{" +
                "aID='" + aID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
