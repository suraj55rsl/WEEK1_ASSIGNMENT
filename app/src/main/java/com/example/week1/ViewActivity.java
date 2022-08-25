package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ViewActivity extends AppCompatActivity {
     static int color=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
    }

    public void changeColor(View view) {
        ImageView imageView=findViewById(R.id.imageView);
        color=(color)%2;
        color++;
        if(color==0)
        {
            imageView.setColorFilter(Color.GRAY);
        }
        else
        {
            imageView.setColorFilter(Color.BLUE);
        }

    }
}