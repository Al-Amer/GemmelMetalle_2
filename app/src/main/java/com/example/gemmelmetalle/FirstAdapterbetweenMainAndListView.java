package com.example.gemmelmetalle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class FirstAdapterbetweenMainAndListView extends BaseAdapter {

    // Valiable Declaration and Assigning
    ArrayList<ValeibleForObject> datalist = new ArrayList<>();
    Context context;

    //Constructor
    public FirstAdapterbetweenMainAndListView(ArrayList<ValeibleForObject>list,Context c ){
        this.datalist = list;
        this.context = c ;
    }

    @Override
    public int getCount() { //Size

        return datalist.size();
    }

    @Override
    public Object getItem(int position) { //position
        return datalist.get(position);
    }

    @Override
    public long getItemId(int position) {       //Don't touch
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {         //LayoutInFlater + View
        LayoutInflater inflater_object =  (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view_object = inflater_object.inflate(R.layout.list_view_layout,parent,false);
        // TextView and ImageView from list_view_layout  Declaration and Assigning
        TextView titleText = view_object.findViewById(R.id.textView2);
        ImageView imageView=view_object.findViewById(R.id.imageView4);
        titleText.setText(datalist.get(position).getShapName());
        imageView.setImageResource(datalist.get(position).getShapImage());
        return view_object;
    }


}//end of Class
