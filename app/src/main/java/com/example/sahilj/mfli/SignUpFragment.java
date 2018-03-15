package com.example.sahilj.mfli;


import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {


    private EditText firstName;
    private EditText lastName;
    private EditText emailId;
    private EditText userName;
    private TextInputEditText password;
    private TextInputLayout titlePassword;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sign_up, container, false);

        firstName = view.findViewById(R.id.etFirstName);
        lastName = view.findViewById(R.id.etLastName);
        emailId = view.findViewById(R.id.etEmail);
        userName = view.findViewById(R.id.etUserName);
        password = view.findViewById(R.id.etPassword);
        titlePassword = view.findViewById(R.id.tilPassword);

        return view;
    }

}
