package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 4/3/2017.
 */

public class UserDescription {

    @SerializedName("user_info_id")
    private Integer id;

    @SerializedName("user_home_city")
    private String homecity;

    @SerializedName("user_home_country")
    private String homecontry;

    @SerializedName("user_current_city")
    private String currentcity;

    @SerializedName("user_current_country")
    private String currentcontry;

    @SerializedName("user_school")
    private String school;

    @SerializedName("user_college")
    private String college;

    @SerializedName("user_desc")
    private String desc;

    @SerializedName("user_login_email_alert")
    private Integer emailAlert;

    @SerializedName("user_login_phone_alert")
    private Integer phoneAlert;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomecity() {
        return homecity;
    }

    public void setHomecity(String homecity) {
        this.homecity = homecity;
    }

    public String getHomecontry() {
        return homecontry;
    }

    public void setHomecontry(String homecontry) {
        this.homecontry = homecontry;
    }

    public String getCurrentcity() {
        return currentcity;
    }

    public void setCurrentcity(String currentcity) {
        this.currentcity = currentcity;
    }

    public String getCurrentcontry() {
        return currentcontry;
    }

    public void setCurrentcontry(String currentcontry) {
        this.currentcontry = currentcontry;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getEmailAlert() {
        return (emailAlert == 1);
    }

    public Boolean getPhoneAlert() {
        return (phoneAlert==1);
    }
}
