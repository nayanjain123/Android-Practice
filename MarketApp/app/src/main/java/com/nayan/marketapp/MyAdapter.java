package com.nayan.marketapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {

    private List<Item> itemList;
    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener myListener) {
        this.clickListener = myListener;
    }

    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //responsible to create new view holders for ur items
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        //responsible for binding data from ur dataset to views within the view holder
        Item item = itemList.get(position);
        holder.title.setText(item.getItemName());
        holder.imageView.setImageResource(item.getItemImg());
        holder.description.setText(item.getItemDesc());
    }

    @Override
    public int getItemCount() {
        //returns the total number of items in dataset
        return itemList.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        //holds references to the views within the item layout
        ImageView imageView;
        TextView title;
        TextView description;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.title_text);
            description = itemView.findViewById(R.id.desc_text);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (clickListener != null) {
                clickListener.onClick(view, getAdapterPosition());}
        }
    }
}

