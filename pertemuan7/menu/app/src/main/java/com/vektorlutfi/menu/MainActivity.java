package com.vektorlutfi.menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate dari menu; disini akan menambahkan item menu pada Actionbar
    getMenuInflater().inflate(R.menu.menu, menu);//Memanggil file bernama menu di folder menu
    return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()){
                case R.id.menu1:
                        Toast.makeText(getApplicationContext(),"Menu 1 dipilih",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.menu2:
                        Toast.makeText(getApplicationContext(),"Menu 2 dipilih",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.menu3:
                        Toast.makeText(getApplicationContext(),"Menu 3 dipilih",Toast.LENGTH_LONG).show();
                        return true;
                        case R.id.menu4:
                        Toast.makeText(getApplicationContext(),"Menu 4 dipilih",Toast.LENGTH_LONG).show();
                    return true;
                    default:
                    return super.onOptionsItemSelected(item);
            }
    }
}
