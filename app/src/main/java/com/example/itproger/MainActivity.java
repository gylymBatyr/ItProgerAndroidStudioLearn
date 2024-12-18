package com.example.itproger;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageButton kakashi_image, naruto_image;
    private MediaPlayer alert, windows_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kakashi_image = findViewById(R.id.kakashi_image);
        naruto_image = findViewById(R.id.naruto_image);

        alert = MediaPlayer.create(this, R.raw.red_alert);
        windows_start = MediaPlayer.create(this, R.raw.windows_xp_start);

        kakashi_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(alert, windows_start);
            }
        });

        naruto_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(windows_start, alert);
            }
        });

    }

    private void soundPlayButton(MediaPlayer sound1, MediaPlayer sound2){
        if(sound1.isPlaying()){
            sound1.pause();
            sound1.seekTo(0);
            sound1.setLooping(false);
        }

        if(sound2.isPlaying()){
            sound2.pause();
            sound2.seekTo(0);
            sound2.setLooping(false);
        }

        sound1.start();
        sound1.setLooping(true);
    }

}
