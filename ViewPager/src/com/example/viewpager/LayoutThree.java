package com.example.viewpager;

import android.annotation.SuppressLint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.TextView;

@SuppressLint("NewApi")
public class LayoutThree extends Fragment {
	 
    public static Fragment newInstance(Context context) {
    	LayoutThree f = new LayoutThree();
 
        return f;
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.layout_three, null);
        TextView mTextView=(TextView)root.findViewById(R.id.textView1);
        mTextView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent mintent=new Intent(getActivity(),SecondActivity.class);
				startActivity(mintent);
			}
		});
        return root;
    }
 
}
