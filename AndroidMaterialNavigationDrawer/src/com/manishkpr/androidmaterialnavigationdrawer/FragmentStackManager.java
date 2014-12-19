package com.manishkpr.androidmaterialnavigationdrawer;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class FragmentStackManager {
	FragmentActivity activity;
	FragmentTransaction ft;
	
	public FragmentStackManager(FragmentActivity activity){
		this.activity=activity;
	}
	
	public void addFragment(Fragment fragment, int id,boolean addToBackStack, int transition,boolean want_animation) {
        ft = activity.getSupportFragmentManager().beginTransaction();
        if(want_animation){
        	ft.setCustomAnimations(R.anim.s_up,R.anim.s_down,R.anim.s_up,R.anim.s_down);
        }
        ft.replace(id, fragment);
        ft.setTransition(transition);
        if (addToBackStack)
            ft.addToBackStack(null);
        ft.commit();
    }
	public void popAll(){
		activity.getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
	}
	
}
