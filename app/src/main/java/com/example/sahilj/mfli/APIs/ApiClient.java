package com.example.sahilj.mfli.APIs;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://192.168.43.107:80/MFLI/";
    //public static final String BASE_URL = "http://10.0.2.2:80/android/";
    //public static final String BASE_URL = "http://192.168.0.14:80/android/";
    //public static final String BASE_URL = "http://www.swoopzi.com/android/";
    private static Retrofit retrofit = null;
    private static Gson gson=new GsonBuilder().setLenient().create();
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
