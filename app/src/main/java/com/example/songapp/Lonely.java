package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Lonely extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lonely);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Faded","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FFaded%20(Alan%20Walker).mp3?alt=media&token=9f46d7e7-0b4e-459c-a05e-e1c5845e2416"));
        jcAudios.add(JcAudio.createFromURL("Falling","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FFalling%20(Trevor%20Daniel).mp3?alt=media&token=607c06e9-0e51-4a6c-b109-11870cb56384"));
        jcAudios.add(JcAudio.createFromURL("Lonely","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FLonely%20(Justin%20Bieber%20ft.%20Benny%20Blanco).mp3?alt=media&token=015d9bd1-27d1-4ae8-bf1f-9d972d724e97"));
        jcAudios.add(JcAudio.createFromURL("Mercy","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FMercy%20(Shawn%20Mendes).mp3?alt=media&token=82b8bb2a-7181-4c5a-aede-266bf7c63068"));
        jcAudios.add(JcAudio.createFromURL("My Love","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FMy%20Love%20(Westlife).mp3?alt=media&token=0049cb9f-fd79-4f8a-8305-201d1d60eda1"));
        jcAudios.add(JcAudio.createFromURL("Talking To The Moon","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FTalking%20To%20The%20Moon%20(Bruno%20Mars).mp3?alt=media&token=d7f5528b-b61c-4de3-937c-b39b52e49eff"));
        jcAudios.add(JcAudio.createFromURL("The Heart Wants What It Wants","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FThe%20Heart%20Wants%20What%20It%20Wants%20(Selena%20Gomez).mp3?alt=media&token=20b05661-749d-4463-acad-279b170234ca"));
        jcAudios.add(JcAudio.createFromURL("Tis the damn season","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FTis%20the%20damn%20season%20(Taylor%20Swift).mp3?alt=media&token=c0233c48-29cc-419b-af9f-b6588a20cbfb"));
        jcAudios.add(JcAudio.createFromURL("We Don t Talk Anymore","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FWe%20Don%20t%20Talk%20Anymore%20(Charlie%20Puth%20ft.%20Selena%20Gomez).mp3?alt=media&token=d0fb8478-6a7b-4e38-97d0-34ef8e61402d"));
        jcAudios.add(JcAudio.createFromURL("Who","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Lonely%2FWho%20(Lauv%2C%20BTS).mp3?alt=media&token=0b820ddb-a71f-4e37-a0a1-3a4ff09b5072"));
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
