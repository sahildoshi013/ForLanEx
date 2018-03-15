package com.example.sahilj.mfli.Responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ImageResponse {

    @SerializedName("data")
    private List<Images> data;

    @SerializedName("success")
    private Boolean success;

    public List<Images> getData() {
        return data;
    }

    public void setData(List<Images> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
