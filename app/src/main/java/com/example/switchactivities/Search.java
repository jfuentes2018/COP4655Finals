package com.example.switchactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Search extends AppCompatActivity {
    private Button Home;
    private Button Results;
    private Button Favorites;
    private EditText EditTerms;
    private EditText EditLocation;
    private String Term;
    private String Location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        EditTerms = (EditText) findViewById(R.id.Term);
        EditLocation =(EditText) findViewById(R.id.Location);




        Home = findViewById(R.id.search2);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Results = findViewById(R.id.search3);
        Results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, Results.class);
                startActivity(intent);
            }
        });
        Favorites = findViewById(R.id.search1);
        Favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, Favorites.class);
                startActivity(intent);
            }
        });
    }
}