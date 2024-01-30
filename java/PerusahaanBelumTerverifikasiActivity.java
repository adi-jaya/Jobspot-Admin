package com.jobspot.jobspot_admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class PerusahaanBelumTerverifikasiActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<PerusahaanRecyclerViewModel> perusahaanRecyclerViewModelList;
    PerusahaanRecyclerViewAdapter perusahaanRecyclerViewAdapter;
    PerusahaanRecyclerViewModel perusahaanRecyclerViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perusahaan_belum_terverifikasi);

        recyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(PerusahaanBelumTerverifikasiActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        perusahaanRecyclerViewModelList = new ArrayList<>();

        String[] namaPerusahaanList = {"Dolor Group Inc.", "Sit Group Inc.",};
        String[] dokumenPerusahaanList = {"Dolor Group Inc. Doc.pdf", "Sit Group Inc. Doc.pdf"};
        String tentangPerusahaan = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet aut corporis dignissimos, earum necessitatibus perspiciatis repellat! Ad cum deserunt distinctio et expedita id impedit, labore nostrum officiis reiciendis vitae voluptatibus.";
        String industriPerusahaan = "IT & Telekomunikasi";
        String alamatPerusahaan = "Mountain View, California, Amerika Serikat";
        String namaPendaftar = "Adi Jaya";
        String emailPendaftar = "adijaya@gmail.com";
        String statusPerusahaan = "Belum Terverifikasi";

        for (int i = 0; i < namaPerusahaanList.length; ++i) {
            perusahaanRecyclerViewModel = new PerusahaanRecyclerViewModel(
                    namaPerusahaanList[i],
                    tentangPerusahaan,
                    industriPerusahaan,
                    alamatPerusahaan,
                    dokumenPerusahaanList[i],
                    namaPendaftar,
                    emailPendaftar,
                    statusPerusahaan
            );

            perusahaanRecyclerViewModelList.add(perusahaanRecyclerViewModel);
        }

        perusahaanRecyclerViewAdapter = new PerusahaanRecyclerViewAdapter(PerusahaanBelumTerverifikasiActivity.this, perusahaanRecyclerViewModelList);
        recyclerView.setAdapter(perusahaanRecyclerViewAdapter);
    }
}