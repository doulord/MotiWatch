package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopWatchAct extends AppCompatActivity {


    Button btnstart, btnstop;
    ImageView icanchort;
    Animation roundingalone;
    Chronometer timerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        btnstart = findViewById(R.id.btnstart);
        btnstop = findViewById(R.id.btnstop);
        icanchort = findViewById(R.id.icanchor);
        timerHere = findViewById(R.id.timerHere);


        btnstop.setAlpha(0);

        roundingalone = AnimationUtils.loadAnimation(this, R.anim.roundingalone);

    }

    {
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");

        btnstart.setTypeface(MMedium);
        btnstop.setTypeface(MMedium);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icanchort.startAnimation(roundingalone);
                btnstart.animate().alpha(0).setDuration(300).start();
                btnstop.animate().alpha(1).translationY(-80).setDuration(300).start();

                timerHere.setBase(SystemClock.elapsedRealtime());
                timerHere.start();

            }


        });





            }
        }





