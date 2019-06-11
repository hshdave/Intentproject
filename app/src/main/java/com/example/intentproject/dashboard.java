package com.example.intentproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dashboard extends AppCompatActivity {

    String name,pass;
    TextView txt_nm,txt_ps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent i = getIntent();
         name = i.getStringExtra("un");
         pass = i.getStringExtra("ps");


         txt_nm = findViewById(R.id.txt_name);
         txt_ps = findViewById(R.id.txt_pass);

         txt_nm.setText(name);
         txt_ps.setText(pass);
    }
}
