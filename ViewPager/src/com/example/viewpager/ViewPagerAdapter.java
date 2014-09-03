package com.example.viewpager;


import android.annotation.TargetApi;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;


public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context _context;
    public static int totalPage=4;
    public ViewPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        _context=context;
 
        }
    @Override
    public Fragment getItem(int position) {
    	  Log.d("ayaz","get item was called");
        Fragment f = new Fragment();
        switch(position){
        case 0:
            f=LayoutOne.newInstance(_context);
            break;
        case 1:
            f=LayoutTwo.newInstance(_context);
            break;
        case 2:
            f=LayoutThree.newInstance(_context);
            break;
        case 3:
            f=LayoutFour.newInstance(_context);
            break;
        }
        return f;
    }
    @Override
    public int getCount() {
        return totalPage;
    }
 
}
