package com.example.infs3605financialliteracy.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.infs3605financialliteracy.Dialogs.ActiveUserDialog;
import com.example.infs3605financialliteracy.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {
    public EditText email, password;
    public Button signin;
    public Button signup;
    public AlertDialog dialog;

    public FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    public FirebaseUser mFirebaseUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);;

        //Handles
        email = findViewById(R.id.useremail);
        password = findViewById(R.id.userpassword);
        signin = findViewById(R.id.usersignin);
        signup = findViewById(R.id.register);
        mFirebaseAuth = FirebaseAuth.getInstance();



        //Sign-in flow begins:
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Fetch text from boxes
                String userEmail = email.getText().toString();
                String userPassword = password.getText().toString();

                //If the fields are empty
                if (userEmail.isEmpty()){
                    email.setError("Please enter an email address!");
                    email.requestFocus();
                }
                else if (userPassword.isEmpty()){
                    password.setError("Please enter a password!");
                    password.requestFocus();
                }
                else if (userEmail.isEmpty() &&  userPassword.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Please fill in both fields!", Toast.LENGTH_SHORT).show();
                }
                else if (!(userEmail.isEmpty()  && userPassword.isEmpty())){
                    mFirebaseAuth.signInWithEmailAndPassword(userEmail,userPassword).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(LoginActivity.this,
                                        "Sign-in failed. Please check email or password.", Toast.LENGTH_LONG).show();
                            }
                            else {
                                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                                finish();
                            }
                        }
                    });
                }
                else {
                    Toast.makeText(LoginActivity.this, "Error occurred!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Go back to sign up page
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        if (mFirebaseUser != null){
            showDialog();
        }
    }

    //Shows message if the user is already logged in
    public void showDialog(){
        ActiveUserDialog activeUserDialog = new ActiveUserDialog();
        activeUserDialog.show(getSupportFragmentManager(), "");
    }
}
