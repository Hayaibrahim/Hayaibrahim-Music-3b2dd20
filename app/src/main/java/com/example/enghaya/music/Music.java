package com.example.enghaya.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ENG.HAYA on 8/13/2017 AD.
 */

public class Music extends AppCompatActivity {
//Music class Linked with music.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        Button backmusic = (Button) findViewById(R.id.back3);
        backmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backmusic = new Intent(Music.this,MainActivity.class);
                startActivity(backmusic
                );
            }
        });
}
}