package com.spring.cs2340.shelterseek.Model;

import java.util.List;

/**
 *
 * Created by ajay on 2/15/2018
 *
 */


public class User extends Account {
    private String gender;
    private List<Integer> dateOfBirth;
    private boolean isVeteran;

    public User(String name, String userID, String password, boolean lockedOut, String contactInfo,
                String gender, List<Integer> dateOfBirth, boolean isVeteran) {
        super(name, userID, password, lockedOut, contactInfo);
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isVeteran = isVeteran;
    }


    public User(String name, String userID, String contactInfo, String password) {
        this(name, userID, password, false, contactInfo, "Male", null, false);
    }

    public User() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Integer> getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(List<Integer> dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public void setVeteran(boolean veteran) {
        isVeteran = veteran;
    }

    @Override
    public String toString() {
        return "------USER------\n" +
                "Name: " + getName() + "\n" +
                "Username: " + getUserId() + "\n" +
                "Password: " + getPassword() + "\n" +
                "Contact Info: " + getContactInfo() + "\n" +
                "Gender: " + getGender() + "\n" +
                "DOB: " + getDateOfBirth().get(0) + "/" + getDateOfBirth().get(1) + "/"
                + getDateOfBirth().get(2) + "\n" +
                "Veteran: " + isVeteran();
    }
}