package com.example.sahilj.mfli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.frm,new WelcomeFragment()).commit();
    }

    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().getFragments().toString().contains("WelcomeFragment"))
            super.onBackPressed();
        else
            getSupportFragmentManager().beginTransaction().replace(R.id.frm,new WelcomeFragment()).commit();
    }
}
