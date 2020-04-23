package com.example.infs3605financialliteracy.Adapters;

import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.AccountViewHolder>{
    private String[] mDataset;

    @NonNull
    @Override
    public AccountViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AccountViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public static class AccountViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public AccountViewHolder(TextView v) {
            super(v);
            textView = v;
        }
    }

    public AccountAdapter (String[] myDataset){
        mDataset = myDataset;
    }
}
