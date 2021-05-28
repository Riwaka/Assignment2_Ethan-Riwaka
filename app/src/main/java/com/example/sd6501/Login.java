package com.example.sd6501;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Toolbar tb;
    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tb = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(tb);

        Button button = (Button)findViewById(R.id.signUpButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, SignUp.class);
                startActivity(intent);
            }
        });

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        Name = (EditText)findViewById(R.id.userName);
        Password = (EditText)findViewById(R.id.password);
        Login = (Button)findViewById(R.id.loginButton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userID, String userPassword){
        if(("Demo".equals(userID)) && ("Password".equals(userPassword))){
            Intent intent= new Intent(Login.this, Profile.class);
            startActivity(intent);
        }else if("Demo".equals(userID)){
            Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT).show();
        }else if("Password".equals(userPassword)){
            Toast.makeText(this, "Incorrect Username", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Incorrect Username & Password", Toast.LENGTH_SHORT).show();
        }
    }
}