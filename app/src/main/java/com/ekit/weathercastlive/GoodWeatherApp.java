package com.ekit.weathercastlive;

import android.app.Application;
import android.content.res.Configuration;

import com.ekit.weathercastlive.utils.LanguageUtil;
import com.ekit.weathercastlive.utils.PreferenceUtil;

public class GoodWeatherApp extends Application {

    private static final String TAG = "GoodWeatherApp";

    @Override
    public void onCreate() {
        super.onCreate();
        LanguageUtil.setLanguage(this, PreferenceUtil.getLanguage(this));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LanguageUtil.setLanguage(this, PreferenceUtil.getLanguage(this));
    }
}
