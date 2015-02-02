package com.test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivityTestActivity extends Activity {
    private int amount = 7;
	private LayoutInflater inflater;
	//private ScrollView scv;
	private LinearLayout linearLayoutInScrollView;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        
        ListView listView = (ListView)findViewById(R.id.myListView);
     
        linearLayoutInScrollView = (LinearLayout)findViewById(R.id.linearlayoutinscrollview);
       
        List<View> layOutList = new ArrayList<View>();
        
        inflater = getLayoutInflater();
        
        

        
    for(int i = 0;i < amount ;i++)
    {
    	
    	 LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.itemlayout, null);
         
         
         ImageView imgViewMealSmall = (ImageView)layout.findViewById(R.id.mealname_small);
         imgViewMealSmall.setId(i);
         
         ImageView imgViewOrderButton = (ImageView)layout.findViewById(R.id.order_button);
         imgViewOrderButton.setId(i);
          
        TextView tv = (TextView)layout.findViewById(R.id.mealDescription);    
        tv.setText("Beef  Carpaccio".toUpperCase()+"\n"+

"Truffle mayonnaise, mushrooms, Parmesan Shavings and fried potato skins"+"\n"+
"$26.08");
     //   tvList.add(tv);
     
      imgViewMealSmall.setBackgroundResource(R.drawable.beef_small);
      imgViewMealSmall.setOnClickListener(new OnClickListener(){
      	public void onClick(View v)
      	{
      		Toast.makeText(getApplicationContext(), "显示第"+String.valueOf(v.getId()+"号菜品详细内容"), Toast.LENGTH_SHORT).show();
      	}
      });
          
     
      
      
    
      imgViewOrderButton.setBackgroundResource(R.drawable.order_button);
      imgViewOrderButton.setOnClickListener(new OnClickListener(){
        	public void onClick(View v)
        	{
        	
        		
        		 LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.itemlayout_scrollview, null);
        		 ImageView imgView = (ImageView)layout.findViewById(R.id.mealinorderlist);
        		 imgView.setBackgroundResource(R.drawable.beef_small);
        		 TextView tv =  (TextView)layout.findViewById(R.id.mealnameinorderlist);
        		 tv.setText("BEEF CARPACCIO");
        		
        		 linearLayoutInScrollView.addView(layout);
        		
        		//	Toast.makeText(getApplicationContext(), "预定第"+String.valueOf(v.getId()+"号菜品"), Toast.LENGTH_SHORT).show();
        	
        	
        	
        	}
        });
            
      
      layOutList.add(layout);
    }
        
       
        listView.setAdapter(new MyListViewAdapter(this,layOutList));
       
       
    }
    
    
   
    
}