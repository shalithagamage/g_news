package com.shalithagamage.gnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ArticleActivity extends AppCompatActivity {

    TextView tvTitle,tvSource,tvDate,tvContent;
    ImageView imageView;
    ProgressBar loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        tvTitle = findViewById(R.id.tvTitle);
        tvSource = findViewById(R.id.tvSource);
        tvDate = findViewById(R.id.tvDate);
        tvContent = findViewById(R.id.tvDesc);

        imageView = findViewById(R.id.imageView2);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String source = intent.getStringExtra("source");
        String time = intent.getStringExtra("date");
        String contents = intent.getStringExtra("content");
        String image = intent.getStringExtra("image");

        tvTitle.setText(title);
        tvSource.setText(source);
        tvDate.setText(time);
        tvContent.setText(contents);

        Picasso.with(ArticleActivity.this).load(image).into(imageView);
    }
}