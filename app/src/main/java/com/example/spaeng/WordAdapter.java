package com.example.spaeng;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>
{
    private int mcolorResourceId;
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId)
    {
        super(context, 0,words);
        mcolorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView spanish = (TextView) listItemView.findViewById(R.id.spanishWord);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        spanish.setText(currentWord.getSpanishTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultenglish = (TextView) listItemView.findViewById(R.id.defaultWord);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultenglish.setText(currentWord.getDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.imageView);

        if(currentWord.hasImage())
            imageView.setImageResource(currentWord.getImageResourceId());
        else
            imageView.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mcolorResourceId);
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
