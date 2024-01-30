package com.jobspot.jobspot_admin;

public class PerusahaanRecyclerViewModel {

    private String namaPerusahaan;
    private String tentangPerusahaan;
    private String industriPerusahaan;
    private String alamatPerusahaan;
    private String dokumenPerusahaan;
    private String namaPendaftar;
    private String emailPendaftar;
    private String statusPerusahaan;

    public PerusahaanRecyclerViewModel(String namaPerusahaan, String tentangPerusahaan, String industriPerusahaan, String alamatPerusahaan, String dokumenPerusahaan, String namaPendaftar, String emailPendaftar, String statusPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
        this.tentangPerusahaan = tentangPerusahaan;
        this.industriPerusahaan = industriPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.dokumenPerusahaan = dokumenPerusahaan;
        this.namaPendaftar = namaPendaftar;
        this.emailPendaftar = emailPendaftar;
        this.statusPerusahaan = statusPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public String getTentangPerusahaan() {
        return tentangPerusahaan;
    }

    public String getIndustriPerusahaan() {
        return industriPerusahaan;
    }

    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }

    public String getDokumenPerusahaan() {
        return dokumenPerusahaan;
    }

    public String getNamaPendaftar() {
        return namaPendaftar;
    }

    public String getEmailPendaftar() {
        return emailPendaftar;
    }

    public String getStatusPerusahaan() {
        return statusPerusahaan;
    }
}
