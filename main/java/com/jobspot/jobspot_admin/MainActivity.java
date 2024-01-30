package com.jobspot.jobspot_admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPerusahaanTerverifikasi(View view) {
        intent = new Intent(MainActivity.this, PerusahaanTerverifikasiActivity.class);
        startActivity(intent);
    }

    public void showPerusahaanBelumTerverifikasi(View view) {
        intent = new Intent(MainActivity.this, PerusahaanBelumTerverifikasiActivity.class);
        startActivity(intent);
    }

    public void showPerusahaanDiblokir(View view) {
        intent = new Intent(MainActivity.this, PerusahaanDiblokirActivity.class);
        startActivity(intent);
    }
}