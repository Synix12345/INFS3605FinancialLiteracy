package com.example.infs3605financialliteracy.Activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.infs3605financialliteracy.Adapters.AccountAdapter;
import com.example.infs3605financialliteracy.Dialogs.SavingsInfoDialog;
import com.example.infs3605financialliteracy.Dialogs.UserDataDialog;
import com.example.infs3605financialliteracy.R;

public class SavingsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savings);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        showDialog();

        //Handles
        recyclerView = (RecyclerView)findViewById(R.id.accountrecycler);

        //Layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Adapter
//        mAdapter = new AccountAdapter(/** data set here **/);
//        recyclerView.setAdapter(mAdapter);
    }

    public void showDialog(){
        SavingsInfoDialog savingsInfoDialog = new SavingsInfoDialog();
        savingsInfoDialog.show(getSupportFragmentManager(),"");
    }
}
