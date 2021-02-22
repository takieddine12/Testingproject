package com.dz.githubtestingproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO : This is Change from Part 1
        new TextView(this).setText("This is part 1 of code");
        new TextView(this).setText("I have added code from part 2");

    }
}