package com.example.sahilj.mfli.Responses;

import com.example.sahilj.mfli.APIs.ApiClient;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 4/21/2017.
 */

public class Images {

    @SerializedName("image_url")
    private String src;

    public String getSrc() {
        return ApiClient.BASE_URL+ src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
