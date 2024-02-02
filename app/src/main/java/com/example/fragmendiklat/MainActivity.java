package com.example.fragmendiklat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity {
    private Button buttonOpen;
    private boolean isFragmentOpen = false;
    private int mChoice = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOpen = findViewById(R.id.button_open);
    }

    public void openFragment(View view) {
        if ((!isFragmentOpen)) {
            open();
        }else {
            close();
        }
    }
    public void open(){
        simpleFragment simpleFragment = com.example.fragmendiklat.simpleFragment.newInstance(mChoice);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment,simpleFragment)
                .addToBackStack(null).commit();
        isFragmentOpen = true;
        buttonOpen.setText("Close");
    }

    public void close(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        simpleFragment simpleFragment  = (simpleFragment) fragmentManager
                .findFragmentById(R.id.fragment);
        if(simpleFragment!=null){
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(simpleFragment).commit();
        }
        isFragmentOpen = false;
        buttonOpen.setText("Open");
    }
}