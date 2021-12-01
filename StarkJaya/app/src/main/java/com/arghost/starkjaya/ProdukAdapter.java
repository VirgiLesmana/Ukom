package com.arghost.starkjaya;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class ProdukAdapter extends RecyclerView.Adapter<ProdukAdapter.ViewHolder>{
    List<Menu> menuList;

    public ProdukAdapter(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public ProdukAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sperpart_item_list, parent, false);
        ProdukAdapter.ViewHolder mViewHolder = new ProdukAdapter.ViewHolder(mView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProdukAdapter.ViewHolder holder, int position) {
        holder.tvNamaProduk.setText(menuList.get(position).getMenu());
        holder.tvHargaProduk.setText(String.valueOf(menuList.get(position).getHarga()));
        holder.tvAlamatToko.setText(menuList.get(position).getAlamat());
        Glide.with(holder.itemView.getContext())
                .load("" + menuList.get(position).getGambar())
                .into(holder.imgProduk);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), DetailProduk.class);
                mIntent.putExtra("namaProduk", menuList.get(position).getMenu());
                mIntent.putExtra("hargaProduk", menuList.get(position).getHarga());
                mIntent.putExtra("alamatToko", menuList.get(position).getAlamat());
                mIntent.putExtra("imgProduk", menuList.get(position).getGambar());

                view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvNamaProduk, tvHargaProduk, tvAlamatToko;
        ImageView imgProduk;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
            tvNamaProduk = itemView.findViewById(R.id.tvNamaProduk);
            tvHargaProduk = itemView.findViewById(R.id.tvHargaProduk);
            tvAlamatToko = itemView.findViewById(R.id.tvAlamatToko);
            imgProduk = itemView.findViewById(R.id.imgProduk);
        }
    }
}
