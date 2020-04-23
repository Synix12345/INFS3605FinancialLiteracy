package com.example.infs3605financialliteracy.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.infs3605financialliteracy.Activities.Quiz1Activity;
import com.example.infs3605financialliteracy.Activities.Quiz2Activity;
import com.example.infs3605financialliteracy.Activities.Quiz3Activity;
import com.example.infs3605financialliteracy.R;

public class QuizFragment extends Fragment {
    Button quiz1, quiz2, quiz3;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.quiz_fragment, container, false);

        quiz1 = view.findViewById(R.id.quiz1);
        quiz2 = view.findViewById(R.id.quiz2);
        quiz3 = view.findViewById(R.id.quiz3);

        quiz1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quiz1Activity.class);
                startActivity(intent);
            }
        });

        quiz2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quiz2Activity.class);
                startActivity(intent);
            }
        });

        quiz3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Quiz3Activity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
