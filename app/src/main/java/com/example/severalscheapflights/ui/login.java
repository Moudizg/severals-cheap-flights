package com.example.severalscheapflights.ui;

import android.os.Bundle;
import com.example.severalscheapflights.R;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.severalscheapflights.databinding.ActivityLogin2Binding;

public class login extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityLogin2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLogin2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}