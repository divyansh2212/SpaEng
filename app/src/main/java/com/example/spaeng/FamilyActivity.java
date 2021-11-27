package com.example.spaeng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("Father","Padre"));
        words.add(new Word("Mother","Madre"));
        words.add(new Word("Brother","Hermano"));
        words.add(new Word("Sister","Hermana"));
        words.add(new Word("Husband","Esposo"));
        words.add(new Word("Wife","Esposa"));
        words.add(new Word("GrandFather","Abuelo"));
        words.add(new Word("GrandMother","Abuela"));
        words.add(new Word("Son","Hijo"));
        words.add(new Word("Daughter","Hija"));

        WordAdapter items = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.family_list);
        listView.setAdapter(items);
    }
}