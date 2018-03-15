package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 4/4/2017.
 */

public class UserNotificationPrivacy {

    @SerializedName("user_noti_privacy_id")
    private Integer id;

    @SerializedName("user_noti_email_privacy")
    private Integer notiEmailPrivacy;


    @SerializedName("user_noti_phone_privacy")
    private Integer notiPhonePrivacy;

    public Boolean getNotiPhonePrivacy() {
        return (notiPhonePrivacy==1);
    }

    public Boolean getNotiEmailPrivacy() {
        return (notiEmailPrivacy==1);
    }

    public Integer getId() {
        return id;
    }
}
