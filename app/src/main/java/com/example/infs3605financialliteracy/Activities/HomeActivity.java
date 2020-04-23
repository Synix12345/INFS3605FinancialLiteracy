package com.example.infs3605financialliteracy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.drm.DrmStore;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;


import com.example.infs3605financialliteracy.Fragments.QuizFragment;
import com.example.infs3605financialliteracy.R;
import com.example.infs3605financialliteracy.Fragments.SimulationFragment;
import com.example.infs3605financialliteracy.Fragments.StudyFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Toolbar toolbar = findViewById(R.id.toolbar);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSlot,
                    new SimulationFragment()).commit();
            navigationView.setCheckedItem(R.id.virtual);
        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.quiz:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSlot,
                        new QuizFragment()).commit();
                break;
            case R.id.study:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSlot,
                        new StudyFragment()).commit();
                break;
            case R.id.virtual:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSlot,
                        new SimulationFragment()).commit();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
