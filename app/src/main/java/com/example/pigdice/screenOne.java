package com.example.pigdice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screenOne extends AppCompatActivity {
    private Button vscomp;
    private Button snglPlyr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_one);
        vscomp=(Button)findViewById(R.id.button);
        snglPlyr=(Button)findViewById(R.id.button2);
        vscomp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(screenOne.this,vscomputer.class));
            }
        });
        snglPlyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(screenOne.this,singleplayer.class));
            }
        });

    }
}

