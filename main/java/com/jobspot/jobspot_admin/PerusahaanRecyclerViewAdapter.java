package com.jobspot.jobspot_admin;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class PerusahaanRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private Context context;
    private List<PerusahaanRecyclerViewModel> perusahaanRecyclerViewModelList;

    public PerusahaanRecyclerViewAdapter(Context context, List<PerusahaanRecyclerViewModel> perusahaanRecyclerViewModelList) {
        this.context = context;
        this.perusahaanRecyclerViewModelList = perusahaanRecyclerViewModelList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.namaPerusahaanTextView.setText(perusahaanRecyclerViewModelList.get(position).getNamaPerusahaan());
        holder.industriPerusahaanTextView.setText(perusahaanRecyclerViewModelList.get(position).getIndustriPerusahaan());
        holder.namaPendaftarTextView.setText(perusahaanRecyclerViewModelList.get(position).getNamaPendaftar());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PerusahaanDetailActivity.class);

                intent.putExtra("namaPerusahaan", perusahaanRecyclerViewModelList.get(holder.getAdapterPosition()).getNamaPerusahaan());
                intent.putExtra("tentangPerusahaan", perusahaanRecyclerViewModelList.get(holder.getAdapterPosition()).getTentangPerusahaan());
                intent.putExtra("industriPerusahaan", perusahaanRecyclerViewModelList.get(holder.getAdapterPosition()).getIndustriPerusahaan());
                intent.putExtra("alamatPerusahaan", perusahaanRecyclerViewModelList.get(holder.getAdapterPosition()).getAlamatPerusahaan());
                intent.putExtra("dokumenPerusahaan", perusahaanRecyclerViewModelList.get(holder.getAdapterPosition()).getDokumenPerusahaan());
                intent.putExtra("namaPendaftar", perusahaanRecyclerViewModelList.get(holder.getAdapterPosition()).getNamaPendaftar());
                intent.putExtra("emailPendaftar", perusahaanRecyclerViewModelList.get(holder.getAdapterPosition()).getEmailPendaftar());
                intent.putExtra("statusPerusahaan", perusahaanRecyclerViewModelList.get(holder.getAdapterPosition()).getStatusPerusahaan());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return perusahaanRecyclerViewModelList.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {

    TextView namaPerusahaanTextView,
            industriPerusahaanTextView,
            namaPendaftarTextView;
    CardView cardView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        namaPerusahaanTextView = itemView.findViewById(R.id.namaPerusahaanTextView);
        industriPerusahaanTextView = itemView.findViewById(R.id.industriPerusahaanTextView);
        namaPendaftarTextView = itemView.findViewById(R.id.namaPendaftarTextView);
        cardView = itemView.findViewById(R.id.cardView);
    }
}
