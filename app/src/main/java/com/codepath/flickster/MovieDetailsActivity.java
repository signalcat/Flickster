package com.codepath.flickster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.codepath.flickster.models.MovieDetails;

public class MovieDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        // Get bundled movie details data
        MovieDetails movie_details = (MovieDetails) getIntent().getSerializableExtra("movie_details");
        // Hook data with ui elements
        TextView tv_title = (TextView) findViewById(R.id.tv_title);
        TextView tv_popularity = (TextView) findViewById(R.id.tv_popularity);
        TextView tv_voteAverage = (TextView) findViewById(R.id.tv_vote_average);
        TextView tv_releaseDate = (TextView) findViewById(R.id.tv_release_date);

        tv_title.setText(movie_details.getTitle());
        tv_popularity.setText(movie_details.getPopularity());
        tv_voteAverage.setText(movie_details.getVoteAverage());
        tv_releaseDate.setText(movie_details.getReleaseDate());
    }
}
