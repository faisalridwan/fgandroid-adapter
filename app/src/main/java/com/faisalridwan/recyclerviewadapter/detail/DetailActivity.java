package com.faisalridwan.recyclerviewadapter.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.faisalridwan.recyclerviewadapter.R;
import com.faisalridwan.recyclerviewadapter.data.Hotel;
import com.faisalridwan.recyclerviewadapter.main.MainActivity;

public class DetailActivity extends AppCompatActivity {

      private ImageView ivImageBesar, ivBack;
      private TextView tvJudul, tvNamaKota,tvRate,tvHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivImageBesar = findViewById(R.id.iv_imagebesar);
        tvJudul = findViewById(R.id.tv_judul);
        tvNamaKota = findViewById(R.id.tv_namakota);
        tvRate = findViewById(R.id.tv_rate);
        tvHarga = findViewById(R.id.tv_harga);
        ivBack = findViewById(R.id.iv_back);

        Hotel dataFromIntent = getIntent().getParcelableExtra("EXTRA_DATA");

        tvJudul.setText(dataFromIntent.getHotelName());
        // UNTUK STRING tvTitleDetail.setText(String.valueOf(dataFromIntent.getTeamName()));
        tvNamaKota.setText(dataFromIntent.getHotelLoc());
        tvHarga.setText(dataFromIntent.getHotelPrice());
        tvRate.setText(dataFromIntent.getHotelRate());

        Glide.with(this).load(dataFromIntent.getHotelImg()).into(ivImageBesar);

        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
