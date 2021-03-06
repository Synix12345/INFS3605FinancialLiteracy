package com.example.infs3605financialliteracy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.infs3605financialliteracy.Adapters.AccountAdapter;
import com.example.infs3605financialliteracy.Dialogs.SavingsInfoDialog;
import com.example.infs3605financialliteracy.Models.SavingsAccount;
import com.example.infs3605financialliteracy.Models.User;
import com.example.infs3605financialliteracy.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class SavingsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<SavingsAccount> accountList;
    private ImageButton addAcc;
    private FirebaseAuth mFirebaseAuth;
    private DatabaseReference dbusers;
    private String userId;
    private TextView currBal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        //Handles
        recyclerView = (RecyclerView)findViewById(R.id.accountrecycler);
        recyclerView.setHasFixedSize(true);
        accountList = new ArrayList<>();
        addAcc = findViewById(R.id.addacc);
        mFirebaseAuth = FirebaseAuth.getInstance();
        dbusers = FirebaseDatabase.getInstance().getReference("users");
        userId = FirebaseAuth.getInstance().getCurrentUser().getUid();
        currBal = findViewById(R.id.mainbalance);


        //Dummy data
        accountList.add(new SavingsAccount("1", "Progress Savers", 250.50));
        accountList.add(new SavingsAccount("2", "Vacation Acc", 750.45));

        //Layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Adapter
        mAdapter = new AccountAdapter(accountList, this);
        recyclerView.setAdapter(mAdapter);

        //Add another account button
        addAcc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(SavingsActivity.this).create();
                alertDialog.setTitle("Coming Soon");
                alertDialog.setMessage("Due to unforeseen circumstances, the functionality of this section of the app will appear in future updates!");
                alertDialog.show();
            }

        });

        //Fetch current main balance
        dbusers.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                User user = dataSnapshot.child(userId).getValue(User.class);
                double currentBalance = user.getCurrentBalance();
                NumberFormat defaultFormat  = NumberFormat.getCurrencyInstance();
                currBal.setText(defaultFormat.format(currentBalance));
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }

    public void showDialog(){
        SavingsInfoDialog savingsInfoDialog = new SavingsInfoDialog();
        savingsInfoDialog.show(getSupportFragmentManager(),"");
    }
}
