package com.guageview.app.gudageviewnew;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;

import java.util.Random;


public class MainActivity extends Activity {

    private GaugeView mGaugeView;
    private final Random RAND = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGaugeView = (GaugeView) findViewById(R.id.gauge_view);
        mTimer.start();
        float a = mGaugeView.getScaleX();

    }

    private final CountDownTimer mTimer = new CountDownTimer(30000, 1000) {

        @Override
        public void onTick(final long millisUntilFinished) {
            mGaugeView.setTargetValue(RAND.nextInt(101));

            mGaugeView.setTargetWeight("80");
        }

        @Override
        public void onFinish() {
        }
    };


}
