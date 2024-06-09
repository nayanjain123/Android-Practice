package com.nayan.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapesArrayList; //datasource
    Context context;

    public myCustomAdapter(ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout,shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    private static class MyViewHolder{
        TextView shape_name;
        ImageView shape_img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shapes = getItem(position);
        MyViewHolder myViewHolder;

        if (convertView == null) {
            //no view went off screen then create new view
            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());

            convertView = inflater.inflate(R.layout.grid_item_layout, parent, false);

            myViewHolder.shape_name = (TextView) convertView.findViewById(R.id.textView);
            myViewHolder.shape_img = (ImageView) convertView.findViewById(R.id.imageView);

            convertView.setTag(myViewHolder);
        } else {
            //a view went off screen --> reuse it
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        myViewHolder.shape_name.setText(shapes.getShape_name());
        myViewHolder.shape_img.setImageResource(shapes.getShape_img());

        return convertView;
    }
}


