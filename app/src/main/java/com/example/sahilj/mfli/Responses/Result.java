package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 3/21/2017.
 */

public class Result {

    @SerializedName("message")
    private String msg;

    @SerializedName("username")
    private String username;

    @SerializedName("success")
    private Boolean result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
