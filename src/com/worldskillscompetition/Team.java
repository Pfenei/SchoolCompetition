package com.worldskillscompetition;

public class Team {

    //Instance Variables
    private static int teamCounter;
    private String teamID;

    private String teamName;
    private String category;
    private String college;
    private String teacher;
    private String member1, member2, member3, member4;
    private String teamScore;

    //Constructor

    public Team(String teamName, Category category, College college, Teacher teacher, Student member1, Student member2, Student member3, Student member4) {
        this.teamID = String.format("%02d", ++teamCounter);
        this.teamName = teamName;
        this.category = category.getCatName();
        this.college = college.getcName();
        this.teacher = teacher.getName();
        this.member1 = member1.getName();
        this.member2 = member2.getName();
        this.member3 = member3.getName();
        this.member4 = member4.getName();
        this.teamScore = "0.0";
    }

    //Getters

    public String getTeamID() {
        return teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getCategory() {
        return category;
    }

    public String getCollege() {
        return college;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getMember1() {
        return member1;
    }

    public String getMember2() {
        return member2;
    }

    public String getMember3() {
        return member3;
    }

    public String getMember4() {
        return member4;
    }

    public String getTeamScore() {
        return teamScore;
    }

    //Setters

    public static void setTeamCounter(int teamCounter) {
        Team.teamCounter = teamCounter;
    }

    public void setTeamID(String teamID) {
        this.teamID = teamID;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    public void setMember3(String member3) {
        this.member3 = member3;
    }

    public void setMember4(String member4) {
        this.member4 = member4;
    }

    public void setTeamScore(String teamScore) {
        this.teamScore = teamScore;
    }

    // toString to show the class content
    @Override
    public String toString() {
        return "Team{" +
                "teamID='" + teamID + '\'' +
                ", category='" + category + '\'' +
                ", college='" + college + '\'' +
                ", teacher='" + teacher + '\'' +
                ", member1='" + member1 + '\'' +
                ", member2='" + member2 + '\'' +
                ", member3='" + member3 + '\'' +
                ", member4='" + member4 + '\'' +
                ", teamScore='" + teamScore + '\'' +
                '}';
    }
}
