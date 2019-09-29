package com.geovanedsilveira.netflixremake;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.geovanedsilveira.netflixremake.model.Category;
import com.geovanedsilveira.netflixremake.model.Movie;

import java.util.ArrayList;
import java.util.List;

import static androidx.recyclerview.widget.RecyclerView.*;

public class MainActivity extends AppCompatActivity {

    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view_main);

        List<Category> categories = new ArrayList<>();
        for (int j = 0; j < 10; j++) {
            Category category = new Category();
            category.setName("cat" + i);


            List<Movie> movies = new ArrayList<>();
            for (int i = 0; i < 30; i++) {
                Movie movie = new Movie();
                movie.setCoverUrl(R.drawable.movie);
                movies.add(movie);
            }

            category.setMovies(movies);
            categories.add(category);

        }

        mainAdapter = new MainAdapter(categories);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(mainAdapter);

    }

    private static class MovieHolder extends RecyclerView.ViewHolder {

        final ImageView imageViewCover;

        public MovieHolder(@NonNull View itemView){
            super(itemView);
             imageViewCover = itemView.findViewById(R.id.image_view_cover);
        }
    }

    private class MainAdapter extends RecyclerView.Adapter<MovieHolder>{

        private final List<Movie> movies;

        private MainAdapter(List<Movie> movies){

            this.movies = movies;
        }

        @NonNull
        @Override
        public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MovieHolder(getLayoutInflater().inflate(R.layout.movie_item, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull MovieHolder holder, int position) {
           Movie movie = movies.get(position);
           holder.imageViewCover.setImageResource (movie.getCoverUrl());
        }

        @Override
        public int getItemCount() {

            return movies.size();
        }
    }
}
