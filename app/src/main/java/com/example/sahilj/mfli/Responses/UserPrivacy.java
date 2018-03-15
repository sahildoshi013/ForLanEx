package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 4/3/2017.
 */

public class UserPrivacy {

    @SerializedName("privacy_id")
    private Integer id;

    @SerializedName("user_email_privacy")
    private Integer emailprivacy;

    @SerializedName("user_phone_privacy")
    private Integer phoneprivacy;

    @SerializedName("user_post_privacy")
    private Integer postprivacy;

    @SerializedName("user_dob_privacy")
    private Integer dobprivacy;

    @SerializedName("user_current_city_privacy")
    private Integer currentcityprivacy;

    @SerializedName("user_home_city_privacy")
    private Integer homecityprivacy;

    @SerializedName("user_school_privacy")
    private Integer schoolprivacy;

    @SerializedName("user_college_privacy")
    private Integer collegeprivacy;


    public Integer getId() {
        return id;
    }

    public Boolean getEmailprivacy() {
        return (emailprivacy==1);
    }

    public Boolean getPhoneprivacy() {
        return (phoneprivacy==1);
    }

    public Integer getPostprivacy() {
        if(postprivacy==2)
            return 1;
        else
            return 0;
    }

    public Boolean getDobprivacy() {
        return (dobprivacy==1);
    }

    public Boolean getCurrentcityprivacy() {
        return (currentcityprivacy==1);
    }

    public Boolean getHomecityprivacy() {
        return (homecityprivacy==1);
    }

    public Boolean getSchoolprivacy() {
        return (schoolprivacy==1);
    }

    public Boolean getCollegeprivacy() {
        return (collegeprivacy==1);
    }
}
