package com.geektech.a3monthhw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Description extends AppCompatActivity {
TextView description;
TextView title;
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descriprion);
        description =findViewById(R.id.description_desc);
        title = findViewById(R.id.title_desc);
        image = findViewById(R.id.image_desc);
        description.setText(getIntent().getStringExtra(String.valueOf(description)));
        title.setText(getIntent().getStringExtra(String.valueOf(title)));
        image.setImageResource(getIntent().getIntExtra("src", -1));
    }
}