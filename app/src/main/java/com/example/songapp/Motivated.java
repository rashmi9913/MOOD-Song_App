package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Motivated extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motivated);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Believe In Me","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FBelieve%20In%20Me%20(Demi%20Lovato).mp3?alt=media&token=42f31e9f-7aeb-4c1a-bf44-671123e2310d"));
        jcAudios.add(JcAudio.createFromURL("Brave","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FBrave%20(Sara%20Bareilles).mp3?alt=media&token=c779c2f0-e583-4a7b-bb02-44997493bc4a"));
        jcAudios.add(JcAudio.createFromURL("Despacito","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FDespacito%20(Luis%20Fonsi%20ft.%20Daddy%20Yankee).mp3?alt=media&token=03dca104-1799-4187-aa89-3d8828bcf773"));
        jcAudios.add(JcAudio.createFromURL("Dynamite","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FDynamite.mp3?alt=media&token=18db909b-e85d-46b5-88c2-0d7a4d10324b"));
        jcAudios.add(JcAudio.createFromURL("Fight Song","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FFight%20Song%20(Rachel%20Platten).mp3?alt=media&token=8590f3cc-4bab-4d3d-bdda-34fd20da492f"));
        jcAudios.add(JcAudio.createFromURL("Kill Em With Kindness","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FKill%20Em%20With%20Kindness%20(Selena%20Gomez).mp3?alt=media&token=2b478a12-e2df-4a9c-b002-8774ec3cb312"));
        jcAudios.add(JcAudio.createFromURL("Live Like There s No Tomorrow","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FLive%20Like%20There%20s%20No%20Tomorrow%20(Selena%20Gomez).mp3?alt=media&token=b29f7244-d39d-49a0-9ef5-077e6b1fcdc3"));
        jcAudios.add(JcAudio.createFromURL("Stand By You","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FStand%20By%20You%20(Rachel%20Platten).mp3?alt=media&token=620347f9-d85b-47ea-ae1f-5cb1f3da7f55"));
        jcAudios.add(JcAudio.createFromURL("Try Everything","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FTry%20Everything%20(Shakira).mp3?alt=media&token=bd4f8716-c702-47cf-a1cb-2b46572a0179"));
        jcAudios.add(JcAudio.createFromURL("You ll Always Find Your Way Back Home","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Motivated%2FYou%20ll%20Always%20Find%20Your%20Way%20Back%20Home%20(Hannah%20Montana).mp3?alt=media&token=b7ba6302-1f39-4e5a-8178-1ccf37ad1704"));
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
