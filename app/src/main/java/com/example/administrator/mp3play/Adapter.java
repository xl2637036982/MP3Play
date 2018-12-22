package com.example.administrator.mp3play;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> implements
        View.OnClickListener {
    private List<Songs> list;
    private Context context;
    private OnItemClickListener onItemClickListener;
    public Adapter(Context context,List<Songs> list) {
        this.list = list;
        this.context = context;
    }




    @Override
    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {
        Songs song = list.get(i);

         viewHolder.text_song.setText(song.getName());
         viewHolder.text_singer.setText(song.getSinger());
         viewHolder.itemView.setTag(i);
         Glide.with(viewHolder.itemView.getContext())
                 .load(song.getPic()).asBitmap().into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public  interface  OnItemClickListener{
        void onItemClick(View view,int position);
    }
    public  void  setOnItemClickListener(OnItemClickListener onItemClickListener){
        this.onItemClickListener = onItemClickListener;
    }
    @Override
        public void onClick(View v) {
            if (onItemClickListener!=null){
                onItemClickListener.onItemClick(v, (int)v.getTag());
            }
    }

    class  ViewHolder extends  RecyclerView.ViewHolder{
            ImageView imageView;
            TextView text_song;
            TextView text_singer;
        public ViewHolder( View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            text_song = itemView.findViewById(R.id.song_name);
            text_singer = itemView.findViewById(R.id.singer_name);
        }
    }

}
