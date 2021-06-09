package com.example.sd6501;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileSettings extends AppCompatActivity {

    Button logoutButton;
    TextView usernameText;
    TextView passwordText;
    EditText changeUsername;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);

        toolbar = findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        logoutButton = findViewById(R.id.logout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileSettings.this, MainActivity.class);
                startActivity(intent);

                Toast.makeText(ProfileSettings.this, "Successfully logged out", Toast.LENGTH_SHORT).show();
            }
        });

        usernameText = findViewById(R.id.changeUsername);
        usernameText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder usernameChange = new AlertDialog.Builder(ProfileSettings.this);

                LayoutInflater inflater = getLayoutInflater();
                View profileUsername = inflater.inflate(R.layout.changeusernamepop, null);

                usernameChange.setView(profileUsername);
                usernameChange.show();




            }
        });

        passwordText = findViewById(R.id.changePassword);
        passwordText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder passwordChange = new AlertDialog.Builder(ProfileSettings.this);

                LayoutInflater inflater = getLayoutInflater();
                View profilePassword = inflater.inflate(R.layout.changepasswordpop, null);

                passwordChange.setView(profilePassword);
                passwordChange.show();
            }
        });
    }
}