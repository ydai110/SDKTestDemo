package com.test.sdk;

import android.app.Application;

import com.yahoo.search.nativesearch.NativeSearchSdk;
import com.yahoo.search.nativesearch.instrumentation.a;
import com.yahoo.search.nativesearch.instrumentation.b;
import com.yahoo.search.nativesearch.interfaces.ILogger;

import java.util.Map;

public final class AppClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        NativeSearchSdk.Initializer initializer = new NativeSearchSdk.Initializer(this);
        initializer.logger(new ILogger() {
            @Override
            public void setSpaceId(long l) {

            }

            @Override
            public void logEvent(String s, a a, Map<String, Object> map) {

            }

            @Override
            public void logEvent(String s, b b, a a, Map<String, Object> map) {

            }

            @Override
            public void logClickEvent(long l, Map<String, Object> map, Map<String, Object> map1) {

            }
        });
        initializer.initialize();
    }
}
