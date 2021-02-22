package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Positive extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.positive);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("A Brand New Day","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Positive%2FA%20Brand%20New%20Day%20(BTS).mp3?alt=media&token=a39a2036-3066-43b1-aac3-c5909d7063d7"));
        jcAudios.add(JcAudio.createFromURL("BELIEVE","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Positive%2FBELIEVE%20(The%20Song).mp3?alt=media&token=2c078d02-3c58-43b6-afcc-26e45ab3a629"));
        jcAudios.add(JcAudio.createFromURL("Fight Song","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Positive%2FFight%20Song%20(Rachel%20Platten).mp3?alt=media&token=4ecadf6f-6752-4c12-9e7f-ec631dc94566"));
        jcAudios.add(JcAudio.createFromURL("Let it Go","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Positive%2FLet%20it%20Go%20(Idina%20Menzel).mp3?alt=media&token=4bff2402-e7f4-4fc5-ad40-94eaab23ea09"));
        jcAudios.add(JcAudio.createFromURL("Life Goes On","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Positive%2FLife%20Goes%20On%20(BTS%20).mp3?alt=media&token=658ef56e-1082-4eb8-b3f8-7d86ba955825"));
        jcAudios.add(JcAudio.createFromURL("Make It Right","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Positive%2FMake%20It%20Right%20(BTS%20%26%20Lauv).mp3?alt=media&token=0e923842-a3d9-4dcf-9c23-08e727752249"));
        jcAudios.add(JcAudio.createFromURL("Tell Your Heart To Beat Again","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Positive%2FTell%20Your%20Heart%20To%20Beat%20Again%20(Danny%20Gokey).mp3?alt=media&token=d62d40d8-3563-4619-a205-276028aac2c6"));
        jcAudios.add(JcAudio.createFromURL("Try Everything","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Positive%2FTry%20Everything%20(Shakira).mp3?alt=media&token=83fa4111-bb40-4ced-98e3-dbbaa152e3da"));
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
