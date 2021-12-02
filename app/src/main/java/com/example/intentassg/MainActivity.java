package com.example.intentassg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText User,
     Password;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User = findViewById(R.id.User);
        Password = findViewById(R.id.Password);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(view -> {
            String p = User.getText().toString();
            String n = Password.getText().toString();
            if (p.equals("UNZA") && n.equals("786"))
            {
                Intent a = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(a);


            }
            else if (p.equals("") || n.equals("")) {
                Toast.makeText(getBaseContext(), "enter username and password both", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getBaseContext(), "Invalid Username and password", Toast.LENGTH_SHORT).show();
            }

        });


    }}