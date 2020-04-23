package com.example.infs3605financialliteracy.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.infs3605financialliteracy.R;

public class LoansActivity extends AppCompatActivity {

    private EditText loan, rate, length;
    private TextView totalAmount, interestPayable, totalPayableAmount;
    private Button calculate;
    private Spinner frequency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loans);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        loan = findViewById(R.id.loan);
        rate = findViewById(R.id.rate);
        length = findViewById(R.id.length);
        totalAmount = findViewById(R.id.totalAmount);
        calculate = findViewById(R.id.calculate);
        frequency = findViewById(R.id.frequency);
        interestPayable = findViewById(R.id.interestPayable);
        totalPayableAmount = findViewById(R.id.totalPayableAmount);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_array, android.R.layout.simple_spinner_dropdown_item);
        frequency.setAdapter(adapter);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (loan.getText().toString().length() == 0) {
                    loan.setText(0);
                }
                if (rate.getText().toString().length() == 0) {
                    rate.setText(0);
                }
                if (length.getText().toString().length() == 0) {
                    length.setText(0);
                }

                double terms = Double.parseDouble(frequency.getSelectedItem().toString());
                double P = Integer.parseInt(loan.getText().toString());
                double i = Double.parseDouble(rate.getText().toString())/(100*terms);
                double n = (Integer.parseInt(length.getText().toString())) * terms;

                double interestLength = Math.pow(1+i,n);

                double M = Math.round((P*(i * interestLength)/(interestLength-1))*100.0)/100.0;
                double Interest = Math.round((M*n-P));
                double Total = M * n;

                totalAmount.setText(String.valueOf(M));
                interestPayable.setText(String.valueOf(Interest));
                totalPayableAmount.setText(String.valueOf(Total));
            }
        });
    }



}
