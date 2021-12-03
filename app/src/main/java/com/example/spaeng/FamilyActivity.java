package com.example.spaeng;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_family);

        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Father","әpә",R.drawable.family_father, R.raw.family_father));
        words.add(new Word("Mother","әṭa",R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("Older Brother","taachi",R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("Older Sister","teṭe",R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("Younger Brother","chalitti",R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("Younger Sister","kolliti",R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("GrandFather","paapa",R.drawable.family_grandfather, R.raw.family_grandfather));
        words.add(new Word("GrandMother","ama",R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("Son","angsi",R.drawable.family_son, R.raw.family_son));
        words.add(new Word("Daughter","tune",R.drawable.family_daughter, R.raw.family_daughter));

        WordAdapter items = new WordAdapter(this, words,R.color.category_family);
        ListView listView = findViewById(R.id.family_list);
        listView.setAdapter(items);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word currentWord = words.get(i);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, currentWord.getAudioResourceId());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
    private void releaseMediaPlayer()
    {
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
}}