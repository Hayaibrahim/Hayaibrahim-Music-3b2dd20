package com.example.enghaya.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ENG.HAYA on 8/14/2017 AD.
 */

public class About extends AppCompatActivity{
//about class music Linked with about.xml
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.about);
        Button backabout = (Button) findViewById(R.id.back2);
        backabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backabout = new Intent(About.this,MainActivity.class);
                startActivity(backabout);
            }
        });
}
}


