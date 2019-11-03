package com.faisalridwan.recyclerviewadapter.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.faisalridwan.recyclerviewadapter.R;
import com.faisalridwan.recyclerviewadapter.data.Hotel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMain;
    private MainAdapter adapter;
    Type listType = new TypeToken<List<Hotel>>() {}.getType();
    private final String jsonData = "[\n" +
            "    {\n" +
            "        \"hotel_name\": \"Aston Pasteur\",\n" +
            "        \"hotel_img\": \"https://www.imgacademy.com/sites/default/files/legacy-hotel-rendering-guest-room.jpg\",\n" +
            "        \"hotel_loc\": \"Bandung Wetan, Bandung\",\n" +
            "        \"hotel_price\": \"500.000\",\n" +
            "        \"hotel_rate\":\"9.1\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"Clove Garden\",\n" +
            "        \"hotel_img\": \"https://www.imgacademy.com/sites/default/files/tp-apv4.jpg\",\n" +
            "        \"hotel_loc\": \"Cimenyan, Bandung\",\n" +
            "        \"hotel_price\": \"550.000\",\n" +
            "        \"hotel_rate\":\"7.7\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"Novenna Hotel\",\n" +
            "        \"hotel_img\": \"https://www.imgacademy.com/sites/default/files/dorm1.jpg\",\n" +
            "        \"hotel_loc\": \"Lembang, Bandung\",\n" +
            "        \"hotel_price\": \"450.000\",\n" +
            "        \"hotel_rate\":\"8.7\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"Kedaton Hotel\",\n" +
            "        \"hotel_img\": \"https://www.imgacademy.com/sites/default/files/legacy-hotel-rendering-lobby.jpg\",\n" +
            "        \"hotel_loc\": \"Sumur Bandung, Bandung\",\n" +
            "        \"hotel_price\": \"350.000\",\n" +
            "        \"hotel_rate\":\"8.9\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"Shakti Hotel\",\n" +
            "        \"hotel_img\": \"https://www.imgacademy.com/sites/default/files/tp-apv6.jpg\",\n" +
            "        \"hotel_loc\": \"Soekarno Hatta, Bandung\",\n" +
            "        \"hotel_price\": \"150.000\",\n" +
            "        \"hotel_rate\":\"8.4\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"Suria City Hotel\",\n" +
            "        \"hotel_img\": \"https://www.imgacademy.com/sites/default/files/dorm4.jpg\",\n" +
            "        \"hotel_loc\": \"Lengkong, Bandung\",\n" +
            "        \"hotel_price\": \"650.000\",\n" +
            "        \"hotel_rate\":\"8.6\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"Tebu Hotel\",\n" +
            "        \"hotel_img\": \"https://www.imgacademy.com/sites/default/files/tp-rec-area.jpg\",\n" +
            "        \"hotel_loc\": \"Bandung Wetan, Bandung\",\n" +
            "        \"hotel_price\": \"350.000\",\n" +
            "        \"hotel_rate\":\"8.7\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"Aryaduta Bandung\",\n" +
            "        \"hotel_img\": \"https://origin.pegipegi.com/jalan/images/pict1L/Y3/Y980483/X980483047.jpg\",\n" +
            "        \"hotel_loc\": \"Bandung Wetan, Bandung\",\n" +
            "        \"hotel_price\": \"724.363\",\n" +
            "        \"hotel_rate\":\"9.2\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"West Point Hotel\",\n" +
            "        \"hotel_img\": \"https://origin.pegipegi.com/jalan/images/pict1L/Y8/Y921148/Y921148038.jpg\",\n" +
            "        \"hotel_loc\": \"Andir, Bandung\",\n" +
            "        \"hotel_price\": \"429.752\",\n" +
            "        \"hotel_rate\":\"9.0\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"hotel_name\": \"Taman Bandung\",\n" +
            "        \"hotel_img\": \"https://origin.pegipegi.com/jalan/images/pict1L/Y8/Y958768/Y958768029.jpg\",\n" +
            "        \"hotel_loc\": \"Arcamanik, Bandung\",\n" +
            "        \"hotel_price\": \"123.967\",\n" +
            "        \"hotel_rate\":\"7.4\"\n" +
            "    },{\n" +
            "        \"hotel_name\": \"Sudirman Suite\",\n" +
            "        \"hotel_img\": \"https://origin.pegipegi.com/jalan/images/pict1L/Y0/Y936660/Y936660007.jpg\",\n" +
            "        \"hotel_loc\": \"Andir, Bandung\",\n" +
            "        \"hotel_price\": \"190.083\",\n" +
            "        \"hotel_rate\":\"8.1\"\n" +
            "    }\n" +
            "]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMain = findViewById(R.id.rv_main);
        Gson gson = new Gson() ;
        List<Hotel> data = gson.fromJson(jsonData,listType) ;
        adapter = new MainAdapter(data);

        rvMain.setAdapter(adapter);
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setItemAnimator(new DefaultItemAnimator());
    }
}
