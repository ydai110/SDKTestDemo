package com.test.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yahoo.search.nativesearch.SearchSdkManager;
import com.yahoo.search.nativesearch.instrumentation.NSInstrumentationManager;
import com.yahoo.search.nativesearch.preference.NSPreferences;
import com.yahoo.search.nativesearch.ui.activity.SearchActivity;
import com.yahoo.search.nativesearch.util.PermissionUtils;

public class MainActivity extends Activity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SearchSdkManager.SettingsBuilder settingsBuilder = new SearchSdkManager.SettingsBuilder();
        settingsBuilder.setQueryString("ABC");
        SearchSdkManager.getInstance().startSearchActivity(this, settingsBuilder, 1);
    }

}
