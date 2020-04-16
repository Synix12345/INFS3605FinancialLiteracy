package com.example.infs3605financialliteracy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import android.widget.ImageButton;
import android.widget.TextView;


import com.example.infs3605financialliteracy.Fragments.QuizFragment;
import com.example.infs3605financialliteracy.Models.User;
import com.example.infs3605financialliteracy.R;
import com.example.infs3605financialliteracy.Fragments.SimulationFragment;
import com.example.infs3605financialliteracy.Fragments.StudyFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.NumberFormat;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //The navigation bar at the bottom
        final SimulationFragment simulationFragment = new SimulationFragment();
        final QuizFragment quizFragment = new QuizFragment();
        final StudyFragment studyFragment = new StudyFragment();

        //Default Fragment to display
        swapFragment(simulationFragment);


        final BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_bar);
        bottomNavigationView.setItemBackgroundResource(R.color.colorGrey);
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
