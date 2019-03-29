package com.example.pokemon.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.pokemon.R;

public class FirstPage extends AppCompatActivity {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int images[] = {R.drawable.pok_img, R.drawable.pok_img2,R.drawable.pok_img3};
        v_flipper = findViewById(R.id.v_flipper);

        for(int image: images){
            flipperImages(image);
        }



    }

    public void pokemon_list_activity(View view){
        // Create an Intent to start the second activity
        Intent randomIntent = new Intent(this, MainActivity.class);

        // Start the new activity.
        startActivity(randomIntent);
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        //Animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
