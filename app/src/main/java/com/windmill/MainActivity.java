package com.windmill;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.windmillview.WindMillView;

public class MainActivity extends AppCompatActivity {

    private WindMillView mWindMill;
    private Button mBtStart;
    private Button mBtStop;
    private WindMillView mWindMill2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWindMill = (WindMillView) findViewById(R.id.wm1);
        mWindMill2 = (WindMillView) findViewById(R.id.wm2);
        mBtStart = (Button) findViewById(R.id.bt_start);
        mBtStop = (Button) findViewById(R.id.bt_stop);

        mBtStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWindMill.startRotate();
                mWindMill2.startRotate();
            }
        });

        mBtStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWindMill.stop();
                mWindMill2.stop();
            }
        });
    }
}
