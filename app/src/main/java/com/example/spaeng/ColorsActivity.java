package com.example.spaeng;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    private final MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Red","weṭeṭṭi",R.drawable.color_red, R.raw.color_red));
        words.add(new Word("Mustard Yellow", "chiwiiṭә",R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word("Green","chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("Brown","ṭakaakki",R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("Gray","ṭopoppi",R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("White","kelelli",R.drawable.color_white, R.raw.color_white));
        words.add(new Word("Black","kululli",R.drawable.color_black, R.raw.color_black));
        words.add(new Word("Dusty Yellow","ṭopiisә",R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));

        WordAdapter itemsadapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = findViewById(R.id.colors_list);

        listView.setAdapter(itemsadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word currentWord = words.get(i);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, currentWord.getAudioResourceId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
}