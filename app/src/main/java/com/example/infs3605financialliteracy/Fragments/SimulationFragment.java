package com.example.infs3605financialliteracy.Fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import com.example.infs3605financialliteracy.Activities.FundsActivity;
import com.example.infs3605financialliteracy.Activities.HomeActivity;
import com.example.infs3605financialliteracy.Activities.ProfileActivity;
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

public class SimulationFragment extends Fragment {

    private FirebaseAuth mFirebaseAuth;
    private ImageButton profile;
    private TextView balanceholder;
    private DatabaseReference dbusers;
    private String userId;
    private Button editfunds;
    private Button simulations;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.simulation_fragment, container, false);


        //Handles
        profile = view.findViewById(R.id.profilebutton);
        mFirebaseAuth = FirebaseAuth.getInstance();
        balanceholder = view.findViewById(R.id.currentBalance);
        dbusers = FirebaseDatabase.getInstance().getReference("users");
        userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        editfunds = view.findViewById(R.id.editfunds);


        //Display account balance changes.
        dbusers.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                User user = dataSnapshot.child(userId).getValue(User.class);
                double currentBalance = user.getCurrentBalance();
                NumberFormat defaultFormat  = NumberFormat.getCurrencyInstance();
                balanceholder.setText(defaultFormat.format(currentBalance));
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ProfileActivity.class));
            }
        });

        editfunds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), FundsActivity.class));
            }
        });

        simulations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }
}
