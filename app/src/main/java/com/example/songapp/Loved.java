package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Loved extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loved);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Bad Boy","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FBad%20Boy%20(Red%20Velvet).mp3?alt=media&token=9e0a4de2-a574-4e80-8e6e-a57a0996aa0c"));
        jcAudios.add(JcAudio.createFromURL("Feelings","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FFeelings%20(Lauv).mp3?alt=media&token=c8a6a808-d28a-4367-b3a6-d3a7747e75a4"));
        jcAudios.add(JcAudio.createFromURL("I See The Light","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FI%20See%20The%20Light%20(Tangled).mp3?alt=media&token=88482b9c-350a-4660-80d9-030b5f169f5c"));
        jcAudios.add(JcAudio.createFromURL("It’s You","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FIt%E2%80%99s%20You%20(%ED%97%A8%EB%A6%AC%20(Henry).mp3?alt=media&token=ebb61b4e-aa5f-498e-b18b-e15a9eb29ea3"));
        jcAudios.add(JcAudio.createFromURL("Love So Fine","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FLove%20So%20Fine%20(Cha%20Eun%20Woo).mp3?alt=media&token=5e5a61d4-b50f-4e83-af02-11029d436fdf"));
        jcAudios.add(JcAudio.createFromURL("Moments","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FMoments%20(Christopher).mp3?alt=media&token=6451865f-8629-4f1b-b8c3-04ce8be6084a"));
        jcAudios.add(JcAudio.createFromURL("Puppy Love","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FPuppy%20Love%20(Gani%20Ft.%20Nathania%20%26%20Harms).mp3?alt=media&token=6f3e26e9-eee8-4452-9437-19551c79fb45"));
        jcAudios.add(JcAudio.createFromURL("Some Things Never Change","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FSome%20Things%20Never%20Change%20(Frozen%202%20).mp3?alt=media&token=36285db6-e0c1-4223-93c6-dd0ba66e350e"));
        jcAudios.add(JcAudio.createFromURL("Winter Bear","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FWinter%20Bear%20(BTS%20V%20).mp3?alt=media&token=8b8da2c1-4887-43a3-937c-4efff12fbc18"));
        jcAudios.add(JcAudio.createFromURL("You Belong With Me","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Loved%2FYou%20Belong%20With%20Me%20(Taylor%20Swift).mp3?alt=media&token=9e069830-4740-4d49-b9d4-b9a38f36545d"));
        jcplayerView.initPlaylist(jcAudios, null);
        jcplayerView.createNotification();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jcplayerView.kill();
                finish();
            }
        });

    }
}
