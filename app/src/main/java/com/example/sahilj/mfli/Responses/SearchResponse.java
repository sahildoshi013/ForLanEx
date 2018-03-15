package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Sahil J on 4/19/2017.
 */

public class SearchResponse {

    @SerializedName("data")
    private List<SearchUserData> data;

    @SerializedName("success")
    private Boolean success;

    public List<SearchUserData> getData() {
        return data;
    }

    public void setData(List<SearchUserData> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
