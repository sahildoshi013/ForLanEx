package com.example.sahilj.mfli.Responses;


import com.example.sahilj.mfli.APIs.ApiClient;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Sahil J on 4/5/2017.
 */

public class UserProfileDetail {

    @SerializedName("user_site_name")
    private String sitename;

    @SerializedName("user_email")
    private String email;

    @SerializedName("user_fname")
    private String fname;

    @SerializedName("user_lname")
    private String lname;

    @SerializedName("user_nickname")
    private String nickname="";

    @SerializedName("user_phone_no")
    private String phoneno;

    @SerializedName("user_dob_day")
    private Integer dob_day;

    @SerializedName("user_dob_month")
    private Integer dob_month;

    @SerializedName("user_dob_year")
    private Integer dob_year;

    @SerializedName("user_current_city")
    private String city="";

    @SerializedName("user_current_country")
    private String country="";

    @SerializedName("user_school")
    private String school="";

    @SerializedName("user_college")
    private String college="";

    @SerializedName("user_desc")
    private String desc="";

    @SerializedName("user_profile_pic_src")
    private String profilepic;

    @SerializedName("user_profile_cover_src")
    private String coverpic;

    @SerializedName("COUNT(post_id)")
    private String postcount;

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFullName(){
        return fname+" "+lname;
    }
    public String getNickname() {
        return "("+nickname+")";
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public Integer getDob_day() {
        return dob_day;
    }

    public void setDob_day(Integer dob_day) {
        this.dob_day = dob_day;
    }

    public Integer getDob_month() {
        return dob_month;
    }

    public void setDob_month(Integer dob_month) {
        this.dob_month = dob_month;
    }

    public Integer getDob_year() {
        return dob_year;
    }

    public void setDob_year(Integer dob_year) {
        this.dob_year = dob_year;
    }

    public String getDOB(){
        String month = null;
        switch (dob_month){
            case 1:
                month="January";
                break;
            case 2:
                month="February";
                break;
            case 3:
                month="March";
                break;
            case 4:
                month="April";
                break;
            case 5:
                month="May";
                break;
            case 6:
                month="June";
                break;
            case 7:
                month="July";
                break;
            case 8:
                month="August";
                break;
            case 9:
                month="September";
                break;
            case 10:
                month="October";
                break;
            case 11:
                month="November";
                break;
            case 12:
                month="December";
                break;
        }
        return "   " + month+" "+dob_day+","+dob_year;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLiving(){
        return "   " +city+" ,"+country;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getStudy(){
        return (college.isEmpty()) ? "   " +school : "   " +college;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getProfilepic() {
        return ApiClient.BASE_URL+profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getCoverpic() {
        return ApiClient.BASE_URL+coverpic;
    }

    public void setCoverpic(String coverpic) {
        this.coverpic = coverpic;
    }

    public String getPostcount() {
        return postcount;
    }

    public void setPostcount(String postcount) {
        this.postcount = postcount;
    }

    public String getEmail() {
        return (email.length()>22) ? email.substring(0,22)+"000" : email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
