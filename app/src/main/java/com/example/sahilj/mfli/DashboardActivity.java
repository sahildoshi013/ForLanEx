package com.example.sahilj.mfli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sahilj.mfli.Responses.Courses;
import com.example.sahilj.mfli.Responses.CoursesDetails;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;

public class DashboardActivity extends AppCompatActivity {


    private static final String TAG = "Dashsboard Activity";
    private ArrayList<Courses> ListOfcourses;
    private LinearLayout layoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        BannerSlider bannerSlider = findViewById(R.id.slider);
        layoutContainer = findViewById(R.id.llTop);

        List<Banner> banners=new ArrayList<>();

        //add banner using image url
        /*banners.add(new RemoteBanner("Put banner image url here ..."));
        //add banner using resource drawable
        */

        banners.add(new DrawableBanner(R.drawable.img1));
        banners.add(new DrawableBanner(R.drawable.germany));
        banners.add(new DrawableBanner(R.drawable.img3));
        banners.add(new DrawableBanner(R.drawable.franch));

        bannerSlider.setBanners(banners);

        genearateData();

        bindDataToView();

        Log.v(TAG,ListOfcourses.get(0).getLevels().toString());
    }

    private void bindDataToView() {

        for(Courses c : ListOfcourses) {
            View view = getLayoutInflater().inflate(R.layout.course_outline, null);
            LinearLayout linearLayout = view.findViewById(R.id.CourseContainer);

            String courseName = c.getCourse_name();
            Map<String, CoursesDetails> courseLavel = c.getLevels();

            for(Map.Entry<String, CoursesDetails> entry : courseLavel.entrySet()){
                String name = entry.getKey();
                String title = entry.getValue().getMeta_title();
                String desc = entry.getValue().getMeta_data();

                View view1 = getLayoutInflater().inflate(R.layout.cardview_course_dashboard,null);

                ImageView imageView = view1.findViewById(R.id.ivContentFlag);
                TextView textView = view1.findViewById(R.id.tvMetaTitle);
                TextView textView1 = view1.findViewById(R.id.tvMetaDesc);

                String mDrawableName = courseName.toLowerCase()+"_"+name.toLowerCase();


                int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());

                if(resID==0)
                    imageView.setImageResource(R.drawable.germany);
                else
                    imageView.setImageResource(resID);

                textView.setText(title);
                textView1.setText(desc);

                linearLayout.addView(view1);
            }

            layoutContainer.addView(view);
        }

    }

    private void genearateData() {
        ListOfcourses = new ArrayList<>();
        Map<String, CoursesDetails> data = new LinkedHashMap<>();
        CoursesDetails details;
        for (int i=1;i<=6;i++){
            details = new CoursesDetails("Begginer " + i,"Level Data - " + i);
            data.put(("A" + i),details);
        }
        ListOfcourses .add(new Courses("germany",data));
    }
}
