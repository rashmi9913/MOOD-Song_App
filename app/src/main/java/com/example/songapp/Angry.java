package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Angry extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.angry);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Am I Supposed To Apologize","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FAm%20I%20Supposed%20To%20Apologize(Maria%20Mena).mp3?alt=media&token=d9ffa99a-ed19-4604-ad8f-d2f984a5431c"));
        jcAudios.add(JcAudio.createFromURL("Angry Too","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FLola%20Blanc-Angry%20Too.mp3?alt=media&token=7b8ebcb5-5a57-4308-bb96-7a2cc82551ef"));
        jcAudios.add(JcAudio.createFromURL("MIC Drop","https://drive.google.com/file/d/1UW5-x4yzhD0B1mRuzJaVNvXnCC9ryYsP/view?usp=sharing"));
        jcAudios.add(JcAudio.createFromURL("Nightmare","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FNightmare(Halsey).mp3?alt=media&token=8b70233e-0090-4e98-af5f-143f708e81c1"));
        jcAudios.add(JcAudio.createFromURL("Set It Off - Wolf In Sheep's Clothing","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FSet%20It%20Off%20-%20Wolf%20In%20Sheep's%20Clothing%20(feat.%20William%20Beckett).mp3?alt=media&token=384427c8-e8ae-40bc-adf6-11ff71dd93ba"));
        jcAudios.add(JcAudio.createFromURL("Sorry Not Sorry","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FSorry%20Not%20Sorry(Demi%20Lovato).mp3?alt=media&token=04fad5e2-03cd-470b-b0aa-7b3db79e5ce1"));
        jcAudios.add(JcAudio.createFromURL("SUGA's Interlude","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FHalsey%2C%20SUGA%20-%20SUGA's%20Interlude.mp3?alt=media&token=2938f24b-5989-492e-8ec5-31fe5eebbe38"));
        jcAudios.add(JcAudio.createFromURL("The Mad Hatter","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FThe%20Mad%20Hatter.mp3?alt=media&token=7c352f1e-b45a-460d-8f9f-d7489803000c"));
        jcAudios.add(JcAudio.createFromURL("Trying My Best","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FAnson%20Seabra%20-Trying%20My%20Best.mp3?alt=media&token=6000be70-5ad5-4c52-84aa-7de2e8479dc9"));
        jcAudios.add(JcAudio.createFromURL("Worthless","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Angry%2FEli-Worthless.mp3?alt=media&token=72c5c499-ab36-4a71-80ce-7fa2687c97ff"));
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
