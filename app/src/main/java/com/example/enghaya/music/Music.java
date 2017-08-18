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
        // enter the button "if you click this button back to list"
        Button backmusic = (Button) findViewById(R.id.back3);
        setTitle("Music");
        //  this method for intent " open music class "
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