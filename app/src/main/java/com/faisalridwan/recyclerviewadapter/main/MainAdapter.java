package com.faisalridwan.recyclerviewadapter.main;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.faisalridwan.recyclerviewadapter.R;
import com.faisalridwan.recyclerviewadapter.data.Hotel;
import com.faisalridwan.recyclerviewadapter.detail.DetailActivity;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{
    private List<Hotel> data = new ArrayList<>();
    public MainAdapter(List<Hotel> data){ this.data = data;}

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindDataToView(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivImg;
        private TextView tvJudulHead;
        private TextView tvNamaJalan;
        private TextView tvIsi;
        private TextView tvHarga;
        private TextView tvRating;
        private ImageView ivMasuk;
        private ImageView ivBack;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImg = itemView.findViewById(R.id.iv_img);
            tvJudulHead = itemView.findViewById(R.id.tv_judulHead);
            tvNamaJalan = itemView.findViewById(R.id.tv_namaJalan);
            tvIsi = itemView.findViewById(R.id.tv_isi);
            tvHarga = itemView.findViewById(R.id.tv_harga);
            tvRating = itemView.findViewById(R.id.tv_rating);
            ivMasuk = itemView.findViewById(R.id.iv_masuk);
            ivBack = itemView.findViewById(R.id.iv_back);
        }
        public  void bindDataToView(final Hotel hotel){
//            team.setCoachNum(1);
//            team.setPlayerNum(20);
            Glide.with(itemView.getContext()).load(hotel.getHotelImg()).into(ivImg);
            tvJudulHead.setText(hotel.getHotelName());
            tvNamaJalan.setText(hotel.getHotelLoc());
//            tvIsi.setText(hotel.ge());
            tvHarga.setText((String.valueOf(hotel.getHotelPrice())));
            tvRating.setText((String.valueOf(hotel.getHotelRate())));

            ivMasuk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
                    intent.putExtra("EXTRA_DATA", hotel);
                    itemView.getContext().startActivity(intent);
                }
            });



        }
    }
}
