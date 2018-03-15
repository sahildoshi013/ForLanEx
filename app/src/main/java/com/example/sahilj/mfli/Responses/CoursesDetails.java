package com.example.sahilj.mfli.Responses;

/**
 * Created by Sahil J on 1/7/2018.
 */

public class CoursesDetails {
    private String meta_title;
    private String meta_data;

    public CoursesDetails(String meta_title, String meta_data) {
        this.meta_title = meta_title;
        this.meta_data = meta_data;
    }

    public String getMeta_title() {
        return meta_title;
    }

    public void setMeta_title(String meta_title) {
        this.meta_title = meta_title;
    }

    public String getMeta_data() {
        return meta_data;
    }

    public void setMeta_data(String meta_data) {
        this.meta_data = meta_data;
    }

}
