package com.example.calculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_setting).setOnClickListener(view -> loadFragment(new SettingFragment()));
        findViewById(R.id.button_chat).setOnClickListener(view -> loadFragment(new ChatFragment()));
        findViewById(R.id.button_status).setOnClickListener(view -> loadFragment(new StatusFragment()));
    }

    private void loadFragment(Fragment fragment) {
        // Replace the fragment in the fragment_container with the selected fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

}