package com.example.sahilj.mfli.Responses;

import com.example.sahilj.mfli.APIs.ApiClient;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 4/19/2017.
 */

public class SearchUserData {

    @SerializedName("user_site_name")
    private String usersitename;

    @SerializedName("user_fname")
    private String fname;

    @SerializedName("user_lname")
    private String lname;

    @SerializedName("user_profile_pic_src")
    private String picSrc;

    public String getUsersitename() {
        return usersitename;
    }

    public void setUsersitename(String usersitename) {
        this.usersitename = usersitename;
    }

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

    public String getName(){
        return fname + " " + lname;
    }

    public String getPicSrc() {
        return ApiClient.BASE_URL+picSrc;
    }

    public void setPicSrc(String picSrc) {
        this.picSrc = picSrc;
    }
}
