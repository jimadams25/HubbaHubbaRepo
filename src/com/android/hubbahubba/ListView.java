package com.android.hubbahubba;

import java.util.ArrayList;
import java.util.List;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
//import android.view.Menu;

public class ListView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        
        //This is a ListView not a View... why am I getting this error?
        ListView lv = (ListView) findViewById(R.id.listView);
        List<ListViewItem> items = new ArrayList<ListView.ListViewItem>();
        items.add(new ListViewItem()
        {{
        	Thumbnail = R.drawable.ic_launcher;
        	Title = "Spot 1";
        	SubTitle = "8.2 miles";
        	//OverallRating = 10;
        	//PoRating = 3;
        	//DiffRating = 8;
        	//Distance = 5.4;
        }});
        items.add(new ListViewItem()
        {{
        	Thumbnail = R.drawable.ic_launcher;
        	Title = "Spot 2";
        	SubTitle = "8.5 miles";
        	//OverallRating = 9;
        	//PoRating = 5;
        	//DiffRating = 7;
        	//Distance = 6.2;
        }});
        
        CustomListViewAdapter adapter = new CustomListViewAdapter(this, items);
        lv.setAdapter(adapter);
    }

    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_sign_up, menu);
        //return true;
    //}
    
    class ListViewItem{
    	public int Thumbnail;
    	public String Title;
    	public String SubTitle;
    	//public int OverallRating;
    	//public int PoRating;
    	//public int DiffRating;
    	//public double Distance;
    }
}