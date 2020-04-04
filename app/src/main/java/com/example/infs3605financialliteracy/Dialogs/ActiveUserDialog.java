package com.example.infs3605financialliteracy.Dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.infs3605financialliteracy.Activities.HomeActivity;
import com.example.infs3605financialliteracy.Activities.LoginActivity;
import com.example.infs3605financialliteracy.Activities.SignUpActivity;

public class ActiveUserDialog extends AppCompatDialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("You are already logged in! Would you like to move to the homepage?");
        builder.setNegativeButton("Sign Out", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(getContext(), SignUpActivity.class);
                i.putExtra("SIGN_OUT_REQUEST", "1");
                startActivity(i);
                getActivity().finish();
            }
        });
        builder.setPositiveButton("Go", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(getContext(), HomeActivity.class);
                startActivity(i);
            }
        });
        return builder.create();
    }


}
