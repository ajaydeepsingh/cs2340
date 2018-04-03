package com.spring.cs2340.shelterseek.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Shelter implements Parcelable {
    private String uniqueKey;
    private String name;
    private String capacity;
    private String vacancies;
    private double latitude;
    private double longitude;
//    private float rating;
//    private HashSet<String> restrictions;
//    private float cost;
//    private String contactInfo;
//    private User[] blacklist;
//    private User[] currentResidents;

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    private String specialNotes;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;
    // private float rating;
    private String restrictions;
    // private float cost;
    private String contactInfo;
    // private User[] blacklist;
    // private User[] currentResidents;


    public Shelter() {
        this(null, null, null, null, 0, 0, null, null, null, null);
    }

    public Shelter(String key, String name, String cap, String restrics, double lon, double lat,
                   String addr, String specNotes, String contact, String vac) {
        uniqueKey = key;
        this.name = name;
        capacity = cap;
        vacancies = vac;
        latitude = lat;
        longitude = lon;
        restrictions = restrics;
        contactInfo = contact;
        address = addr;
        specialNotes = specNotes;

    }

    /**
     *
     * @return the unique key
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     *
     * @return the unique name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return shelter capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     *
     * @return number of vacancies
     */
    public String getVacancies() {
        return vacancies;
    }

    /**
     *
     * @return restrictions of each shelter
     */
    public String getRestrictions() {
        return restrictions;
    }

    /**
     *
     * @return contact info for shelter
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     *
     * @return latitude of shelter
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     *
     * @return longitude of shelter
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     *
     * @param key key to replace unique key with
     */
    public void setUniqueKey(String key) {
        uniqueKey = key;
    }

    /**
     *
     * @param n new name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     *
     * @param n new capacity
     */
    public void setCapacity(String n) {
        capacity = n;
    }

    /**
     *
     * @param n new vacancies
     */
    public void setVacancies(String n) {
        vacancies = n;
    }

    /**
     *
     * @param d new latitude
     */
    public void setLatitude(double d) {
        latitude = d;
    }

    /**
     *
     * @param d new longitude
     */
    public void setLongitude(double d) {
        longitude = d;
    }

    /**
     *
     * @param restr new restrictions
     */
    public void setRestrictions(String restr) {
        restrictions = restr;
    }

    /**
     *
     * @param contact new contact info
     */
    public void setContactInfo(String contact) {
        contactInfo = contact;
    }


    /**
     * Used internally
     * @param p a parcel
     */
    private Shelter(Parcel p) {
        uniqueKey = p.readString();
        name = p.readString();
        capacity = p.readString();
        vacancies = p.readString();
        longitude = p.readDouble();
        latitude = p.readDouble();
        restrictions = p.readString();
        contactInfo = p.readString();
        address = p.readString();
        specialNotes = p.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uniqueKey);
        parcel.writeString(name);
        parcel.writeString(capacity);
        parcel.writeString(vacancies);
        parcel.writeDouble(longitude);
        parcel.writeDouble(latitude);
        parcel.writeString(restrictions);
        parcel.writeString(contactInfo);
        parcel.writeString(address);
        parcel.writeString(specialNotes);


    }

    /**
     * Should not have to edit this method if the constructor and write method are
     * working correctly.
     */
    public static final Parcelable.Creator<Shelter> CREATOR
            = new Parcelable.Creator<Shelter>() {
        public Shelter createFromParcel(Parcel in) {
            return new Shelter(in);
        }

        public Shelter[] newArray(int size) {
            return new Shelter[size];
        }
    };

    @Override
    public String toString() {
        return getName();
    }
}