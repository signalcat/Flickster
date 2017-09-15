package com.codepath.flickster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MovieDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        MovieDetails moive_details = (MovieDetails) getIntent().getSerializableExtra("movie_details");
        TextView tv_popularity = (TextView) findViewById(R.id.tv_popularity);
        tv_popularity.setText(moive_details.getPopularity());
    }
}
