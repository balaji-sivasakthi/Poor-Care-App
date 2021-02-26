package com.latrosoft.poorcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Home extends AppCompatActivity {
    private  RelativeLayout mDonate;
    private RelativeLayout mNGO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        mDonate = (RelativeLayout) findViewById(R.id.donate);
        mDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Home.this,Donate.class);
                startActivity(i);
            }
        });
    }
}