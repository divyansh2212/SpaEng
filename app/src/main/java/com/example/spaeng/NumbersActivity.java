package com.example.spaeng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("One","Uno",R.drawable.number_one));
        words.add(new Word("Two","Dos", R.drawable.number_two));
        words.add(new Word("Three","Tres",R.drawable.number_three));
        words.add(new Word("Four","Cuatro",R.drawable.number_four));
        words.add(new Word("Five","Cinco",R.drawable.number_five));
        words.add(new Word("Six","Seis",R.drawable.number_six));
        words.add(new Word("Seven","Siete",R.drawable.number_seven));
        words.add(new Word("Eight","Ocho",R.drawable.number_eight));
        words.add(new Word("Nine","Nueve",R.drawable.number_nine));
        words.add(new Word("Ten","Diez",R.drawable.number_ten));

//        for(int i=0; i < words.size(); i++)
//        {
//            LinearLayout rootview = findViewById(R.id.rootview);
//            TextView wordview = new TextView(this);
//            wordview.setText(words.get(i));
//            rootview.addView(wordview);
//        }
        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_numbers);

        ListView listView =  findViewById(R.id.numbers_list);

        listView.setAdapter(itemsAdapter);
    }
}