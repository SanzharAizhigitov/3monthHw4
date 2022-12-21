package com.geektech.a3monthhw;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class movieViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView score;
    TextView description;
    ImageView imageView;



    public movieViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title_tv);
        description = itemView.findViewById(R.id.description1);
        score = itemView.findViewById(R.id.score);
        imageView = itemView.findViewById(R.id.image_v);
    }
    public void bind(int image, String title1, String score1, String description1){
imageView.setImageResource(image);
description.setText(description1);
score.setText(score1);
title.setText(title1);
    }
}
