package com.example.my;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ab = findViewById(R.id.About);
        Button c = findViewById(R.id.Call);
        Button work = findViewById(R.id.WorkHours);
        Button pro = findViewById(R.id.pro);


        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ab = new Intent(MainActivity.this,about.class);
                startActivity(ab);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:8001288999"));
                startActivity(call);
            }
        });

        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "6:00 AM - 11:45 PM", Toast.LENGTH_SHORT).show();
            }
        });

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pro = new Intent(MainActivity.this,prod.class);
                startActivity(pro);
            }
        });




    }
}