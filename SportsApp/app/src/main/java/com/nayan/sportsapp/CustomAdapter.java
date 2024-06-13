package com.nayan.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//This is adapter class bridge between data- List<Sport> and RecyclerView+CardView
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder> {

    private List<Sport>sportList;

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating the layout for each item in the recycler view will return a sportsviewholder object
        // which will hold the references in the item layout
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout,parent,false);

        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        //called for each item in list and is responsible for
        // binding data from the sport object to the views withing sports view holder
        Sport sport=sportList.get(position);
        holder.textView.setText(sport.sportName);
        holder.imageView.setImageResource(sport.sportImg);

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        //holds the references to the views within the item layout
        TextView textView;
        ImageView imageView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textview);
            imageView=itemView.findViewById(R.id.imageviewcard);
        }
    }

}
