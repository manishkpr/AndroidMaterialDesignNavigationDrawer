package com.manishkpr.androidmaterialnavigationdrawer;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.View;

public class BaseActivity extends ActionBarActivity{
	public ActionBarDrawerToggle mDrawerToggle;
	public DrawerLayout drawer;
    
    CharSequence mDrawerTitle;
	CharSequence mTitle;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setActionBar();
	}
	public void setActionBar(){
		getSupportActionBar().setTitle("");
		getSupportActionBar().setBackgroundDrawable(new ColorDrawable(this.getResources().getColor(R.color.app_main)));
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
	}
	
}
