package com.example.infs3605financialliteracy.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.infs3605financialliteracy.R;

public class InvestingActivity extends AppCompatActivity {

    EditText Tstartingbalance;
    EditText Tyears;
    EditText Tinterestrate;
    EditText Tmonthlysavings;
    TextView Tendingbalance;
    Button calcbutton;
    double startingbalance,interestrate,monthlysavings,endingbalance,interestPrinciple,futurevalue;
    int years;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investing);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Tstartingbalance=findViewById(R.id.startingbalance);
        Tyears=findViewById(R.id.years);
        Tinterestrate=findViewById(R.id.intrate);
        Tmonthlysavings=findViewById(R.id.monthlysavings);
        Tendingbalance=findViewById(R.id.endingbalance);

        calcbutton=findViewById(R.id.btn_calc);
        calcbutton.setOnClickListener((new View.OnClickListener(){
            @Override
                    public void onClick(View v){

                startingbalance=Double.valueOf(Tstartingbalance.getText().toString());
                interestrate=Double.valueOf(Tinterestrate.getText().toString());
                monthlysavings=Double.valueOf(Tmonthlysavings.getText().toString());
                years=Integer.valueOf(Tyears.getText().toString());

                double rate=((1+(interestrate/12)));
                double rate2=Math.pow(rate,12*years);
                interestPrinciple=startingbalance*rate2;

                futurevalue=monthlysavings*((rate2-1)/(interestrate/12));

                endingbalance=futurevalue+interestPrinciple;

                String stringdouble = Double.toString(endingbalance);

                Tendingbalance.setText(stringdouble);

            }

        }));


    }
}
