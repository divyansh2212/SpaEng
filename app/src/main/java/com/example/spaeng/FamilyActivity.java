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
        words.add(new Word("Father","Padre",R.drawable.family_father));
        words.add(new Word("Mother","Madre",R.drawable.family_mother));
        words.add(new Word("Older Brother","Hermano mayor",R.drawable.family_older_brother));
        words.add(new Word("Older Sister","Hermana mayor",R.drawable.family_older_sister));
        words.add(new Word("Younger Brother","Hermano menor",R.drawable.family_younger_brother));
        words.add(new Word("Younger Sister","Hermana menor",R.drawable.family_younger_sister));
        words.add(new Word("GrandFather","Abuelo",R.drawable.family_grandfather));
        words.add(new Word("GrandMother","Abuela",R.drawable.family_grandmother));
        words.add(new Word("Son","Hijo",R.drawable.family_son));
        words.add(new Word("Daughter","Hija",R.drawable.family_daughter));

        WordAdapter items = new WordAdapter(this, words,R.color.category_family);
        ListView listView = findViewById(R.id.family_list);
        listView.setAdapter(items);
    }
}