package com.example.infs3605financialliteracy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.infs3605financialliteracy.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class SignUpActivity extends AppCompatActivity {
    public EditText email, password;
    public Button signup;
    public Button signin;
    FirebaseAuth mFirebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);;
        mFirebaseAuth = FirebaseAuth.getInstance();
        int activeUserdefaulting = getIntent().getIntExtra("SIGN_OUT_REQUEST", 1);
        if (activeUserdefaulting == 1){
            mFirebaseAuth.signOut();
        }

        //Handles
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.login);
        signup = findViewById(R.id.signup);


        //New user sign up
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Fetch text from boxes
                final String newEmail = email.getText().toString();
                String newPassword = password.getText().toString();

                //If the fields are empty
                if (newEmail.isEmpty()){
                    email.setError("Please enter an email address!");
                    email.requestFocus();
                }
                else if (newPassword.isEmpty()){
                    password.setError("Please enter a password!");
                    password.requestFocus();
                }
                else if (newEmail.isEmpty() &&  newPassword.isEmpty()){
                    Toast.makeText(SignUpActivity.this, "Please fill in both fields!", Toast.LENGTH_SHORT).show();
                }
                else if (!(newEmail.isEmpty()  && newPassword.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(newEmail,newPassword).addOnCompleteListener(SignUpActivity.this,
                            new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(SignUpActivity.this,
                                        "Sign Up Unsuccessful. Possible issues may include invalid email address or pre-existing account.",
                                        Toast.LENGTH_LONG).show();
                            }
                            else {
                                Intent i = new Intent(SignUpActivity.this, UserDataActivity.class);
                                i.putExtra("EMAIL_PREFILL", newEmail);
                                startActivity(i);
                                finish();
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(SignUpActivity.this, "Error occurred! Please try again.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Go to sign in page instead, for current users
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
