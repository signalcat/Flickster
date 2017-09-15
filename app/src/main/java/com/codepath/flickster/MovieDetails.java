package com.codepath.flickster;

import java.io.Serializable;

/**
 * Created by hezhang on 9/15/17.
 */

public class MovieDetails implements Serializable {
    private String popularity;

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }
}
