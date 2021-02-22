package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Sad extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sad);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("A Little Braver","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FA%20Little%20Braver%20(New%20Empire).mp3?alt=media&token=be7becdd-2865-48c0-93f8-f5aff7dc008e"));
        jcAudios.add(JcAudio.createFromURL("Broken parts","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FBroken%20parts%20(clide).mp3?alt=media&token=144acde2-7363-43f9-9c1e-409e3026113b"));
        jcAudios.add(JcAudio.createFromURL("I Wanna Grow Old With You","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FI%20Wanna%20Grow%20Old%20With%20You%20(Westlife).mp3?alt=media&token=65404b53-e7a5-4556-8ace-08766b4038e9"));
        jcAudios.add(JcAudio.createFromURL("No way out","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FNo%20way%20out%20(Phil%20Collins).mp3?alt=media&token=ab0751be-8ec1-4d2b-bf06-02e79be722bc"));
        jcAudios.add(JcAudio.createFromURL("Pray","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FPray%20(Klang).mp3?alt=media&token=fc13e49d-397f-46a6-b389-11b205f555db"));
        jcAudios.add(JcAudio.createFromURL("See You Again","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FSee%20You%20Again%20(Charlie%20Puth).mp3?alt=media&token=81b50c0b-9dce-437c-bddb-064aa8da1932"));
        jcAudios.add(JcAudio.createFromURL("Still Fighting It","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FStill%20Fighting%20It%20(Lee%20Chan%20Sol).mp3?alt=media&token=2c821ca7-c997-469d-828c-c3dc6b8b4c48"));
        jcAudios.add(JcAudio.createFromURL("The Next Right Thing","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FThe%20Next%20Right%20Thing%20(Kristen%20Bell).mp3?alt=media&token=8d87df8a-9460-494a-9f10-67464bd6fb64"));
        jcAudios.add(JcAudio.createFromURL("The Truth Untold","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FThe%20Truth%20Untold%20(BTS%20%20ft.%20Steve%20Aoki).mp3?alt=media&token=3e984a06-7134-40e8-b580-837fba23e8d5"));
        jcAudios.add(JcAudio.createFromURL("We The Kings","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Sad%2FWe%20The%20Kings%20(Sad%20Song%20ft.%20Elena%20Coats).mp3?alt=media&token=f1dca5bb-430d-4533-a932-a49434012ab4"));
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
