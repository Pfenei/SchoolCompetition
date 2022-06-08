package com.worldskillscompetition;

public abstract class Person {

    //Instance Variables
    protected static int personCounter = 0;
    protected String pID;
    protected String username;
    protected String password;
    protected String name;
    protected String address;
    protected String telephone;

    //Constructor
    public Person(String username, String password, String name, String address, String telephone) {
        this.pID = String.format("%02d", ++personCounter);
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    //Getters

    public abstract String getpID();
    public abstract String getUsername();
    public abstract String getPassword();
    public abstract String getName();
    public abstract String getAddress();
    public abstract String getTelephone();

    //Setter

    public abstract void setpID(String pID);
    public abstract void setUsername(String username);
    public abstract void setPassword(String password);
    public abstract void setName(String name);
    public abstract void setAddress(String address);
    public abstract void setTelephone(String telephone);
}
