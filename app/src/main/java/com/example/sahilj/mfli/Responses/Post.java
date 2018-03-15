package com.example.sahilj.mfli.Responses;

import com.example.sahilj.mfli.APIs.ApiClient;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil on 28-02-2017.
 */

public class Post {

    @SerializedName("post_id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("src")
    private String src;

    @SerializedName("time")
    private String time;

    @SerializedName("post_text")
    private String caption;

    @SerializedName("post_type")
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSrc() {
        return ApiClient.BASE_URL+src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
