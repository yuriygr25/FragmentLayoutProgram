package com.example.yura.fragmentlayoutprogram;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager mFragmentManager;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();

    }
    public void onClick(View v) {
        mFragmentTransaction = mFragmentManager.beginTransaction();
        switch (v.getId()) {
            case R.id.button1:
                BlueFragment bluefragment = new BlueFragment();
                mFragmentTransaction.add(R.id.container, bluefragment);
                break;
            case R.id.button2:
                RedFragment redfragment = new RedFragment();
                mFragmentTransaction.add(R.id.container, redfragment);
                break;
        }
        mFragmentTransaction.commit();

    }

}

