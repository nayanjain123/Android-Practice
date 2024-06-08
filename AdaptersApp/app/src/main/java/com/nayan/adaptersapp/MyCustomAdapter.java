package com.nayan.adaptersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter{
    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() { //returns the no. of items in ur datasource
        return items.length;
    }
    @Override
    public Object getItem(int i) {//returns data item at a given position/index
        return items[i];
    }
    @Override
    public long getItemId(int i) {//returns unique identifier for the item at the given position
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//displays data at a position in the data set
        ViewHolder holder;
        if(view==null){
            //View - here is a recycled view that u can reuse to improve the performace of your list
            view= LayoutInflater.from(context).inflate(R.layout.my_list_item,viewGroup,false);
            holder=new ViewHolder();
            holder.textView=view.findViewById(R.id.text1);
            view.setTag(holder);
        }
        else{
            // reusing the view that's recycled.
            holder=(ViewHolder)view.getTag();
        }
        //set the dta to the view
        holder.textView.setText(items[i]);
        return view;
    }

    static class ViewHolder{
        //holds references to the views within an item layout
        TextView textView;
    }

}
