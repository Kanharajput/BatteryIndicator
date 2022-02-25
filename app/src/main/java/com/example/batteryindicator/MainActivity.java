package com.example.batteryindicator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ImageView battery;
    private ImageButton mPlus;
    private ImageButton mMinus;
    private int battery_level = 0;     // to increase decrease battery level

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference the objects
        battery = findViewById(R.id.battery_indicator);
        mPlus = findViewById(R.id.plus_icon);
        mMinus = findViewById(R.id.minus_minus);
    }

    public void levelDown(View view) {

        if(battery_level != 7) {
            battery_level++;
            battery.setImageLevel(battery_level);
        }

        else {
            Snackbar.make(mMinus,"Battery is full", Snackbar.LENGTH_SHORT).show();
        }
    }

    public void levelUP(View view) {

        if(battery_level != 0) {
            battery_level--;
            battery.setImageLevel(battery_level);
        }

        else {
            Snackbar.make(mPlus,"Battery is Empty", Snackbar.LENGTH_SHORT).show();
        }
    }
}