package com.android.hubbahubba;

import java.util.ArrayList;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;


public class ViewMap extends SherlockFragmentActivity implements ActionBar.TabListener   {
	
	 
	 ViewPager mViewPager;
	 TabsAdapter mTabsAdapter;
	 

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        
	       mViewPager = new ViewPager(this);
	       mViewPager.setId(R.id.pager);
	       setContentView(mViewPager);
	        
	        ActionBar bar = getSupportActionBar();
	        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
	        bar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
	        
	        mTabsAdapter = new TabsAdapter((SherlockFragmentActivity) this, mViewPager);
	        mTabsAdapter.addTab(bar.newTab().setText("Members"),
	                MembersFragment.class, null);
	        mTabsAdapter.addTab(bar.newTab().setText("Messages"),
	          MessagesFragment.class, null);


	        if (savedInstanceState != null) {
	            bar.setSelectedNavigationItem(savedInstanceState.getInt("tab", 0));
	        }

	    }
	    


	/*@Override
	 protected void onSaveInstanceState(Bundle outState) {
	  super.onSaveInstanceState(outState);
	        outState.putInt("tab", getSupportActionBar().getSelectedNavigationIndex());
	 }*/
	 
	 public static class TabsAdapter extends FragmentPagerAdapter
	  implements ActionBar.TabListener, ViewPager.OnPageChangeListener {
	  
	  private final Context mContext;
	        private final ActionBar mActionBar;
	        private final ViewPager mViewPager;
	        private final ArrayList<TabInfo> mTabs = new ArrayList<TabInfo>();
	        
	        static final class TabInfo {
	            private final Class<?> clss;
	            private final Bundle args;

	            TabInfo(Class<?> _class, Bundle _args) {
	                clss = _class;
	                args = _args;
	            }
	        }

	  public TabsAdapter(SherlockFragmentActivity activity, ViewPager pager) {
	   super(activity.getSupportFragmentManager());
	            mContext = activity;
	            mActionBar = activity.getSupportActionBar();
	            mViewPager = pager;
	            mViewPager.setAdapter(this);
	            mViewPager.setOnPageChangeListener(this);
	        }

	  public void addTab(ActionBar.Tab tab, Class<?> clss, Bundle args) {
	            TabInfo info = new TabInfo(clss, args);
	            tab.setTag(info);
	            tab.setTabListener(this);
	            mTabs.add(info);
	            mActionBar.addTab(tab);
	            notifyDataSetChanged();
	        }

	  public void onPageScrollStateChanged(int state) {
	   // TODO Auto-generated method stub
	   
	  }

	  public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
	   // TODO Auto-generated method stub
	   
	  }

	 
	  public void onPageSelected(int position) {
	   // TODO Auto-generated method stub
	   mActionBar.setSelectedNavigationItem(position);
	  }

	 
	  public void onTabReselected(Tab tab, FragmentTransaction ft) {
	   // TODO Auto-generated method stub
	   
	  }

	 
	  public void onTabSelected(Tab tab, FragmentTransaction ft) {
	   Object tag = tab.getTag();
	            for (int i=0; i<mTabs.size(); i++) {
	                if (mTabs.get(i) == tag) {
	                    mViewPager.setCurrentItem(i);
	                }
	            }
	  }


	  public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	   // TODO Auto-generated method stub
	   
	  }

	  
	  public Fragment getItem(int position) {
	   TabInfo info = mTabs.get(position);
	            return Fragment.instantiate(mContext, info.clss.getName(), info.args);
	  }

	 
	  public int getCount() {
	   return mTabs.size();
	  }

	 }

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	}