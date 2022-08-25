package com.example.week1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void mainActivity(View view) {
        EditText userNameView=  findViewById(R.id.editText1);
        EditText passwordView=findViewById(R.id.editText2);
        String userName=userNameView.getText().toString();
        String password=passwordView.getText().toString();
        if(userName.equals("admin") && password.equals("admin123"))
        {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
        }




    }

    public void exit(View view) {
    }
}