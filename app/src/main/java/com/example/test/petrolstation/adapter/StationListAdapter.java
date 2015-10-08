package com.example.test.petrolstation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.example.test.petrolstation.R;
import com.example.test.petrolstation.bean.Station;

import java.util.List;

/**
 * Created by test on 2015/10/7.
 */
public class StationListAdapter extends BaseAdapter{
    private Context mContext;
    private List<Station> list;
    private LayoutInflater mInflater;

    public StationListAdapter(Context context, List<Station> list) {
        this.mContext = context;
        this.list = list;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Station  getItem(int position) {
        return getItem(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        if(convertView == null){
            rowView = mInflater.inflate(R.layout.item_station_list,null);
        }else{
            rowView = convertView;
        }
        TextView tv_id = (TextView) rowView.findViewById(R.id.tv_id);
        TextView tv_name = (TextView) rowView.findViewById(R.id.tv_name);
        TextView tv_distance = (TextView) rowView.findViewById(R.id.tv_distance);
        TextView tv_addr = (TextView) rowView.findViewById(R.id.tv_addr);
        Station s = getItem(position);
        tv_id.setText((position+1)+".");
        tv_name.setText(s.getName());
        tv_distance.setText(s.getDistance()+"m");
        tv_addr.setText(s.getAddress());
        GridView gv = (GridView) rowView.findViewById(R.id.gv_price);
        ListGridViewAdapter adapter = new ListGridViewAdapter(s.getGaspriceList(),mContext);
        gv.setAdapter(adapter);
        return rowView;
    }
}
