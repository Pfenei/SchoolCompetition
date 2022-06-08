package com.worldskillscompetition;

public class College {

    //Instance Variables
    private static int collegeCounter;
    private String cID;
    private String cName;
    private String city;
    private String postcode;

    //Constructor

    public College(String cName, String city, String postcode) {
        this.cID = String.format("%02d", ++collegeCounter);
        this.cName = cName;
        this.city = city;
        this.postcode = postcode;
    }

    //Getters

    public String getcID() {
        return cID;
    }

    public String getcName() {
        return cName;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }


    //Setters

    public void setcID(String cID) {
        this.cID = cID;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    // toString to show the class content
    @Override
    public String toString() {
        return "College{" +
                "cID='" + cID + '\'' +
                ", cName='" + cName + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
