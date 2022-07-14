package com.ebrightmoon.ffmpeg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.ebrightmoon.ffmpeg.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'ffmpeg' library on application startup.


    private ActivityMainBinding binding;
    private FFmpegPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        player=new FFmpegPlayer();
        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(player.stringFromJNI());
    }


}