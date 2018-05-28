package com.example.jokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by shaol on 5/26/2018.
 */

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String theJoke = getIntent().getStringExtra("joke");

        TextView textView = findViewById(R.id.jokeView);
        textView.setText(theJoke);
    }
}
