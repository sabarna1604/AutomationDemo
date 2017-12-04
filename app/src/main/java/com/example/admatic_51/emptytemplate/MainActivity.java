package com.example.admatic_51.emptytemplate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText screen1_c2_editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen1_c2_editText1 = (EditText)findViewById(R.id.screen1_c2_editText1) ;
            Button screen1_c8_button1 = (Button)findViewById(R.id.screen1_c8_button1);
           screen1_c8_button1.setOnClickListener(new View.OnClickListener() {
                @Override
                   public void onClick(View view) {
					   String name = screen1_c2_editText1.getText().toString();
                       Intent i = new Intent(MainActivity.this,Screen1.class);
					   i.putExtra("name",name);
                       startActivity(i);
	            }
        });

           






    }


}
