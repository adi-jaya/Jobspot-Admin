package com.jobspot.jobspot_admin;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class PerusahaanDetailActivity extends AppCompatActivity {

    TextView namaPerusahaanTextView,
            tentangPerusahaanTextView,
            industriPerusahaanTextView,
            alamatPerusahaanTextView,
            dokumenPerusahaanTextView,
            namaPendaftarTextView,
            emailPendaftarTextView;

    Button actionButton1, actionButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perusahaan_detail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        setContentToActivity();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    public void setContentToActivity() {
        namaPerusahaanTextView = findViewById(R.id.detailNamaPerusahaanTextView);
        tentangPerusahaanTextView = findViewById(R.id.detailTentangPerusahaanTextView);
        industriPerusahaanTextView = findViewById(R.id.detailIndustriPerusahaanTextView);
        alamatPerusahaanTextView = findViewById(R.id.detailAlamatPerusahaanTextView);
        dokumenPerusahaanTextView = findViewById(R.id.detailDokumenPerusahaanTextView);
        namaPendaftarTextView = findViewById(R.id.detailNamaPendaftarTextView);
        emailPendaftarTextView = findViewById(R.id.detailEmailPendaftarTextView);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            namaPerusahaanTextView.setText(bundle.getString("namaPerusahaan"));
            tentangPerusahaanTextView.setText(bundle.getString("tentangPerusahaan"));
            industriPerusahaanTextView.setText(bundle.getString("industriPerusahaan"));
            alamatPerusahaanTextView.setText(bundle.getString("alamatPerusahaan"));
            dokumenPerusahaanTextView.setText(bundle.getString("dokumenPerusahaan"));
            namaPendaftarTextView.setText(bundle.getString("namaPendaftar"));
            emailPendaftarTextView.setText(bundle.getString("emailPendaftar"));

            setActionButton(bundle.getString("statusPerusahaan"));

            // Set Activity title
            this.setTitle(bundle.getString("namaPerusahaan"));
        }
    }

    public void showDokumenPerusahaan(View view) {
        Toast.makeText(this, "Membuka Dokumen", Toast.LENGTH_SHORT).show();
    }

    public void setActionButton(String statusPerusahaan) {
        actionButton1 = findViewById(R.id.actionButton1);
        actionButton2 = findViewById((R.id.actionButton2));

        switch (statusPerusahaan) {
            case "Terverifikasi":
                setActionButtonTerverifikasi();
                break;
            case "Belum Terverifikasi":
                setActionButtonBelumTerverifikasi();
                break;
            case "Diblokir":
                setActionButtonDiblokir();
                break;
        }
    }

    public void setActionButtonTerverifikasi() {
        actionButton1.setVisibility(View.VISIBLE);
        actionButton2.setVisibility(View.INVISIBLE);

        actionButton1.setBackgroundColor(Color.parseColor("#FA0404"));
        actionButton1.setText("Blokir");
    }

    public void setActionButtonBelumTerverifikasi() {
        actionButton1.setVisibility(View.VISIBLE);
        actionButton2.setVisibility((View.VISIBLE));

        actionButton1.setBackgroundColor(Color.parseColor("#00E100"));
        actionButton2.setBackgroundColor(Color.parseColor("#FA0404"));

        actionButton1.setText("Verifikasi");
        actionButton2.setText("Tolak");
    }

    public void setActionButtonDiblokir() {
        actionButton1.setVisibility(View.VISIBLE);
        actionButton2.setVisibility(View.INVISIBLE);

        actionButton1.setBackgroundColor(Color.parseColor("#00E100"));
        actionButton1.setText("Buka");
    }
}