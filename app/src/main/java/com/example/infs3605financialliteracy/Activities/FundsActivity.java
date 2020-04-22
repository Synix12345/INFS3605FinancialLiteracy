package com.example.infs3605financialliteracy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.infs3605financialliteracy.Models.User;
import com.example.infs3605financialliteracy.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.NumberFormat;

public class FundsActivity extends AppCompatActivity {
    private TextView balanceholder;
    private TextView newBalance;
    private FirebaseAuth mFirebaseAuth;
    private DatabaseReference dbusers;
    private String userId;
    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funds);

        //Handles
        balanceholder = findViewById(R.id.balanceToChange);
        mFirebaseAuth = FirebaseAuth.getInstance();
        dbusers = FirebaseDatabase.getInstance().getReference("users");
        userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        newBalance = findViewById(R.id.newBalance);
        confirm = findViewById(R.id.confirm_button);

        //Display account balance
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

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newBalance.getText().length() == 0 ){
                    newBalance.setError("Please enter a number!");
                    newBalance.requestFocus();
                }
                else {
                    double x = Double.parseDouble(newBalance.getText().toString());
                    dbusers.child(userId).child("currentBalance").setValue(x);
                    Toast.makeText(FundsActivity.this, "Account balance reset", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}
