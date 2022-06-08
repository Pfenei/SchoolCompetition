package com.worldskillscompetition;

public class Student extends Person{

    //Instance variables
    private String status;

    //Constructor
    public Student(String username, String password, String name, String address, String telephone, String status) {
        super(username, password, name, address, telephone);
        this.status = status;
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

    //Child Getters
    public String getStatus() {
        return status;
    }


    //parent setters

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

    //Child Setters

    public void setStatus(String status) {
        this.status = status;
    }

    // toString to show the class content

    @Override
    public String toString() {
        return "Student{" +
                "pID='" + pID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                " status='" + status + '\'' +
                '}';
    }
}
