package com.example.drive_safe;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.preference.PreferenceActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SettingsFragment  extends Fragment {

//
//    @Override
//    public void onCreateView(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Load the preferences from an XML resource
//        addPreferencesFromResource(R.xml.preferences);
//
//    }

    public SettingsFragment() {
        // Required empty public constructor
    }
    public static SettingsFragment newInstance() {

        Bundle args = new Bundle();

        SettingsFragment fragment = new SettingsFragment();
        fragment.setArguments(args);
        return fragment;
    }    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        @SuppressLint("ResourceType") View rootView = inflater.inflate(R.layout.fragment_settings, container, false);
        return rootView;
    }

}

//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Load the preferences from an XML resource
//        addPreferencesFromResource(R.xml.preferences);
//    }

