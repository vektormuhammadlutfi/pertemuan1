package com.vektorlutfi.input;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

        //Created by Fathur (okedroid.com)

public class MainActivity extends AppCompatActivity implements OnClickListener {
//mendeklarasikan variabel
        RadioGroup genderRadioGroup;
        EditText nama;
        EditText umur;
/** memanggil activity pertama dibuat*/
@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.nama);
        umur = (EditText) findViewById(R.id.umur);
        genderRadioGroup = (RadioGroup) findViewById(R.id.jeniskelamin);
        }

@Override
public void kirimData(View v) {
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
//Membuat obyek bundle
        Bundle b = new Bundle();

        //Menyisipkan tipe data String ke dalam obyek bundle
        b.putString("nama", nama.getText().toString());
        b.putString("umur", umur.getText().toString());
        int id = genderRadioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(id);
        b.putString("jeniskelamin", radioButton.getText().toString());

        //Menambahkan bundle intent
        intent.putExtras(b);

        //memulai Activity kedua
        startActivity(intent);
            }
        }
