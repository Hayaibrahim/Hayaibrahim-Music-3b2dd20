package com.example.enghaya.music;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
/**
 * Created by ENG.HAYA on 8/17/2017 AD.
 */
public class paymentAPI extends AppCompatActivity {
    //payment class music Linked with payment.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);
        setTitle("paypal");
       // enter the button "if you click this button back to list"
        Button back = (Button) findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
          //  this method for intent "open payement class "
            @Override
            public void onClick(View v) {
                Intent back = new Intent(paymentAPI.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
    }
