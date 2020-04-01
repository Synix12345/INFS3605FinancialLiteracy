package com.example.infs3605financialliteracy.Activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.infs3605financialliteracy.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class LessonActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        Intent intent = getIntent();
        int lessonnumber = intent.getIntExtra("lessonnumber", 0);

        //obtain handle
        recyclerView = findViewById(R.id.rv_main);


        //Set layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }
}