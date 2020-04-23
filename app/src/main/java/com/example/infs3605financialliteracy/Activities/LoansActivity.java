package com.example.infs3605financialliteracy.Activities;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.infs3605financialliteracy.R;

public class LoansActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loans);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }



}
