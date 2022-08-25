package com.example.week1;

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

    public void goToViewActivity(View view) {
        Intent intent =new Intent(this,ViewActivity.class);
        startActivity(intent);
    }

    public void goToViewGroupActivity(View view) {
        Intent intent =new Intent(this,ViewGroupsActivity.class);
        startActivity(intent);

    }

    public void goToLoginActivity(View view) {
        Intent intent =new Intent(this,LoginActivity.class);
        startActivity(intent);
    }
}