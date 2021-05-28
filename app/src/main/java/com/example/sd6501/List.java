package com.example.sd6501;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

import static java.util.Collections.addAll;

public class List extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;
    Button addButton;
    EditText addTitle;
    Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        addTitle = findViewById(R.id.addText);
        addButton = findViewById(R.id.addButton);

        toolbar=(Toolbar)findViewById(R.id.listToolBar);
        setSupportActionBar(toolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        DbHandlerPrivateList db = new DbHandlerPrivateList(this);

        listView=(ListView)findViewById(R.id.myBookList);

        ArrayList<HashMap<String, String>> mangaList = db.GetManga();


        ArrayAdapter adapter = new ArrayAdapter<HashMap<String, String>>(List.this,
                R.layout.list_row, mangaList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                HashMap<String, String> manga = getItem(position);
                if (convertView == null){
                    convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);
                }
                TextView mangaTitleData = (TextView) convertView.findViewById(R.id.MangaTitleText);
                deleteButton = convertView.findViewById(R.id.deleteButton);

                deleteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        db.DeleteUser(Integer.parseInt(manga.get("id")));

                        ArrayList<HashMap<String, String>> mangaList = db.GetManga();                    // Refresh list
                        clear();
                        addAll(mangaList);
                        notifyDataSetChanged();
                    }
                });
                mangaTitleData.setText(manga.get("title"));
                return convertView;
            }
        };
        listView.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t;
                t=addTitle.getText().toString();
                db.InsertUserDetails(t);
                ArrayList<HashMap<String, String>> mangalist = db.GetManga();
                adapter.clear();
                adapter.addAll(mangalist);
                adapter.notifyDataSetChanged();
                addTitle.setText("");
                Toast.makeText(List.this, "Successfully added", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(List.this, Profile.class);
                //startActivity(intent);
            }
        });
    }
}