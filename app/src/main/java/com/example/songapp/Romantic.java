package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Romantic extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.romantic);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("10,000 Hours","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2F10%2C000%20Hours%20(Justin%20Bieber).mp3?alt=media&token=ba5aa5b3-1410-4ea6-9eb4-64a98ed0ff31"));
        jcAudios.add(JcAudio.createFromURL("Glass Brigde","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FGlass%20Brigde%20(Savina%20and%20Drones%20%26%20Terjemahan).mp3?alt=media&token=0f2af763-2566-4778-88e4-9bcab6caa5b0"));
        jcAudios.add(JcAudio.createFromURL("Lighting Up Your World","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FLighting%20Up%20Your%20World%20(Janett%20Suhh).mp3?alt=media&token=3ac46466-373e-4c2c-9f3a-fc253958d777"));
        jcAudios.add(JcAudio.createFromURL("Love So Fine","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FLove%20So%20Fine%20(Cha%20Eun%20Woo).mp3?alt=media&token=9e084199-5f35-4d81-bbf0-40a83a14998c"));
        jcAudios.add(JcAudio.createFromURL("Señorita","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FSe%C3%B1orita%20(Shawn%20Mendes%2C%20Camila%20Cabello).mp3?alt=media&token=7226b142-881d-4527-8baa-61c42566fcd5"));
        jcAudios.add(JcAudio.createFromURL("Something In Your Eyes","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FSomething%20In%20Your%20Eyes%20(Lirik).mp3?alt=media&token=3cc58999-e4aa-42a0-a814-8942549f1b94"));
        jcAudios.add(JcAudio.createFromURL("Sweet Night","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FSweet%20Night%20(BTS%20V).mp3?alt=media&token=e592fd2f-cf9d-438e-8620-f5c30d0f6598"));
        jcAudios.add(JcAudio.createFromURL("Take Me On","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FTake%20Me%20On%20(Saltnpaper).mp3?alt=media&token=490fdb0e-d82e-4360-b232-c4b3bc570827"));
        jcAudios.add(JcAudio.createFromURL("Wake Up","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FWake%20Up%20(Elaine).mp3?alt=media&token=05d71c56-25a5-4799-a19d-a9c7cae2c155"));
        jcAudios.add(JcAudio.createFromURL("With You","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Romantic%2FWith%20You%20(Fromm).mp3?alt=media&token=9fe5f44d-acbb-4175-9742-140dc00c29bf"));
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
