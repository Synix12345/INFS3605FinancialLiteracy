package com.example.infs3605financialliteracy.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.infs3605financialliteracy.Dialogs.UserDataDialog;
import com.example.infs3605financialliteracy.R;
import com.firebase.ui.auth.data.model.User;


//This activity exists to fill in the basic information the user initially provides upon sign up.
public class UserDataActivity extends AppCompatActivity {
    public TextView email;
    public String emailprefill;
    public TextView firstname;
    public TextView lastname;
    public TextView username;
    public Spinner genderSpinner;
    public Button submit;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        //Handles
        email = findViewById(R.id.udemail);
        firstname = findViewById(R.id.udfname);
        lastname = findViewById(R.id.udlname);
        username = findViewById(R.id.udusername);
        genderSpinner = findViewById(R.id.udgender);
        submit = findViewById(R.id.submit);
        emailprefill = getIntent().getStringExtra("EMAIL_PREFILL");

        email.setText(emailprefill);
        showDialog();

        //Populate gender spinner with options
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(adapter);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = email.getText().toString();
                String fname = firstname.getText().toString();
                String lname = lastname.getText().toString();
                String uname = username.getText().toString();
                String gender = genderSpinner.getSelectedItem().toString();
                int pos = genderSpinner.getSelectedItemPosition();

                if (e.isEmpty()){
                    email.setError("Fields cannot be empty!");
                    email.requestFocus();
                }
                else if (fname.isEmpty()){
                    firstname.setError("Fields cannot be empty!");
                    firstname.requestFocus();
                }
                else if (lname.isEmpty()){
                    lastname.setError("Fields cannot be empty!");
                    lastname.requestFocus();
                }
                else if (uname.isEmpty()){
                    username.setError("Fields cannot be empty!");
                    username.requestFocus();
                }
                else if (uname.length() < 5){
                    username.setError("Username must be between 5 to 10 characters");
                    username.requestFocus();
                }
                else {
                    //Pass data to database for storage
                    //...

                    startActivity(new Intent(UserDataActivity.this, HomeActivity.class));
                    finish();
                }

            }
        });

    }
    public void showDialog(){
        UserDataDialog userDataDialog = new UserDataDialog();
        userDataDialog.show(getSupportFragmentManager(),"");
    }
}
