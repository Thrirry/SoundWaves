package com.ev.gone.fubiz.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ev.gone.fubiz.R;

public class AlphaActivityOffline extends AppCompatActivity {

    Button on_line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_offline);




        on_line = (Button) findViewById(R.id.on_wifi);
        on_line.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent redirect = new Intent(AlphaActivityOffline.this, AlphaActivity.class);
//                timeCountInMilliSeconds
//                stopCountDownTimer();
                startActivityForResult(redirect,2);

            }
        });



    }
}
