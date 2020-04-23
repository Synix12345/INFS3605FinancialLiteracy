package com.example.infs3605financialliteracy.Models;


import android.widget.ImageView;

public class SavingsAccount {
    private ImageView icon;
    private double balance;
    private String name;
    private String id;

    public SavingsAccount(String newId, String newName, double balance){
        this.id = newId;
        this.name = newName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageView getIcon() {
        return icon;
    }

    public void setIcon(ImageView icon) {
        this.icon = icon;
    }
}
