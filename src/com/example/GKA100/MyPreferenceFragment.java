package com.example.GKA100;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by andreas on 23.03.14.
 */
public class MyPreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
