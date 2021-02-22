package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mood extends AppCompatActivity {

    Button angry;
    Button bored;
    Button emotional;
    Button happy;
    Button lonely;
    Button loved;
    Button motivated;
    Button nervous;
    Button positive;
    Button romantic;
    Button sad;
    Button sick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mood);

        angry = findViewById(R.id.angry_btn);
        bored = findViewById(R.id.bored_btn);
        emotional = findViewById(R.id.emotional_btn);
        happy = findViewById(R.id.happy_btn);
        lonely = findViewById(R.id.lonely_btn);
        loved = findViewById(R.id.loved_btn);
        motivated = findViewById(R.id.motivated_btn);
        nervous = findViewById(R.id.nervous_btn);
        positive = findViewById(R.id.positive_btn);
        romantic = findViewById(R.id.romantic_btn);
        sad = findViewById(R.id.sad_btn);
        sick = findViewById(R.id.sick_btn);

        angry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Angry.class);
                startActivity(i);
            }
        });
        bored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Bored.class);
                startActivity(i);
            }
        });
        emotional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Emotional.class);
                startActivity(i);
            }
        });
        happy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Happy.class);
                startActivity(i);
            }
        });
        lonely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Lonely.class);
                startActivity(i);
            }
        });
        loved.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Loved.class);
                startActivity(i);
            }
        });
        motivated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Motivated.class);
                startActivity(i);
            }
        });
        nervous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Nervous.class);
                startActivity(i);
            }
        });
        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Positive.class);
                startActivity(i);
            }
        });
        romantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Romantic.class);
                startActivity(i);
            }
        });
        sad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Sad.class);
                startActivity(i);
            }
        });
        sick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Sick.class);
                startActivity(i);
            }
        });
    }
}
