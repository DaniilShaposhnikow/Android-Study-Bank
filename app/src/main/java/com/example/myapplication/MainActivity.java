package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity
{
    private ImageView Dep_Bank; //Объявили переменную, класса ImageView
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dep_Bank = findViewById(R.id.dep_bank);
        Dep_Bank.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this,Bank_Activity.class);
                startActivity(intent);
            }
        });
    }
}