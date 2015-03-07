package com.example.zaven.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    // siktir enq anum, anpetq bana :)
    private static final int ITEM_COUNT = 50; // iiiiiimasty ))) lav, hamozir, che senc chishta
    private List<Item> items; // aj stex petqa items lini, vortev lista

    public Adapter() {
        super();

        items = new ArrayList<>();
        for (int i = 0; i < ITEM_COUNT; ++i) {
            items.add(new Item(i % 2 == 0 ? R.drawable.sample_1 : R.drawable.sample_2));
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image; // stex anuny misht tur nujny inch vor xml-uma, View Holder-i mej petqa lini

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView) itemView.findViewById(R.id.image);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Item item = this.items.get(position);

        holder.image.setImageResource(item.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return ITEM_COUNT;
    } // senc anenq, avelord list-i funkcia chkanchvi
}
