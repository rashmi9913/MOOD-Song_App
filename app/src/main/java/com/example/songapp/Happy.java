package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Happy extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.happy);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Baby","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FBaby%20(Justin%20Bieber%20%20ft.%20Ludacris).mp3?alt=media&token=99844f64-43f9-4696-936c-abd80615c38d"));
        jcAudios.add(JcAudio.createFromURL("Better When I'm Dancing","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FBetter%20When%20I%20m%20Dancing%20(Meghan%20Trainor).mp3?alt=media&token=b596f73c-615c-430f-8f33-20f8d7211677"));
        jcAudios.add(JcAudio.createFromURL("Can't stop the feeling","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FCan't%20stop%20the%20feeling%20%20(Justin%20Timberlake).mp3?alt=media&token=fa6be9f7-57cf-440b-8da1-a8b79e4d55a7"));
        jcAudios.add(JcAudio.createFromURL("Just The Way You Are","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FJust%20The%20Way%20You%20Are%20(Bruno%20Mars).mp3?alt=media&token=9bd15e78-dfad-4062-b045-54121abd90ed"));
        jcAudios.add(JcAudio.createFromURL("Kiki do you love me","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FKiki%20do%20you%20love%20me%20(Drake).mp3?alt=media&token=19a1a073-b20f-4d77-888a-e70611a2974d"));
        jcAudios.add(JcAudio.createFromURL("Let it Go","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FLet%20it%20Go%20(Idina%20Menzel).mp3?alt=media&token=2b178dd3-9c3b-4598-a702-cbb571614062"));
        jcAudios.add(JcAudio.createFromURL("One Way Or Another","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FOne%20Way%20Or%20Another%20(One%20Direction).mp3?alt=media&token=fd1597e7-95cd-4ec3-b6af-b268b78aa616"));
        jcAudios.add(JcAudio.createFromURL("Roar","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FRoar%20(Katy%20Perry).mp3?alt=media&token=a2800746-5ac3-4759-ad35-10328f8cb73c"));
        jcAudios.add(JcAudio.createFromURL("Some","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FSome%20(Bolbbalgan4).mp3?alt=media&token=3cda857a-79a4-4638-bd3a-ce3d4f7ba01a"));
        jcAudios.add(JcAudio.createFromURL("Stitches","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Happy%2FStitches%20(Shawn%20Mendes).mp3?alt=media&token=e68220bb-daf0-4a75-8f67-6d2d777bfa00"));
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
