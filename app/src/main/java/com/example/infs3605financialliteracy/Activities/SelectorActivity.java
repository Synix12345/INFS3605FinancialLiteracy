package com.example.infs3605financialliteracy.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.infs3605financialliteracy.R;

public class SelectorActivity extends AppCompatActivity {
    private Button savings;
    private Button loans;
    private Button investing;
    private Button taxes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Handles
        savings = findViewById(R.id.savings);
        loans = findViewById(R.id.loans);
        investing = findViewById(R.id.investing);
        taxes = findViewById(R.id.taxes);

        savings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectorActivity.this, SavingsActivity.class));
                finish();
            }
        });

        loans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectorActivity.this, LoansActivity.class));
                finish();
            }
        });

        investing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectorActivity.this, InvestingActivity.class));
                finish();
            }
        });

        taxes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {



                AlertDialog alertDialog = new AlertDialog.Builder(SelectorActivity.this).create();
                alertDialog.setTitle("Coming Soon");
                alertDialog.setMessage("This section will be coming soon in future updates!");

//

                alertDialog.show();
            }

        });
    }
}
