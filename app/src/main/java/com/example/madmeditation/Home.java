package com.example.madmeditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    ImageView ico;
    ImageButton m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ico = (ImageView) findViewById(R.id.ico_profile);
        m = (ImageButton) findViewById(R.id.parametrs);

        ico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Home.this, Profile.class);
                startActivity(intent);
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Home.this, Menu.class);
                startActivity(intent);
            }
        });
    }
}