package com.vektorlutfi.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void klikMe(View view) {
        Intent belajar_intent = new
                Intent(MainActivity.this,SecondActivity.class);
        startActivity(belajar_intent);
    }

}
