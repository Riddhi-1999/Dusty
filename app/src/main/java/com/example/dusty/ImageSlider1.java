package com.example.dusty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ImageSlider1 extends AppCompatActivity {

    //define the index and the array of imges
    int index = 0;
    int[] images = new int[] {R.drawable.image_one,R.drawable.image_two,R.drawable.image_three,R.drawable.image_four};
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider1);
    }


    public void Slide(View view) {

        //define the imageView Slide
        imageView = findViewById(R.id.image_slider);

        //change the Image When The Button Clcik
        //animation file is loaded which we have designed in anim folder
        Animation animationq = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_anim);
        imageView.startAnimation(animationq);
        imageView.setImageResource(images[index]);
        index++;

        //reset the index to 0
        if (index == images.length) {
            index = 0;
        }

    }
}

