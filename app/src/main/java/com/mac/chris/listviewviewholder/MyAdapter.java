package com.mac.chris.listviewviewholder;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chris on 5/12/16.
 */
public class MyAdapter extends ArrayAdapter {

    private final Context mContext;
    private final List<String> notes;
    int layoutResourceId;




    public MyAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.notes = objects;
        this.layoutResourceId = resource;
    }

    static class MyViewHolder {
        TextView textView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MyViewHolder myViewHolder;

        if(convertView==null){
            // inflate the layout if the view doesn't exist
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(layoutResourceId, parent, false);
            myViewHolder = new MyViewHolder();
            myViewHolder.textView = (TextView) convertView.findViewById(R.id.textView);
            convertView.setTag(myViewHolder);
        } else { // if it exists, let's use the ViewHolder pattern
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        // get the TextView and then set the text (item name) and tag (item ID) values
        myViewHolder.textView.setText(notes.get(position));

        return convertView;


    }
}
