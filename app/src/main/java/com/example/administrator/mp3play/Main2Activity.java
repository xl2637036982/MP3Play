package com.example.administrator.mp3play;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.image_view_big)
    ImageView imageViewBig;
    @BindView(R.id.image_btn_back)
    ImageButton imageBtnBack;
    @BindView(R.id.image_btn)
    ImageButton imageBtn;
    @BindView(R.id.image_btn_next)
    ImageButton imageBtnNext;
    @BindView(R.id.song_name)
    TextView songName;
    @BindView(R.id.singer_name)
    TextView singerName;

     private   String url;
    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private MediaPlayer mediaPlayer3;
    Song song;
    int positio;
    private  boolean a=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        Songs songs = (Songs) intent.getSerializableExtra("k");
        song = (Song) intent.getSerializableExtra("kk");
        positio = intent.getIntExtra("kkk",0);


        url = songs.getUrl();

        String song_two = songs.getName();
        String singer_two = songs.getSinger();
        songName.setText(song_two);
        singerName.setText(singer_two);
        Glide.with(this).load(songs.getPic()).asBitmap().into(imageViewBig);
    }
    @OnClick({R.id.image_btn_back, R.id.image_btn, R.id.image_btn_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.image_btn_back:
                if (mediaPlayer2!=null) {
                    mediaPlayer2.stop();
                }
                    if(mediaPlayer1!=null) {
                        mediaPlayer1.stop();
                    }
                        if (mediaPlayer3!=null){
                            mediaPlayer3.stop();
                        }


                positio = positio-1;

                String song_two = song.getData().getSongs().get(positio).getName();
                String singer_two = song.getData().getSongs().get(positio).getSinger();
                songName.setText(song_two);
                singerName.setText(singer_two);

                Glide.with(Main2Activity.this).load(song.getData().getSongs().get(positio)
                .getPic()).asBitmap().into(imageViewBig);
          String url1 =song.getData().getSongs().get(positio).getUrl();
          Uri uri1 = Uri.parse(url1);
          mediaPlayer2 = MediaPlayer.create(this,uri1);
          mediaPlayer2.start();
                break;
            case R.id.image_btn:
                if(a) {
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.stop();
                    }
                    if (mediaPlayer1 != null) {
                        mediaPlayer1.stop();
                    }
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.stop();
                    }
                    Uri uri = Uri.parse(url);
                    mediaPlayer1 = MediaPlayer.create(this, uri);
                    mediaPlayer1.start();
                }
                else {
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.stop();
                    }
                    if (mediaPlayer1 != null) {
                        mediaPlayer1.stop();
                    }
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.stop();
                    }
                    imageBtn.setImageResource(R.drawable.btn_play);
                }
                a=false;
                break;
            case R.id.image_btn_next:
                if (mediaPlayer2!=null) {
                    mediaPlayer2.stop();
                }
                if(mediaPlayer1!=null) {
                    mediaPlayer1.stop();
                }
                if (mediaPlayer3!=null){
                    mediaPlayer3.stop();
                }
                positio= positio+1;
                String song_three = song.getData().getSongs().get(positio).getName();
                String singer_three  = song.getData().getSongs().get(positio).getSinger();
                songName.setText(song_three );
                singerName.setText(singer_three );

                Glide.with(Main2Activity.this).load(song.getData().getSongs().get(positio)
                        .getPic()).asBitmap().into(imageViewBig);
                String url2 =song.getData().getSongs().get(positio).getUrl();
                Uri uri2 = Uri.parse(url2);
                mediaPlayer3 = MediaPlayer.create(this,uri2);

                mediaPlayer3.start();
                break;
        }
    }
}
