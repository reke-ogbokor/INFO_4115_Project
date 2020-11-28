package com.info3245.project2.rooms;

import androidx.appcompat.app.AppCompatActivity;
import com.info3245.project2.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class KitchenActivity extends AppCompatActivity {
    Switch[] switches = new Switch[6];
    TextView[] textViews = new TextView[3];
    Button button;
    Integer active = 0;
    Integer inactive = 6;
    Integer kilowatthr = 50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        initializeSwitches();
        initializeTextViews();

        textViews[0].setText(active.toString());
        textViews[1].setText(inactive.toString());
        textViews[2].setText(kilowatthr.toString() + "kWh");


        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switches[0].setChecked(false);
                switches[1].setChecked(false);
                switches[2].setChecked(false);
                switches[3].setChecked(false);
                switches[4].setChecked(false);
                switches[5].setChecked(false);
            }
        });


        switches[0].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getBaseContext(), "Kettle On", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((++active).toString());
                    textViews[1].setText((--inactive).toString());
                    kilowatthr += 5;
                    textViews[2].setText(kilowatthr.toString() + "kWh");

                }
                else {
                    Toast.makeText(getBaseContext(), "Kettle Off", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((--active).toString());
                    textViews[1].setText((++inactive).toString());
                }
            }
        });

        switches[1].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getBaseContext(), "Fridge On", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((++active).toString());
                    textViews[1].setText((--inactive).toString());
                    kilowatthr += 50;
                    textViews[2].setText(kilowatthr.toString() + "kWh");
                }
                else {
                    Toast.makeText(getBaseContext(), "Fridge Off", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((--active).toString());
                    textViews[1].setText((++inactive).toString());
                }
            }
        });

        switches[2].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getBaseContext(), "Lights On", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((++active).toString());
                    textViews[1].setText((--inactive).toString());
                    kilowatthr += 20;
                    textViews[2].setText(kilowatthr.toString() + "kWh");
                }
                else {
                    Toast.makeText(getBaseContext(), "Lights Off", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((--active).toString());
                    textViews[1].setText((++inactive).toString());
                }
            }
        });

        switches[3].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getBaseContext(), "Oven On", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((++active).toString());
                    textViews[1].setText((--inactive).toString());
                    kilowatthr += 40;
                    textViews[2].setText(kilowatthr.toString() + "kWh");
                }
                else {
                    Toast.makeText(getBaseContext(), "Oven Off", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((--active).toString());
                    textViews[1].setText((++inactive).toString());
                }
            }
        });

        switches[4].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getBaseContext(), "Microwave On", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((++active).toString());
                    textViews[1].setText((--inactive).toString());
                    kilowatthr += 10;
                    textViews[2].setText(kilowatthr.toString() + "kWh");
                }
                else {
                    Toast.makeText(getBaseContext(), "Microwave Off", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((--active).toString());
                    textViews[1].setText((++inactive).toString());
                }
            }
        });

        switches[5].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    Toast.makeText(getBaseContext(), "Coffee Maker On", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((++active).toString());
                    textViews[1].setText((--inactive).toString());
                    kilowatthr += 20;
                    textViews[2].setText(kilowatthr.toString() + "kWh");
                }
                else {
                    Toast.makeText(getBaseContext(), "Coffee Maker Off", Toast.LENGTH_SHORT).show();
                    textViews[0].setText((--active).toString());
                    textViews[1].setText((++inactive).toString());
                }
            }
        });

    }

    private void initializeSwitches() {
        for (int i = 0; i < switches.length; i++) {
            switch (i) {
                case 0: switches[i] = findViewById(R.id.switch0);
                    break;

                case 1: switches[i] = findViewById(R.id.switch1);
                    break;

                case 2: switches[i] = findViewById(R.id.switch2);
                    break;

                case 3: switches[i] = findViewById(R.id.switch3);
                    break;

                case 4: switches[i] = findViewById(R.id.switch4);
                    break;

                case 5: switches[i] = findViewById(R.id.switch5);
                    break;
            }
        }
    }

    private void initializeTextViews() {
        for (int i = 0; i < textViews.length; i++) {
            switch (i) {
                case 0: textViews[i] = findViewById(R.id.textView0);
                    break;
                case 1: textViews[i] = findViewById(R.id.textView1);
                    break;
                case 2: textViews[i] = findViewById(R.id.kilowatthr);
                    break;
            }
        }
    }
}