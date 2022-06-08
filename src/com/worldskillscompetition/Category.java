package com.worldskillscompetition;

public class Category {

    //Instance Variables
    private static int categoryCounter = 0;
    private String catID;
    private String catName;

    //Constructor
    public Category(String catName) {
        this.catID = String.format("%02d", ++categoryCounter);
        this.catName = catName;
    }

    //Getters

    public String getCatID() {
        return catID;
    }

    public String getCatName() {
        return catName;
    }

    //Setters

    public void setCatID(String catID) {
        this.catID = catID;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    // toString to show the class content
    @Override
    public String toString() {
        return "Category{" +
                "catID='" + catID + '\'' +
                ", catName='" + catName + '\'' +
                '}';
    }
}
