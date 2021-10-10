package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textMain = (TextView) findViewById(R.id.textMain);
        Button BlueButton = (Button) findViewById(R.id.BlueButton);
        Button RedButton = (Button) findViewById(R.id.RedButton);
        Button YellowButton = (Button) findViewById(R.id.YellowButton);
        Button GreenButton = (Button) findViewById(R.id.GreenButton);
        BlueButton.setOnClickListener(this);
        RedButton.setOnClickListener(this);
        YellowButton.setOnClickListener(this);
        GreenButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.BlueButton){
            textMain.setTextColor(Color.parseColor("#082DF8"));
        }
        else if(view.getId() == R.id.RedButton){
            textMain.setTextColor(Color.parseColor("#F40B0B"));
        }
        else if(view.getId() == R.id.YellowButton){
            textMain.setTextColor(Color.parseColor("#D1BE16"));
        }
        else if(view.getId() == R.id.GreenButton){
            textMain.setTextColor(Color.parseColor("#F806850B"));
        }
    }
}