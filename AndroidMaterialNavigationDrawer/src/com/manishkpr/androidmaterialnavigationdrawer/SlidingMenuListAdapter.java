package com.manishkpr.androidmaterialnavigationdrawer;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class SlidingMenuListAdapter extends BaseAdapter {
	List<String> data;
	Context context;
	public SlidingMenuListAdapter(Context context,List<String> data){
		this.context = context;
		this.data = data;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int id) {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public long getItemId(int id) {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		LayoutInflater layoutInflater = LayoutInflater.from(this.context);
		ViewHolder viewHolder;

		if (convertView == null) {
			viewHolder = new ViewHolder();
			convertView = layoutInflater.inflate(R.layout.list_view_sliding_menu_items, null);
			viewHolder.name = (TextView)convertView.findViewById(R.id.name);
			//## Initial Views

			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		//## Setup Data below
		viewHolder = (ViewHolder) convertView.getTag();
		TextView name = viewHolder.name;
		name.setText(data.get(position));
		return convertView;
	}

	public class ViewHolder {
		TextView name;
	}

}
