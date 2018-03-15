package com.example.sahilj.mfli;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeFragment extends Fragment implements View.OnClickListener {


    public WelcomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        view.findViewById(R.id.tvLogIn).setOnClickListener(this);
        view.findViewById(R.id.tvSignUp).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tvLogIn:
                getFragmentManager().beginTransaction().replace(R.id.frm,new LoginFragment()).commit();
                break;
            case R.id.tvSignUp:
                getFragmentManager().beginTransaction().replace(R.id.frm,new SignUpFragment()).commit();
                break;
        }
    }
}
