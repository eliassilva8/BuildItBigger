package com.eliassilva.jokedisplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class JokeDisplay extends AppCompatActivity {
    public static final String JOKE_EXTRA = "joke";
    String mJoke = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        if (getIntent().hasExtra(JOKE_EXTRA)) {
            mJoke = getIntent().getStringExtra(JOKE_EXTRA);
        }

        if (!TextUtils.isEmpty(mJoke)) {
            TextView jokeDisplay = findViewById(R.id.joke_display_tv);
            jokeDisplay.setText(mJoke);
        }
    }
}
