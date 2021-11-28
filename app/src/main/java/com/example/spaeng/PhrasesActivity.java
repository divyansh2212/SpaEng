package com.example.spaeng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Hello","Hola"));
        words.add(new Word("Goodbye","Adiós"));
        words.add(new Word("Please","Por favor"));
        words.add(new Word("Thank you","Gracias"));
        words.add(new Word("Sorry","Lo siento"));
        words.add(new Word("Yes","Si"));
        words.add(new Word("No","No"));
        words.add(new Word("Who?","¿Quién?"));
        words.add(new Word("What?","¿Qué?"));
        words.add(new Word("Where?","¿Dónde?"));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView items = findViewById(R.id.phrases_list);
        items.setAdapter(itemsAdapter);
    }
}