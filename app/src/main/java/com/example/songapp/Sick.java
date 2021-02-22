package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Sick extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sick);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("All of Me","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sick%2FAll%20of%20Me%20(John%20Legend).mp3?alt=media&token=efe19304-8129-44a3-a7cc-15b9745b0823"));
        jcAudios.add(JcAudio.createFromURL("Happier","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sick%2FHappier%20(Ed%20Sheeran).mp3?alt=media&token=d1a295cf-6822-4015-bf67-440839fe8d13"));
        jcAudios.add(JcAudio.createFromURL("Lights","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sick%2FLights%20(BTS).mp3?alt=media&token=a5a957ec-a5e6-4871-8d0f-9f54c87777fd"));
        jcAudios.add(JcAudio.createFromURL("Moonchild","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sick%2FMoonchild%20(RM).mp3?alt=media&token=39ae9892-8ea6-415a-96e8-030aa880332d"));
        jcAudios.add(JcAudio.createFromURL("Sick Of Losing Soulmates","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sick%2FSick%20Of%20Losing%20Soulmates%20(Dodie).mp3?alt=media&token=c5d9f30d-c4d4-46d7-8fc9-f59c1c0298a1"));
        jcAudios.add(JcAudio.createFromURL("Winter Bear","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sick%2FWinter%20Bear%20(BTS%20V%20).mp3?alt=media&token=ccac8445-b1d0-4cfb-8117-c2ea809cbca2"));
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
