package com.example.infs3605financialliteracy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.infs3605financialliteracy.R;
import com.firebase.ui.auth.data.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {
    public EditText email, password;
    public Button signup;
    public Button signin;
    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);;

        //Handles
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signin = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        mFirebaseAuth = FirebaseAuth.getInstance();


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
                    Toast.makeText(MainActivity.this, "Please fill in both fields!", Toast.LENGTH_SHORT).show();
                }
                else if (!(newEmail.isEmpty()  && newPassword.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(newEmail,newPassword).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(MainActivity.this, "Sign Up Unsuccessful. Possible issues may include \n" +
                                        "invalid email address or pre-existing account.", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                mFirebaseUser = mFirebaseAuth.getCurrentUser();
                                Toast.makeText(MainActivity.this, "Registration Successful, Welcome!", Toast.LENGTH_SHORT).show();

                                Intent i = new Intent(MainActivity.this, UserDataActivity.class);
                                i.putExtra("EMAIL_PREFILL", newEmail);
                                startActivity(i);
                                finish();
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(MainActivity.this, "Error occurred!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Go to sign in page instead, for current users
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
