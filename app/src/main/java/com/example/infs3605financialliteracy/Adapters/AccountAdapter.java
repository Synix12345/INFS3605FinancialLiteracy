package com.example.infs3605financialliteracy.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.infs3605financialliteracy.Activities.SavingsActivity;
import com.example.infs3605financialliteracy.Models.SavingsAccount;
import com.example.infs3605financialliteracy.R;

import java.text.NumberFormat;
import java.util.List;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.AccountViewHolder>{
    private List<SavingsAccount> mSavingsAccounts;
    private Context context;

    public AccountAdapter(List<SavingsAccount> mSavingsAccounts, SavingsActivity context) {
        this.mSavingsAccounts = mSavingsAccounts;
        this.context = context;
    }

    @NonNull
    @Override
    public AccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.savings_account,parent,false);

        return new AccountViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AccountViewHolder holder, int position) {
        SavingsAccount account = mSavingsAccounts.get(position);

        //bind account name
        holder.accName.setText(account.getName());

        //bind account balance
        NumberFormat defaultFormat  = NumberFormat.getCurrencyInstance();
        double bal = account.getBalance();
        holder.accBalance.setText(defaultFormat.format(bal));
    }

    @Override
    public int getItemCount() {
        return mSavingsAccounts.size();
    }


    public static class AccountViewHolder extends RecyclerView.ViewHolder {
        public TextView accName;
        public TextView accBalance;
        public ImageView accIcon;

        public AccountViewHolder(View v) {
            super(v);
            accName = (TextView)v.findViewById(R.id.accountname);
            accBalance = (TextView)v.findViewById(R.id.accountbalance);
            accIcon = (ImageView) v.findViewById(R.id.accounticon);
        }
    }
}
