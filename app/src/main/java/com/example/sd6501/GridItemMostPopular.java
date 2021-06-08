package com.example.sd6501;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GridItemMostPopular extends AppCompatActivity {

    TextView mangaTitle;
    ImageView mangaImage;
    TextView mangaDescriptions;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item_most_popular);

        toolbar = findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        mangaTitle = findViewById(R.id.mangaName);
        mangaImage = findViewById(R.id.mangaImage);
        mangaDescriptions = findViewById(R.id.mangaDescription);

        Intent intent = getIntent();
        mangaTitle.setText(intent.getStringExtra("mangaTitle"));
        mangaImage.setImageResource(intent.getIntExtra("mangaImage", 0));
        mangaDescriptions.setText(intent.getStringExtra("mangaDescriptions"));


    }
}