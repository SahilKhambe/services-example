package com.example.servicesexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById( R.id.startButton );
        stop = findViewById(R.id.stopButton);

        start.setOnClickListener( this );
        stop.setOnClickListener( this );

    }

    @Override
    public void onClick(View v) {

        if(v == start){

            // starting the service
            startService(new Intent( this, ServiceClass.class ) );
        }
        else if (v == stop){

            // stopping the service
            stopService(new Intent( this, ServiceClass.class ) );

        }

    }
}