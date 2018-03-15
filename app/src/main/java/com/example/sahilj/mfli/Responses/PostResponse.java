package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Sahil J on 4/21/2017.
 */

public class PostResponse {

    @SerializedName("data")
    private List<Post> data;

    @SerializedName("success")
    private Boolean success;

    public List<Post> getData() {
        return data;
    }

    public void setData(List<Post> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
