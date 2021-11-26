package com.example.spaeng;

public class Word
{
    private String defaultTranslation;
    private String spanishTranslation;

    public Word(String english, String spanish)
    {
        defaultTranslation = english;
        spanishTranslation = spanish;
    }
    public String getDefaultTranslation()
    {
        return defaultTranslation;
    }
    public String getSpanishTranslation()
    {
        return spanishTranslation;
    }
}
