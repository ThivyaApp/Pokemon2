package com.example.pokemon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void pokemon_list_activity(View view){
        // Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, MainActivity.class);

        // Start the new activity.
        startActivity(randomIntent);
    }
}
