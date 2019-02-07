package com.vektorlutfi.widgetdanintent;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog.Builder builder;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Belajar Membuat Quis Sederhana");

        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);
    }

    public void onRadioButton(View view) {
        Boolean centang = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton:
                if (centang)
                    jawabanSalah();
                break;

            case R.id.radioButton2:
                if (centang)
                    jawabanSalah();
                break;
            case R.id.radioButton3:
                if (centang)
                    tampilDialog();
                break;
            case R.id.radioButton4:
                if (centang)
                    jawabanSalah();
                break;
        }

    }

    public void tampilDialog() {

        builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setTitle("Selamat !!!");
        builder.setMessage("Jawaban anda benar : Bu Ais");
        builder.setPositiveButton("OKE", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Selamat", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("ULANGI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                radiogroup.clearCheck();
            }
        });

        builder.create().show();
    }



    public void jawabanSalah(){

        Toast.makeText(this, "Jawaban anda Salah", Toast.LENGTH_SHORT).show();

    }


}