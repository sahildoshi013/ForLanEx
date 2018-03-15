package com.example.sahilj.mfli.Responses;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Sahil J on 1/7/2018.
 */

public class Courses {
    private String course_name;
    private Map<String,CoursesDetails> levels = new LinkedHashMap<>();

    public Courses(String course_name, Map<String, CoursesDetails> levels) {
        this.course_name = course_name;
        this.levels = levels;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Map<String, CoursesDetails> getLevels() {
        return levels;
    }

    public void setLevels(Map<String, CoursesDetails> levels) {
        this.levels = levels;
    }
}
