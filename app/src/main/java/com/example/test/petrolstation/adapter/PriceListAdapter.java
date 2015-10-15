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
public class PriceListAdapter extends BaseAdapter{
    private List<Petrol> list;
    private LayoutInflater mInflater;

    public PriceListAdapter(Context context,List<Petrol> list) {
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
        View rowView;
        if(convertView == null){
            rowView = mInflater.inflate(R.layout.item_info_list,null);
        }else{
            rowView = convertView;
        }
        TextView tv_name = (TextView)rowView.findViewById(R.id.tv_name);
        TextView tv_price = (TextView)rowView.findViewById(R.id.tv_price);
        Petrol p = getItem(position);
        tv_name.setText(p.getType());
        tv_price.setText(p.getPrice());
        return rowView;
    }
}
