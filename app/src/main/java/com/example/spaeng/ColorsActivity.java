package com.example.spaeng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Red","Rojo"));
        words.add(new Word("Orange","Anaranjado"));
        words.add(new Word("Yellow", "Amarillo"));
        words.add(new Word("Green","Verde"));
        words.add(new Word("Blue","Azul"));
        words.add(new Word("Pink","Rosa"));
        words.add(new Word("White","Blanco"));
        words.add(new Word("Black","Negro"));

        WordAdapter itemsadapter = new WordAdapter(this,words);

        ListView listView = findViewById(R.id.colors_list);

        listView.setAdapter(itemsadapter);
    }
}