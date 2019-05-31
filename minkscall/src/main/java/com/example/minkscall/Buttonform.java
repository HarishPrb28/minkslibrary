package com.example.minkscall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aeps.aepslib.AepsActivity;

public class Buttonform extends AppCompatActivity {

    Button bttn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonform);

        bttn1=(Button)findViewById(R.id.bttn1);
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Buttonform.this, AepsActivity.class);
                startActivity(i);
            }
        });

    }
}
