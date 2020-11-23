package com.info3245.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Outside extends AppCompatActivity {

    ImageView rrImage;
    ToggleButton rrChgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_room);

        rrChgBtn = findViewById(R.id.readDDBtn);

        rrChgBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rrImage = findViewById(R.id.imageView1);
                    rrImage.setImageResource(R.drawable.outsdideimage);

                } else {
                    rrImage = findViewById(R.id.imageView1);
                    rrImage.setImageResource(R.drawable.outsdideimagdark);

                }
            }
        });



    }
}