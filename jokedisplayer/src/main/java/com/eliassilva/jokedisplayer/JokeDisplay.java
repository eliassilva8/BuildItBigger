package com.eliassilva.jokedisplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplay extends AppCompatActivity {
    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        String joke = getIntent().getStringExtra(JOKE_EXTRA);

        TextView jokeDisplay = findViewById(R.id.joke_display_tv);
        jokeDisplay.setText(joke);
    }
}
