package com.example.sd6501;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RatingBar;

public class Profile extends AppCompatActivity {

    Button button;
    Button button2;
    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    //RatingBar ratingBarA.setRating(4.14);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

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
}