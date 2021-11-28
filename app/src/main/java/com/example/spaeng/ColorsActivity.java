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
        words.add(new Word("Red","Rojo",R.drawable.color_red));
        words.add(new Word("Yellow", "Amarillo",R.drawable.color_mustard_yellow));
        words.add(new Word("Green","Verde", R.drawable.color_green));
        words.add(new Word("Brown","Marrón",R.drawable.color_brown));
        words.add(new Word("Gray","Gris",R.drawable.color_gray));
        words.add(new Word("White","Blanco",R.drawable.color_white));
        words.add(new Word("Black","Negro",R.drawable.color_black));

        WordAdapter itemsadapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = findViewById(R.id.colors_list);

        listView.setAdapter(itemsadapter);
    }
}