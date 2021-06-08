package com.example.sd6501;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ProfileSettings extends AppCompatActivity {

    Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);
        logoutButton = findViewById(R.id.logout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileSettings.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(ProfileSettings.this, "Successfully logged out", Toast.LENGTH_SHORT).show();
            }
        });
    }
}