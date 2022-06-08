package com.worldskillscompetition;

public class Teacher extends Person implements ILadder,IRole{

    //Instance variables
    private String tRole;
    private int tScore;
    private double tScoreD;

    //Constructor
    public Teacher(String username, String password, String name, String address, String telephone) {
        super(username, password, name, address, telephone);
        this.tScore = 0;
        this.tScoreD = 0.0;
    }

    //parent getters

    @Override
    public String getpID() {
        return pID;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    //Parent setters

    @Override
    public void setpID(String pID) {
        this.pID = pID;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    //ILadder Methods
    @Override
    public int addPoints(int points) {
        return this.tScore = points;
    }

    @Override
    public double addPoints(double points) {
        return this.tScoreD = points;
    }

    @Override
    public int deletePoints(int points) {
        return tScore = points;
    }

    @Override
    public double deletePoints(double points) {
        return tScoreD = points;
    }

    //IRole Methods
    @Override
    public String getRole() {
        return tRole;
    }

    @Override
    public void setRole(String role) {
        this.tRole = role;
    }

    // toString to show the class content
    @Override
    public String toString() {
        return "Teacher{" +
                "pID='" + pID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                " role='" + tRole + '\'' +
                '}';
    }
}
