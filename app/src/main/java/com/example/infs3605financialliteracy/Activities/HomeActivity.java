package com.example.infs3605financialliteracy.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.infs3605financialliteracy.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    public Button signout;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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
                    startActivity(new Intent(HomeActivity.this, MainActivity.class));
                }
                else {
                    Toast.makeText(HomeActivity.this, "No user is signed in", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
