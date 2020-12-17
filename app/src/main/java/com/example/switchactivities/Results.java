package com.example.switchactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Results extends AppCompatActivity {
    private Button search;
    private Button Home;
    private Button Favorites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);



        search = findViewById(R.id.results3);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Results.this, Search.class);
                startActivity(intent);
            }
        });
        Home = findViewById(R.id.results2);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Results.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Favorites = findViewById(R.id.results1);
        Favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Results.this, Favorites.class);
                startActivity(intent);
            }
        });
    }
}