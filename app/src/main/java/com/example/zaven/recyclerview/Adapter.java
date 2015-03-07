package com.example.zaven.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    @SuppressWarnings("unused")
    private static final String TAG = Adapter.class.getSimpleName();
    private static final int ITEM_COUNT = 50;
    private List<Items>item;
    ImageView bgr;

    public Adapter() {
        super();


        item = new ArrayList<>();
        bgr.setBackgroundResource(R.drawable.sample_1);
        for (int i = 0; i < ITEM_COUNT; ++i) {
            item.add(new Items(bgr));
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgs;

        public ViewHolder(View itemView) {
            super(itemView);

            imgs = (ImageView) itemView.findViewById(R.id.image_view);
        }

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Items items = item.get(position);

        holder.imgs=items.getImage();

    }
    @Override
    public int getItemCount() {
        return item.size();
    }


}
