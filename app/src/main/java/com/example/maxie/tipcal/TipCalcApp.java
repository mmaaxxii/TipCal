package com.example.maxie.tipcal;

import android.app.Application;

/**
 * Created by MaxiE on 1/6/2016.
 */
public class TipCalcApp extends Application{
    private final static String ABOUT_URL = "http://www.fb.com/maxiespeche";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
