package com.spring.cs2340.shelterseek.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jmc19 on 2/15/2018.
 */

public class Shelter extends User implements Parcelable {

    public Shelter() {
        super("enter your shelter's name", "NA");
    }

    public Shelter(String name, String password) {
        super(name, password);
    }

    /* *********************************
     * These methods are required by the Parcelable interface
     * I just wanted to demo how to pass information from one activity
     * to another through an intent.   If this were a real project, I
     * would probably have the facade maintain information about the
     * currently selected user which would remove the need to
     * pass the user object in an intent, which would remove the need
     * to implement the Parcelable interface and these methods.
     */

    /**
     * Constructor used by Parcel to make a new user out of the
     * parceled information
     *
     * @param in the parcel containing the user information
     */
    private Shelter(Parcel in) {
        _username = in.readString();
        _password = in.readString();
        _id = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /* *************************
       If you add new instance vars to user, you will need to add them to the write
       Be sure the order you write information matches the order that the constructor above
       reads them.
     */

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_username);
        dest.writeString(_password);
        dest.writeInt(_id);
    }

    /**
     * Should not have to edit this method if the constructor and write method are
     * working correctly.
     */
    public static final Parcelable.Creator<User> CREATOR
            = new Parcelable.Creator<User>() {
        public User createFromParcel(Parcel in) {
            return new Shelter(in);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
