package com.example.switchactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Favorites extends AppCompatActivity {
    private Button Home;
    private Button Results;
    private Button Search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        Home = findViewById(R.id.favorite1);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favorites.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Results = findViewById(R.id.favorite3);
        Results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favorites.this, Results.class);
                startActivity(intent);
            }
        });
        Search = findViewById(R.id.favorite2);
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Favorites.this, Search.class);
                startActivity(intent);
            }
        });

    }
}