package com.example.infs3605financialliteracy.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.infs3605financialliteracy.Activities.LessonActivity;
import com.example.infs3605financialliteracy.R;

public class StudyFragment extends Fragment {

    public Button lesson1;
    public Button lesson2;
    public Button lesson3;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.study_fragment, container, false);

        lesson1 = view.findViewById(R.id.lesson1);
        lesson2 = view.findViewById(R.id.lesson2);
        lesson3 = view.findViewById(R.id.lesson3);

        lesson1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(context, LessonActivity.class);
                intent.putExtra("lessonnumber",0);
                context.startActivity(intent);
            }
        });
        lesson2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(context, LessonActivity.class);
                intent.putExtra("lessonnumber",1);
                context.startActivity(intent);
            }
        });
        lesson3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Context context = v.getContext();
                Intent intent = new Intent(context, LessonActivity.class);
                intent.putExtra("lessonnumber",2);
                context.startActivity(intent);
            }
        });

        return view;
    }
}
