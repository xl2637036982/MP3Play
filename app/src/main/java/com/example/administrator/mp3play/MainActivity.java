package com.example.administrator.mp3play;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

   private  Song song;
   private  String song1;
   private List<Songs> mp3s = new ArrayList<>();
   private Handler handler;
    RecyclerView recyclerView;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = this.findViewById(R.id.recycler_view);



        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.bzqll.com/music/netease/songList?key=579621905&id=3778678&limit=100&offset=0")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String s = response.body().string();
                Gson gson = new Gson();
                song=gson.fromJson(s,Song.class);

                 if(song!=null&&song.getData()!=null){
                   mp3s=song.getData().getSongs();
                 }
                 runOnUiThread(new Runnable() {
                     @Override
                     public void run() {
                         adapter = new Adapter(MainActivity.this,mp3s);
                         recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                         recyclerView.setAdapter(adapter);

                         adapter.setOnItemClickListener(new Adapter.OnItemClickListener() {
                             @Override
                             public void onItemClick(View view, int position) {
                                 Songs songs = mp3s.get(position);
                                 Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                                 intent.putExtra("k",songs);
                                 intent.putExtra("kk",song);
                                 intent.putExtra("kkk",position);
                                 startActivity(intent);



                             }
                         });
                     }
                 });

            }
        });

    }






}
