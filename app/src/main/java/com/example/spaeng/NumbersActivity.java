package com.example.spaeng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One","Uno"));
        words.add(new Word("Two","Dos"));
        words.add(new Word("Three","Tres"));
        words.add(new Word("Four","Cuatro"));
        words.add(new Word("Five","Cinco"));
        words.add(new Word("Six","Seis"));
        words.add(new Word("Seven","Siete"));
        words.add(new Word("Eight","Ocho"));
        words.add(new Word("Nine","Nueve"));
        words.add(new Word("Ten","Diez"));

//        for(int i=0; i < words.size(); i++)
//        {
//            LinearLayout rootview = findViewById(R.id.rootview);
//            TextView wordview = new TextView(this);
//            wordview.setText(words.get(i));
//            rootview.addView(wordview);
//        }
        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}