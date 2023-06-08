package com.aplikasi.sweetbaker;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.aplikasi.sweetbaker.databinding.ActivityTransaksiBinding;

public class transaksi extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityTransaksiBinding binding;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);
    }
}