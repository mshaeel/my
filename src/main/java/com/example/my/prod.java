package com.example.my;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class prod extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prodc);

    }
    public void back(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
