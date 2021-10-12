package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;


import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.View;

public class Fragmentlife extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);


    }

    public void changefragment(View view) {
        Fragment fragment = new Fragment();
        if (view == findViewById(R.id.button)) {
            fragment = new FragmentOne();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentPlace, fragment);
            ft.commit();
        }
        if (view == findViewById(R.id.button2)) {
              fragment = new FragmentTwo();
            //  fragment = new Fragment();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentPlace, fragment);
            ft.commit();
        }
    }


}