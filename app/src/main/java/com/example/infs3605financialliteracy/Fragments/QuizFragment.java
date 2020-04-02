package com.example.infs3605financialliteracy.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.infs3605financialliteracy.Activities.QuizActivity;
import com.example.infs3605financialliteracy.R;

public class QuizFragment extends Fragment {

    Button quiz1;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.quiz_fragment, container, false);

        quiz1 = view.findViewById(R.id.quiz1);
        quiz1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), QuizActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
