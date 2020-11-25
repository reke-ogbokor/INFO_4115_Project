package com.info3245.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    TextView tvProgressLabel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // set a change listener on the SeekBar
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(seekBarChangeListener);

        final int progress = seekBar.getProgress();
        tvProgressLabel = findViewById(R.id.textView15);
        tvProgressLabel.setText("Temperature: " + progress);


        ImageButton kitchenBtn = (ImageButton) findViewById(R.id.imageKitchen);
        ImageButton readingBtn = (ImageButton) findViewById(R.id.imageRRRoom);
        ImageButton livingBtn = (ImageButton) findViewById(R.id.imageLRoom);
        ImageButton outsideBtn = (ImageButton) findViewById(R.id.imageOutside);


        kitchenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Kitchen.class));
            }
        });


        readingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ReadingRoom.class));
            }
        });


        livingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LivingRoom.class));
            }
        });


        outsideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Outside.class));
            }
        });



    }





    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            tvProgressLabel.setText("Temperature: " + progress);

            progress = seekBar.getProgress();
            tvProgressLabel.setText("Temperature: " + progress);

            if (progress > 20){

                ImageView img=(ImageView)findViewById(R.id.imageView4);
                img.setBackgroundResource(R.drawable.hotgif);
            }else if (progress > 15){

                ImageView img=(ImageView)findViewById(R.id.imageView4);
                img.setBackgroundResource(R.drawable.warmday);

            }else if (progress > 5){

                ImageView img=(ImageView)findViewById(R.id.imageView4);
                img.setBackgroundResource(R.drawable.mediumcold);

            }else {

                ImageView img=(ImageView)findViewById(R.id.imageView4);
                img.setBackgroundResource(R.drawable.cold2);

            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };
}