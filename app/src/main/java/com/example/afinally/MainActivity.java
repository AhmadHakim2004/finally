package com.example.afinally;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void upEvents(View view) {
        Intent intent = new Intent(this, Scroll.class);
        intent.putExtra("ind", "up");
        startActivity(intent);
    }

    public void myEvents(View view) {
        Intent intent = new Intent(this, Scroll.class);
        intent.putExtra("ind", "my");
        startActivity(intent);
    }




}