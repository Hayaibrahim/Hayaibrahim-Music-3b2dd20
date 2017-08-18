package com.example.enghaya.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button Pay;
    EditText Amount;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pay = (Button) findViewById(R.id.Pay);
        Amount = (EditText) findViewById(R.id.Amount);

        Button music = (Button) findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Music.class);
                startActivity(i);
            }
        });
        Button abt = (Button) findViewById(R.id.about);
        abt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(MainActivity.this, About.class);
                startActivity(t);
            }
        });
        Button buy = (Button) findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(MainActivity.this, paymentAPI.class);
                startActivity(b);

            }
        });
    }
 }