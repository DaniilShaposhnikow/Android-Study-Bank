package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;

public class Bank_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
        setTitle(R.string.Otl);
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#5A5757")));
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#DAD3D3'>"+getResources().getString(R.string.Otl)+"</font>"));
    }
}