package com.example.intentassg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangle extends AppCompatActivity {
    private EditText txt1;
    private EditText txt2;
    private TextView ans;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        txt1=findViewById(R.id.editTextTextPersonName);
        txt2=findViewById(R.id.editTextTextPersonName2);
        ans=findViewById(R.id.textView2);
        button=findViewById(R.id.button2);
        button.setOnClickListener(v -> {
            int n1= Integer.parseInt(txt1.getText().toString());
            int n2= Integer.parseInt(txt2.getText().toString());
            int area= (n1*n2)/2;
            ans.setText(String.valueOf(area));

        });
    }
}