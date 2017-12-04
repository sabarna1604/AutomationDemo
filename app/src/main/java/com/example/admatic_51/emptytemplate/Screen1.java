package com.example.admatic_51.emptytemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by Admatic-51 on 29-11-2017.
 */

public class Screen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen1);
 String name = getIntent().getStringExtra("name");


 TextView screen2_c1_textview1 = (TextView)findViewById(R.id.screen2_c1_textview1);
 screen2_c1_textview1.setText(name);
    }
}
