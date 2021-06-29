package com.example.advinheonumero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Random r;
    private Button btnApostar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.r = new Random();

        btnApostar = (Button)findViewById(R.id.btnApostar);
        btnApostar.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        int random;
        String strRandom;

        random = this.r.nextInt(1000);
        strRandom = String.format("%03d", random);
        TextView myAwesomeTextView = (TextView)findViewById(R.id.textView);

        myAwesomeTextView.setText(strRandom);
    }
}