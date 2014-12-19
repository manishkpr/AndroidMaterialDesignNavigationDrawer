package com.manishkpr.androidmaterialnavigationdrawer;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class SlidingMenuFragment extends Fragment {
	List<String>data;
	ListView list_view;
	SlidingMenuListAdapter adapter;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_sliding_menu, null);
		setUpView(root);
		return root;
	}
	void setUpView(ViewGroup root){
		list_view  =  (ListView)root.findViewById(R.id.list_view);
		initList();
	}
	void initList(){
		data = new ArrayList<String>();
		
		data.add("One");
		data.add("Two");
		data.add("Three");
		
		adapter = new SlidingMenuListAdapter(getActivity(),data);
		list_view.setAdapter(adapter);
	}
}
