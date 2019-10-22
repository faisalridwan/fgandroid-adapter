package com.faisalridwan.recyclerviewadapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

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

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivImg =itemView.findViewById(R.id.iv_img);
            tvJudulHead = itemView.findViewById(R.id.tv_judulHead);
            tvNamaJalan = itemView.findViewById(R.id.tv_namaJalan);
            tvIsi = itemView.findViewById(R.id.tv_isi);
            tvHarga = itemView.findViewById(R.id.tv_harga);
            tvRating = itemView.findViewById(R.id.tv_rating);
        }
        public  void bindDataToView(Hotel hotel){
//            team.setCoachNum(1);
//            team.setPlayerNum(20);
            Glide.with(itemView.getContext()).load(hotel.getHotelImg()).into(ivImg);
            tvJudulHead.setText(hotel.getHotelName());
            tvNamaJalan.setText(hotel.getHotelLoc());
//            tvIsi.setText(hotel.ge());
            tvHarga.setText((String.valueOf(hotel.getHotelPrice())));
            tvRating.setText((String.valueOf(hotel.getHotelRate())));
        }
    }
}
