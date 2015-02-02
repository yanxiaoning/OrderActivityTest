package com.test;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyListViewAdapter extends BaseAdapter {
	 
      private List<View> list;
 
     private LayoutInflater inflater;

	private Context context;
      
    // private MainActivity context;
 
      public MyListViewAdapter(Context context,List<View> list) {
 
          this.list=list;
 
          this.inflater=LayoutInflater.from(context);
          
         this.context = context;
 
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
 
    	return  list.get(position);
    	  
    	
        
 
         
    	 
 
      }
 
      
 
     

	
 
  } 

