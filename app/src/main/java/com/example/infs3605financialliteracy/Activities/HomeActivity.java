package com.example.infs3605financialliteracy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.infs3605financialliteracy.Fragments.QuizFragment;
import com.example.infs3605financialliteracy.R;
import com.example.infs3605financialliteracy.Fragments.SimulationFragment;
import com.example.infs3605financialliteracy.Fragments.StudyFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
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

        final SimulationFragment simulationFragment = new SimulationFragment();
        final QuizFragment quizFragment = new QuizFragment();
        final StudyFragment studyFragment = new StudyFragment();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_bar);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.virtual){
                    swapFragment(simulationFragment);
                }
                else if (menuItem.getItemId() == R.id.quiz){
                    swapFragment(quizFragment);
                }
                else if (menuItem.getItemId() == R.id.study){
                    swapFragment(studyFragment);
                }
                return true;
            }
        });
    }

    private void swapFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentSlot, fragment);
        fragmentTransaction.commit();
    }


}
