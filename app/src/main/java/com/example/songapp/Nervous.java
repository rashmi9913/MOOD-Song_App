package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Nervous extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nervous);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("21","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Nervous%2F21%20(Gracie%20Abrams).mp3?alt=media&token=b86d328f-b365-414a-8bf6-4aba6260ccb0"));
        jcAudios.add(JcAudio.createFromURL("Always, i ll care","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Nervous%2FAlways%2C%20i%20ll%20care%20(Jeremy%20Zucker).mp3?alt=media&token=3f366935-fa7a-47fa-a737-6b0b8042c3d0"));
        jcAudios.add(JcAudio.createFromURL("I Will Fear No More","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Nervous%2FI%20Will%20Fear%20No%20More%20(The%20Afters).mp3?alt=media&token=4227f304-126b-4530-b71f-7ac986d18c2b"));
        jcAudios.add(JcAudio.createFromURL("Well Done","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Nervous%2FWell%20Done%20(The%20Afters).mp3?alt=media&token=ef4ae5e2-ca10-4105-a825-459834bcaa18"));
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
