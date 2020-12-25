package com.example.aplikasi_ikan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity{

    private ImageView Play;
    private MediaPlayer mediaPlayer;
    private LinearLayout suara1;
    private LinearLayout suara2;
    private LinearLayout suara3;
    private LinearLayout suara4;
    private LinearLayout suara5;
    private LinearLayout suara6;
    private LinearLayout suara7;
    private LinearLayout suara8;
    private LinearLayout suara9;
    private LinearLayout suara10;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suara1 = (LinearLayout) findViewById(R.id.suara1);
        suara2 = (LinearLayout) findViewById(R.id.suara2);
        suara3 = (LinearLayout) findViewById(R.id.suara3);
        suara4 = (LinearLayout) findViewById(R.id.suara4);
        suara5 = (LinearLayout) findViewById(R.id.suara5);
        suara6 = (LinearLayout) findViewById(R.id.suara6);
        suara7 = (LinearLayout) findViewById(R.id.suara7);
        suara8 = (LinearLayout) findViewById(R.id.suara8);
        suara9 = (LinearLayout) findViewById(R.id.suara9);
        suara10 = (LinearLayout) findViewById(R.id.suara10);

        suara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music.class);
                startActivity(suara1);
            }
        });

        suara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music2.class);
                startActivity(suara1);
            }
        });

        suara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music3.class);
                startActivity(suara1);
            }
        });

        suara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music4.class);
                startActivity(suara1);
            }
        });

        suara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music5.class);
                startActivity(suara1);
            }
        });

        suara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music6.class);
                startActivity(suara1);
            }
        });

        suara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music7.class);
                startActivity(suara1);
            }
        });

        suara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music8.class);
                startActivity(suara1);
            }
        });

        suara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music9.class);
                startActivity(suara1);
            }
        });

        suara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suara1 = new Intent(MainActivity.this, play_music10.class);
                startActivity(suara1);
            }
        });

    }


}