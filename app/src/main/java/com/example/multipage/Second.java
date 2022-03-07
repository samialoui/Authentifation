package com.example.multipage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    public Button btnBack;
    public String s1;
    public String s2;
    public TextView Txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnBack = findViewById(R.id.Back);
        Txt1 = findViewById(R.id.ContenuTextView);
        Intent data = getIntent();
        s1 = data.getExtras().getString("a1");
        s2 = data.getExtras().getString("a2");
        Txt1.setText(s1+s2);
        Toast.makeText(Second.this, s1+s2,Toast.LENGTH_LONG).show();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}