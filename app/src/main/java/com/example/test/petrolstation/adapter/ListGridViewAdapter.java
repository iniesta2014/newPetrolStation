package com.example.test.petrolstation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.test.petrolstation.R;
import com.example.test.petrolstation.bean.Petrol;

import java.util.List;

/**
 * Created by test on 2015/10/7.
 */
public class ListGridViewAdapter extends BaseAdapter{
    private List<Petrol> list;
    private LayoutInflater mInflater;

    public ListGridViewAdapter(List<Petrol> list, Context context) {
        this.list = list;
        mInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Petrol getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = null;
        if(convertView == null){
            rowView = mInflater.inflate(R.layout.item_price_gridview,null);
        }else {
            rowView = convertView;
        }
        TextView tv = (TextView) rowView.findViewById(R.id.tv);
        Petrol p = getItem(position);
        tv.setText(p.getType() + " " +p.getPrice());
        return rowView;
    }
}
