package com.geektech.a3monthhw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements movieItemClickListener{
RecyclerView movieRW;
ArrayList<movieModel> movieList = new ArrayList<>();
movieAdapter movieAdapter = new movieAdapter(movieList, this);
movieViewHolder movieViewHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieRW = findViewById(R.id.movie_rv);
        loadMovie();
        movieRW.setAdapter(movieAdapter);
    }
    public void loadMovie(){
        movieList.add(new movieModel(R.drawable.img, "Мультик про ученого и его внука", "9/10", "Rick and morty"));
        movieList.add(new movieModel(R.drawable.img2, "Мультик про корпорацию заговор", "7/10", "Inside job"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));
        movieList.add(new movieModel(R.drawable.img3, "Мультик про круглых животных", "8/10", "Смешарики"));

    }

    @Override
    public void onClickItem(movieModel movieModel) {
        Intent intent = new Intent(MainActivity.this, Description.class);
        intent.putExtra("title", movieModel.title);
        intent.putExtra("description", movieModel.description);
        intent.putExtra("src", movieModel.image);
        startActivity(intent);
    }
}