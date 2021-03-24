package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda2);
    }

    public void abreSplashActivity2(View View) {
        Intent intent = new Intent(this, SplashActivity2.class);
        startActivity(intent);
    }

    public void abreMainActivity(View View) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}