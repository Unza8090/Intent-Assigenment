package com.example.intentassg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Square extends AppCompatActivity {
    private EditText txt1;

    private TextView ans;
    Button btt,button3;

    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        txt1=findViewById(R.id.editTextNumber);


        ans=findViewById(R.id.textView);
        btt=findViewById(R.id.btt);
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(v -> {
            Intent m= new Intent(Square.this,MainActivity2.class);
            startActivity(m);

        });
        btt.setOnClickListener(v -> {
            int n1= Integer.parseInt(txt1.getText().toString());

            int area= n1*n1;
            ans.setText(String.valueOf(area));

        });
    }

}


