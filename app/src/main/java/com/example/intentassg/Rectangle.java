package com.example.intentassg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangle extends AppCompatActivity {
    private EditText txt1;
    private EditText txt2;
    private TextView ans;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        txt1=findViewById(R.id.editTextTextPersonName3);
        txt2=findViewById(R.id.editTextTextPersonName4);
        ans=findViewById(R.id.textView3);
        button=findViewById(R.id.button);
        button.setOnClickListener(v -> {
            int n1= Integer.parseInt(txt1.getText().toString());
            int n2= Integer.parseInt(txt2.getText().toString());
            int area= n1*n2;
            ans.setText(String.valueOf(area));

        });
    }
}