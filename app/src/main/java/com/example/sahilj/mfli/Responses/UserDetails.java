package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 4/1/2017.
 */

public class UserDetails {

    @SerializedName("user_fname")
    private String fname;

    @SerializedName("user_lname")
    private String lname;

    @SerializedName("user_email")
    private String email;

    @SerializedName("user_phone_no")
    private String phone;

    @SerializedName("user_nickname")
    private String nickname;

    @SerializedName("user_backup_email")
    private String backupemail;

    @SerializedName("user_gender")
    private String gender;

    @SerializedName("user_dob_day")
    private int day;

    @SerializedName("user_dob_month")
    private int month;

    @SerializedName("user_dob_year")
    private int year;

    @SerializedName("user_active")
    private int active;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBackupemail() {
        return backupemail;
    }

    public void setBackupemail(String backupemail) {
        this.backupemail = backupemail;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getActive() {
        return active != 0;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getGender() {
        switch (gender) {
            case "Male":
                return 0;
            case "Female":
                return 1;
            case "Other":
                return 2;
            default:
                return 3;
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
