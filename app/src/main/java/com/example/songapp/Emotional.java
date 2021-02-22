package com.example.songapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Emotional extends AppCompatActivity {

    Button btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emotional);

        btn = findViewById(R.id.btn);

        JcPlayerView jcplayerView = findViewById(R.id.jcplayer);
        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("10,000 Hours","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2F10%2C000%20Hours%20(Justin%20Bieber).mp3?alt=media&token=ef61693a-424e-4baa-a860-b87992d27fc9"));
        jcAudios.add(JcAudio.createFromURL("Afterglow","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FAfterglow%20(Ed%20Sheeran).mp3?alt=media&token=90da250e-8cb1-4249-9f9d-5ce9ba3fac92"));
        jcAudios.add(JcAudio.createFromURL("Memories","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FMemories%20(Maroon%205).mp3?alt=media&token=f7397334-0e44-42b1-9ad9-ca6e57f8a342"));
        jcAudios.add(JcAudio.createFromURL("Old Friends","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FOld%20Friends%20(Ben%20Rector).mp3?alt=media&token=1ed8eeab-73d7-4943-9343-8ee849b1aa7f"));
        jcAudios.add(JcAudio.createFromURL("One Call Away","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FOne%20Call%20Away%20(Charlie%20Puth).mp3?alt=media&token=8c9f5593-d495-41e2-9e65-c8a3fc0581ab"));
        jcAudios.add(JcAudio.createFromURL("Perfect","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FPerfect%20(Ed%20Sheeran).mp3?alt=media&token=3d3070e5-2d60-4279-82b7-020843c82b2f"));
        jcAudios.add(JcAudio.createFromURL("Quite Miss Home","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FQuite%20Miss%20Home%20(James%20Arthur).mp3?alt=media&token=1da630d9-bc18-4a82-a3e4-66b67925349b"));
        jcAudios.add(JcAudio.createFromURL("See You Again","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FSee%20You%20Again%20(Charlie%20Puth).mp3?alt=media&token=c0823670-338f-47a3-8071-39e815a20062"));
        jcAudios.add(JcAudio.createFromURL("SORRY","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FSORRY%20(Halsey).mp3?alt=media&token=dbf6fb1c-cc16-4646-b795-f97d45b7ec36"));
        jcAudios.add(JcAudio.createFromURL("Story Of My Life","https://firebasestorage.googleapis.com/v0/b/online-music-player-3b35e.appspot.com/o/Emotional%2FStory%20Of%20My%20Life%20(One%20Direction).mp3?alt=media&token=d032c479-31c1-4a4f-8874-58129f83fc3d"));
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
