package com.example.sd6501;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;
import androidx.appcompat.widget.Toolbar;

public class Profile extends AppCompatActivity {

    Button button;
    Button button2;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        Button button2 = (Button)findViewById(R.id.home);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button button = (Button)findViewById(R.id.listButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, List.class);
                startActivity(intent);
            }
        });

        imageButton1 = (ImageButton)findViewById(R.id.recommend1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder recommended1 = new AlertDialog.Builder(Profile.this);

                LayoutInflater inflater = getLayoutInflater();
                View profile = inflater.inflate(R.layout.recommended1pop, null);

                recommended1.setView(profile);
                recommended1.show();

            }
        });

        imageButton2 = (ImageButton)findViewById(R.id.recommend2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder recommended2 = new AlertDialog.Builder(Profile.this);

                LayoutInflater inflater = getLayoutInflater();
                View profile = inflater.inflate(R.layout.recommended2pop, null);


                recommended2.setView(profile);
                recommended2.show();

            }
        });

        imageButton3 = (ImageButton)findViewById(R.id.recommend3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder recommended3 = new AlertDialog.Builder(Profile.this);

                LayoutInflater inflater = getLayoutInflater();
                View profile = inflater.inflate(R.layout.recommended3pop, null);

                recommended3.setView(profile);
                recommended3.show();

            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profilemenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.profileSettings:
                Intent profileSettings = new Intent(this, ProfileSettings.class);
                startActivity(profileSettings);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}