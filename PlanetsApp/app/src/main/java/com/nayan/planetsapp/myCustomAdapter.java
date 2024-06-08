package com.nayan.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

//mycustomadapter takes care of inflate the item list layout for every single item in planetsArrayList
public class myCustomAdapter extends ArrayAdapter<Planet> {
// Using Custom Layouts --> MyCustomAdapter
// Using Custom Objects --> extends ArrayAdapter<Planet>

    private ArrayList<Planet> planetsArrayList;
    Context context;

    public myCustomAdapter(ArrayList<Planet> planetsArrayList, Context context) {
        super(context, R.layout.item_list_layout,planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;
    }

    //view holder class - used to cache references to the views within an item layout,
    //so that they dont need to repeatedly looked up during scrolling.

    private static class MyViewHolder{
        TextView planetName;
        TextView moonCount;
        ImageView planetImg;
        //getView(): used to create and return a vview for a specific item in the list

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get planet obj for the current position
        Planet planet=getItem(position);
        //inflate layour
        MyViewHolder myViewHolder;
        final View result;

        if(convertView==null) {
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);

            //finding views
            myViewHolder.planetName = (TextView) convertView.findViewById(R.id.planet_name);
            myViewHolder.moonCount = (TextView) convertView.findViewById(R.id.moons);
            myViewHolder.planetImg = (ImageView) convertView.findViewById(R.id.imageview);
            result = convertView;

            convertView.setTag(myViewHolder);
        }else{
            //the view is existing n recycled
            myViewHolder=(MyViewHolder) convertView.getTag();
            result=convertView;
        }

        myViewHolder.planetName.setText(planet.getPlanetName());
        myViewHolder.moonCount.setText(planet.getMoonCount());
        myViewHolder.planetImg.setImageResource((planet.getPlanetImage()));

        return result;
    }
}
