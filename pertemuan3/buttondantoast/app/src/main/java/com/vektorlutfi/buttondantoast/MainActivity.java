package com.vektorlutfi.buttondantoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void simpleButton(View view) {
        Toast.makeText(getApplicationContext(),"Ini adalah button sederhana", Toast.LENGTH_LONG).show();
    }

    public void leftIconButton(View view) {
        Toast.makeText(getApplicationContext(),"Button dengan icon kiri", Toast.LENGTH_LONG).show();
    }

    public void rightIconButton(View view) {
        Toast.makeText(getApplicationContext(),"Button dengan icon kanan", Toast.LENGTH_LONG).show();
    }

    public void backgroundImageButton(View view) {
        Toast.makeText(getApplicationContext(),"Button dengan gambar", Toast.LENGTH_LONG).show();
    }

    public void borderButton(View view) {
        Toast.makeText(getApplicationContext(),"Button dengan border", Toast.LENGTH_LONG).show();
    }
}
