package com.arghost.starkjaya;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BarangSayaAdapter extends RecyclerView.Adapter<BarangSayaAdapter.ViewHolder>{

    BarangData[] barangData;
    Context context;

    public BarangSayaAdapter(BarangData[] barangData,Produk produk) {
        this.barangData = barangData;
        this.context = produk;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.sperpart_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final BarangData barangDataList = barangData[position];
        holder.textViewNama.setText(barangDataList.getBarang());
        holder.textViewHarga.setText(barangDataList.getHargaBarang());
        holder.barangImage.setImageResource(barangDataList.getGambarBarang());
        holder.tvAlamat.setText(barangDataList.getAlamat());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailProduk.class);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return barangData.length;
    }


    public  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView barangImage;
        TextView textViewNama;
        TextView textViewHarga;
        TextView tvAlamat;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            barangImage = itemView.findViewById(R.id.imgbarang);
            textViewNama = itemView.findViewById(R.id.textNama);
            textViewHarga = itemView.findViewById(R.id.textharga);
            tvAlamat = itemView.findViewById(R.id.tvAlamat);


        }
    }
}
