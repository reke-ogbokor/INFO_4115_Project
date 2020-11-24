package com.info3245.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<Room> mData;


    public RecyclerViewAdapter(Context context, List<Room> mData) {
        this.mContext = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_room_title.setText(mData.get(position).getRoomName());
        holder.img_room_thumbnail.setImageResource(mData.get(position).getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv_room_title;
        ImageView img_room_thumbnail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_room_title = (TextView) itemView.findViewById(R.id.room_title_id);
            img_room_thumbnail = (ImageView) itemView.findViewById(R.id.room_img_id);
        }
    }


}
