package com.example.infs3605financialliteracy.Models;

public class User {

    //Basics
    private String id;
    private String email;
    private String username;
    private String firstname;
    private String lastname;
    private String gender;

    //For functions
    double currentBalance;


    public User(){
        //Empty Constructor
    }

    public User(String newEmail, String newUsername, String newFirstname,
                String newLastname, String newGender, String id ){
        this.email = newEmail;
        this.username = newUsername;
        this.firstname = newFirstname;
        this.lastname = newLastname;
        this.gender = newGender;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public double getCurrentBalance(){
        return currentBalance;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCurrentBalance(double currentBalance){
        this.currentBalance = currentBalance;
    }
}
