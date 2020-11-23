package com.info3245.project1;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CompoundButton;
        import android.widget.ImageView;
        import android.widget.ToggleButton;

public class Kitchen extends AppCompatActivity {

    ImageView ddImage;
    ToggleButton chgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        chgBtn = findViewById(R.id.dayDarkBtn);

        chgBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ddImage = findViewById(R.id.imageView);
                    ddImage.setImageResource(R.drawable.kitchen);

                } else {
                    ddImage = findViewById(R.id.imageView);
                    ddImage.setImageResource(R.drawable.kitchendark);

                }
            }
        });




    }
}