package com.example.sahilj.mfli.APIs;


import com.example.sahilj.mfli.Responses.ImageResponse;
import com.example.sahilj.mfli.Responses.PostResponse;
import com.example.sahilj.mfli.Responses.Result;
import com.example.sahilj.mfli.Responses.SearchResponse;
import com.example.sahilj.mfli.Responses.UserChatPrivacy;
import com.example.sahilj.mfli.Responses.UserDescription;
import com.example.sahilj.mfli.Responses.UserDetails;
import com.example.sahilj.mfli.Responses.UserNotificationPrivacy;
import com.example.sahilj.mfli.Responses.UserPrivacy;
import com.example.sahilj.mfli.Responses.UserProfileDetail;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("login.php")
    Call<Result> checkLogin(@Field("user") String user,
                            @Field("password") String password);

    @FormUrlEncoded
    @POST("singup.php")
    Call<Result> signUp(@Field("fname") String fname,
                        @Field("lname") String lname,
                        @Field("email") String email,
                        @Field("username") String username,
                        @Field("password") Integer password);

    @Multipart
    @POST("steptwo.php")
    Call<Result> stepTwo(@Part MultipartBody.Part file,
                         @Part("nickname") RequestBody nickname,
                         @Part("sitename") RequestBody sitename);

    @FormUrlEncoded
    @POST("steptwo.php")
    Call<Result> stepTwowithoutImage(@Field("nickname") String nickname,
                                     @Field("sitename") String sitename);

    @FormUrlEncoded
    @POST("stepthree.php")
    Call<Result> stepthree(@Field("backupemail") String backupemail,
                           @Field("phonenumber") String phonenumber,
                           @Field("sitename") String sitename);

    @Multipart
    @POST("post.php")
    Call<Result> post(
            @Part("caption") RequestBody caption,
            @Part("size") RequestBody size,
            @Part("type") RequestBody type,
            @Part("sitename") RequestBody sitename);

    @Multipart
    @POST("imageupload.php")
    Call<Result> imageupload(@Part MultipartBody.Part file,
                             @Part("imgnumber") RequestBody imgnumber,
                             @Part("postid") RequestBody postid,
                             @Part("extension") RequestBody extension);

    @Multipart
    @POST("imageComparisonupload.php")
    Call<Result> imageComparisonupload(@Part MultipartBody.Part file,
                                       @Part MultipartBody.Part file1,
                                       @Part("postid") RequestBody postid,
                                       @Part("extension") RequestBody extension,
                                       @Part("extension1") RequestBody extension1);

    @Multipart
    @POST("videoupload.php")
    Call<Result> videoupload(@Part MultipartBody.Part file,
                             @Part("postid") RequestBody postid,
                             @Part("extension") RequestBody extension);

    @FormUrlEncoded
    @POST("undoupload.php")
    Call<Result> stepthree(@Field("postid") String postid);

    @FormUrlEncoded
    @POST("userdetails.php")
    Call<UserDetails> userdetails(@Field("sitename") String sitename);

    @FormUrlEncoded
    @POST("updateuserdetails.php")
    Call<Result> updateuserdetails(@Field("sitename") String sitename,
                                   @Field("fname") String fname,
                                   @Field("lname") String lname,
                                   @Field("email") String email,
                                   @Field("nickname") String nickname,
                                   @Field("backupmail") String backupmail,
                                   @Field("phone") String phone,
                                   @Field("dob_day") Integer dob_day,
                                   @Field("dob_month") Integer dob_month,
                                   @Field("dob_year") Integer dob_year,
                                   @Field("gender") String gender,
                                   @Field("active") Integer active);

    @FormUrlEncoded
    @POST("changepassword.php")
    Call<Result> changepassword(@Field("sitename") String sitename,
                                @Field("oldpassword") String oldpassword,
                                @Field("password") String password);

    @FormUrlEncoded
    @POST("userdescription.php")
    Call<UserDescription> userDescription(@Field("sitename") String sitename);

    @FormUrlEncoded
    @POST("updateuserdescription.php")
    Call<Result> updateuserdescription(@Field("sitename") String sitename,
                                       @Field("homecity") String homecity,
                                       @Field("homecountry") String homecountry,
                                       @Field("currentcity") String currentcity,
                                       @Field("currentcountry") String currentcountry,
                                       @Field("school") String school,
                                       @Field("college") String college,
                                       @Field("desc") String desc);


    @FormUrlEncoded
    @POST("updateuseralert.php")
    Call<Result> updateuseralert(@Field("sitename") String sitename,
                                 @Field("mailalert") Integer mailalert,
                                 @Field("phonealert") Integer phonealert);

    @FormUrlEncoded
    @POST("userprivacy.php")
    Call<UserPrivacy> userPrivacyDetail(@Field("sitename") String sitename);

    @FormUrlEncoded
    @POST("updateuserprivacy.php")
    Call<Result> updateuserPrivacyDetail(@Field("sitename") String sitename,
                                         @Field("mailprivacy") Integer mailprivacy,
                                         @Field("phoneprivacy") Integer phoneprivacy,
                                         @Field("postprivacy") Integer postprivacy);

    @FormUrlEncoded
    @POST("updateuserprivacyinfo.php")
    Call<Result>  updateuserPrivacyInfo(@Field("sitename") String sitename,
                                        @Field("dobprivacy") Integer dobprivacy,
                                        @Field("currentcityprivacy") Integer currentcityprivacy,
                                        @Field("homecityprivacy") Integer homecityprivacy,
                                        @Field("schoolprivacy") Integer schoolprivacy,
                                        @Field("collegeprivacy") Integer collegeprivacy);

    @FormUrlEncoded
    @POST("usernotificationprivacy.php")
    Call<UserNotificationPrivacy> userNotificationPrivacyDetail(@Field("sitename") String sitename);


    @FormUrlEncoded
    @POST("updateusernotiprivacy.php")
    Call<Result>  updateuserNotiPrivacy(@Field("sitename") String sitename,
                                        @Field("emailnotiprivacy") Integer emailnotiprivacy,
                                        @Field("phonenotiprivacy") Integer phonenotiprivacy);

    @FormUrlEncoded
    @POST("userchatprivacy.php")
    Call<UserChatPrivacy> userChatPrivacyDetail(@Field("sitename") String sitename);

    @FormUrlEncoded
    @POST("userprofiledetails.php")
    Call<UserProfileDetail> userProfileDetail(@Field("sitename") String sitename);

    @FormUrlEncoded
    @POST("updateuserchatprivacy.php")
    Call<Result>  updateuserChatPrivacy(@Field("sitename") String sitename,
                                        @Field("wcmy") Integer wcmy,
                                        @Field("chatoptions") Integer chatoptions);
    @FormUrlEncoded
    @POST("searchuserdata.php")
    Call<SearchResponse> getAllUser(@Field("data") String data, @Field("offset") Integer offset);

    @FormUrlEncoded
    @POST("displaypost.php")
    Call<PostResponse> getPost(@Field("offset") Integer offset);

    @FormUrlEncoded
    @POST("requestImages.php")
    Call<ImageResponse> getImage(@Field("id") Integer id);

    @FormUrlEncoded
    @POST("requestImagess.php")
    Call<ImageResponse> getAlbum(@Field("id") Integer id);

}