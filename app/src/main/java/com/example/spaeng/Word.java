package com.example.spaeng;

import android.media.Image;

public class Word
{
    private String defaultTranslation;
    private String spanishTranslation;
    private int imageResourceId = -1;
    private int mAudioResourceId;

    public Word(String english, String spanish, int AudioResourceId)
    {
        mAudioResourceId = AudioResourceId;
        defaultTranslation = english;
        spanishTranslation = spanish;
    }
    public Word(String english, String spanish, int imageId, int AudioResourceId)
    {
        mAudioResourceId = AudioResourceId;
        defaultTranslation = english;
        spanishTranslation = spanish;
        imageResourceId = imageId;
    }
    public String getDefaultTranslation()
    {
        return defaultTranslation;
    }
    public String getSpanishTranslation()
    {
        return spanishTranslation;
    }
    public int getImageResourceId() {return imageResourceId;}
    public boolean hasImage()
    {
        return imageResourceId != -1;
    }
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
