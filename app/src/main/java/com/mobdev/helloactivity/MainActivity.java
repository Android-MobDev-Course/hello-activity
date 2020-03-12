package com.mobdev.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Marco Picone (picone.m@gmail.com) 12/03/2020
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TextView myTextView = null;
    private Button myButton = null;
    private Context mContext = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate() method called !");

        //Set Activity Context
        this.mContext = this.getApplicationContext();

        //Init UI Components
        initUI();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() method called !");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() method called !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() method called !");
    }

    private void initUI() {

        //Load UI Components
        this.myTextView = this.findViewById(R.id.myTextView);
        this.myButton = this.findViewById(R.id.myButton);

        //Setup Button Listener
        this.myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Button Clicked !");
                myTextView.setText(mContext.getString(R.string.buttonClickedText));
            }
        });
    }
}
