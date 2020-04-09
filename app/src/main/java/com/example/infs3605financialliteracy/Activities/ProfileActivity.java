package com.example.infs3605financialliteracy.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.infs3605financialliteracy.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {
    public Button signout;
    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Handles
        signout = findViewById(R.id.signout);
        mFirebaseAuth = FirebaseAuth.getInstance();



        //Sign the user out
        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if (mFirebaseUser != null){
                    mFirebaseAuth.signOut();
                    startActivity(new Intent(ProfileActivity.this, SignUpActivity.class));
                    Toast.makeText(ProfileActivity.this, "User has signed out", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else {
                    Toast.makeText(ProfileActivity.this, "No user is signed in", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
