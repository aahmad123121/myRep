package com.example.viewpager;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ViewPagerStyle1Activity extends FragmentActivity {
    private ViewPager _mViewPager;
    private ViewPagerAdapter _adapter;
    private Button _btn1,_btn2,_btn3,next,_btn4;
    private int i=1;
    private int orange; 
    private int black; 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
         orange = getResources().getColor(R.color.orange);
        black = getResources().getColor(R.color.White);
        _mViewPager = (ViewPager) findViewById(R.id.viewPager);
        next=(Button)findViewById(R.id.next);
        
        next.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				  Log.d("ayaz","on click was called");
				 _mViewPager .setCurrentItem(i);			 					 
			}
		});
        setUpView();
        setTab();
    }
    private void setUpView(){
    	 Log.d("ayaz","setUpView was called");
     _adapter = new ViewPagerAdapter(getApplicationContext(),getSupportFragmentManager());
     _mViewPager.setAdapter(_adapter);
     _mViewPager.setCurrentItem(0);
     initButton();
    }
    private void setTab(){
    	 Log.d("ayaz","setTab was called");
            _mViewPager.setOnPageChangeListener(new OnPageChangeListener(){
 
                        @Override
                        public void onPageScrollStateChanged(int position) {}
                        @Override
                        public void onPageScrolled(int arg0, float arg1, int arg2) {}
                        @Override
                        public void onPageSelected(int position) {
                        	 
                            btnAction(position);
                            i=position;
                            i++;
                        }
 
                    });
 
    }
    private void btnAction(int action){
    	  Log.d("ayaz","btn action was called action=="+action);
    	  if(action==3)
    		  next.setVisibility(View.GONE);
    	  else
    		  next.setVisibility(View.VISIBLE);
        switch(action){
          case 0: setButton(_btn1,orange); setButton(_btn2,black);setButton(_btn3,black);setButton(_btn4,black);break;
          case 1: setButton(_btn2,orange); setButton(_btn1,black);setButton(_btn3,black); setButton(_btn4,black);break;
          case 2: setButton(_btn3,orange); setButton(_btn1,black); setButton(_btn2,black);setButton(_btn4,black); break;
          case 3: setButton(_btn4,orange); setButton(_btn1,black); setButton(_btn2,black);setButton(_btn3,black); break;
        }
    }
    private void initButton(){
    	 _mViewPager .setCurrentItem(3);
    	
    	  Log.d("ayaz","init button was called");
        _btn1=(Button)findViewById(R.id.btn1);
        _btn2=(Button)findViewById(R.id.btn2);
        _btn3=(Button)findViewById(R.id.btn3);
        _btn4=(Button)findViewById(R.id.btn4);
        setButton(_btn1,orange);
        setButton(_btn2,black);
        setButton(_btn3,black);
        setButton(_btn4,black);
        btnAction(3);
    }
    private void setButton(Button btn,int color){
    	  Log.d("ayaz","set button was called");
       
        btn.setBackgroundColor(color);
    }
    
}
