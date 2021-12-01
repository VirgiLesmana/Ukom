//package com.arghost.starkjaya;
//
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.arghost.starkjaya.Kategori;
//import com.bumptech.glide.Glide;
//
//import java.util.List;
//
//public class AdapterKategori extends RecyclerView.Adapter<AdapterKategori.MyViewHolder>{
//    List<Menu> mKategoriList;
//
//    public AdapterKategori(List<Menu> KategoriList) {
//        mKategoriList = KategoriList;
//    }
//
//    @Override
//    public MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
//        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sperpart_item_list, parent, false);
//        MyViewHolder mViewHolder = new MyViewHolder(mView);
//        return mViewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder (MyViewHolder holder,final int position){
////        holder.mTextViewId.setText("Id = " + mKategoriList.get(position).getIdkategori());
//        holder.mTextViewNama.setText("Nama = " + mKategoriList.get(position).getKategori());
//        holder.mTextViewNomor.setText("Nomor = " + mKategoriList.get(position).getMenu());
//        Glide.with(holder.itemView.getContext())
//                .load("" + mKategoriList.get(position).getGambar())
//                .into(holder.imgbarang);
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent mIntent = new Intent(view.getContext(), DetailProduk.class);
//                mIntent.putExtra("Id", mKategoriList.get(position).getIdkategori());
//                mIntent.putExtra("Nama", mKategoriList.get(position).getKategori());
//                mIntent.putExtra("Nomor", mKategoriList.get(position).getKategori());
//                view.getContext().startActivity(mIntent);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount () {
//        return mKategoriList.size();
//    }
//
//    public class MyViewHolder extends RecyclerView.ViewHolder {
//        TextView mTextViewId, mTextViewNama, mTextViewNomor, asa;
//
//        ImageView imgbarang;
//
//        public MyViewHolder(View itemView) {
//            super(itemView);
////            mTextViewId = (TextView) itemView.findViewById(R.id.tvId);
//            mTextViewNama = (TextView) itemView.findViewById(R.id.textNama);
//            mTextViewNomor = (TextView) itemView.findViewById(R.id.textharga);
//            imgbarang = (ImageView) itemView.findViewById(R.id.imgProduk);
//        }
//    }
//}
