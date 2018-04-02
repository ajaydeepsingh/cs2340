package com.spring.cs2340.shelterseek.model;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.HashMap;

public class Model {
    /**
     * Singleton instance
     */
    private static final Model instance = new Model();
    private static ArrayList<Account> accounts;
    private HashMap<String, Shelter> mshelters;
    private Account currentUser;

    /**
     * returns the static instance of the model to use in the controller
     *
     * @return an instance of the Model to interact with.
     */
    public static Model getInstance() {
        return instance;
    }

    /**
     * make a new model
     */
    public Model() {
        accounts = new ArrayList<>();
        this.dummyData();
    }

    /**
     * Getter for shelters.
     *
     * @return the shelters.
     */
    public HashMap<String, Shelter> getShelters() {
        return mshelters;
    }

    /**
     * Setter for shelters
     *
     * @param shelters shelter to set shelters to.
     */
    public void setShelters(HashMap<String, Shelter> shelters) {
        this.mshelters = shelters;
    }

    public void dummyData() {
        User dummy = new User("Bob", "User", "1234567890", "Pass");
        this.addNewAccount(dummy);
    }

    public boolean addNewAccount(Account a) {
        if (a == null) {
            System.out.println("Account is null");
            return false;
        }
        accounts.add(a);
        return true;
    }

    /**
     * @return the current user
     */
    public Account getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Account user) {
        currentUser = user;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
