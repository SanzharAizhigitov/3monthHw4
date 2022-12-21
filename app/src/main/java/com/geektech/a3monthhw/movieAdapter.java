package com.geektech.a3monthhw;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class movieAdapter extends RecyclerView.Adapter<movieViewHolder> {
    ArrayList<movieModel> movieList;
movieItemClickListener clickListener;
    public movieAdapter(ArrayList<movieModel> movieList, movieItemClickListener clickListener) {
        this.movieList = movieList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public movieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new movieViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull movieViewHolder holder, int position) {
holder.bind(movieList.get(position).image, movieList.get(position).title, movieList.get(position).score, movieList.get(position).description);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
