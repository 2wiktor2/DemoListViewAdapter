package com.wiktor.demolistviewadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wiktor.demolistviewadapter.POJO.Model;
import com.wiktor.demolistviewadapter.R;

import java.util.List;

public class Adapter extends BaseAdapter {

    private List <Model> list;

    private LayoutInflater layoutInflater;

    public Adapter(Context context, List <Model> list) {
        this.list = list;

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item, parent, false);
        }

        TextView textView = view.findViewById(R.id.text_view_item);

        textView.setText();
        return null;
    }

    private Model getNumber(int position) {
        return (Model)getItem(position);
    }
}
