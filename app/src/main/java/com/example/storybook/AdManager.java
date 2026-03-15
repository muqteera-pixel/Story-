package com.example.storybook;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;

public class AdManager {
    public static void initialize(Context context) {
        MobileAds.initialize(context, initializationStatus -> {});
    }
}
