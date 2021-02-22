package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Bored extends AppCompatActivity{

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bored);

        btn = findViewById(R.id.btn);

        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        jcAudios.add(JcAudio.createFromURL("Best Song Ever","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FBest%20Song%20Ever%20(One%20Direction).mp3?alt=media&token=34fa2c11-744e-4293-8b3b-8c830b7b2017"));
        jcAudios.add(JcAudio.createFromURL("Don't Wanna Know","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FDon%20t%20Wanna%20Know%20(Maroon%205%20ft.%20Kendrick%20Lamar).mp3?alt=media&token=8c15c2dc-ac7e-4c38-9fa5-766fd9bccd01"));
        jcAudios.add(JcAudio.createFromURL("Girlfriend","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FGirlfriend%20(Avril%20Lavigne).mp3?alt=media&token=d5861297-ecf8-4c4a-9713-3acbdccce975"));
        jcAudios.add(JcAudio.createFromURL("If I Can't Have You","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FIf%20I%20Can%20t%20Have%20You%20(Shawn%20Mendes).mp3?alt=media&token=cdd73e74-6df8-401d-b0a6-8d50a966c237"));
        jcAudios.add(JcAudio.createFromURL("Lean On","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FLean%20On%20(Major%20Lazer%20%26%20DJ%20Snake%20ft.M%C3%98).mp3?alt=media&token=57a73b12-13e9-411e-bbd1-d610c73b77d9"));
        jcAudios.add(JcAudio.createFromURL("Marry You","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FMarry%20You%20(Bruno%20Mars).mp3?alt=media&token=52f718c4-5254-4493-810d-7b8171004ab1"));
        jcAudios.add(JcAudio.createFromURL("Savage Love [BTS Remix]","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FSavage%20Love%20(Laxed%20%E2%80%93%20Siren%20Beat)%20%5BBTS%20Remix%5D.mp3?alt=media&token=38cb2ef3-7f2e-412e-a7c3-65531e89e805"));
        jcAudios.add(JcAudio.createFromURL("Shape Of You","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FShape%20Of%20You%20(Ed%20Sheeran).mp3?alt=media&token=a73fe23c-12b8-409a-96a0-cd3f3cbc7df5"));
        jcAudios.add(JcAudio.createFromURL("Sweet but Psycho","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FSweet%20but%20Psycho%20(Ava%20Max).mp3?alt=media&token=2615f385-3094-4f3a-a46d-487dfc1ca1c0"));
        jcAudios.add(JcAudio.createFromURL("Treat You Better","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Bored%2FTreat%20You%20Better%20(Shawn%20Mendes).mp3?alt=media&token=8a77b9e2-8dd0-4155-bd64-be24d642f31f"));
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
