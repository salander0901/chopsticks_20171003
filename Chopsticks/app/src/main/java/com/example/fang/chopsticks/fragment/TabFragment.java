package com.example.fang.chopsticks.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fang.chopsticks.R;
import com.example.fang.chopsticks.adapter.TabFragmentPagerAdapter;
import com.example.fang.chopsticks.tab.BaseFragment;
import com.example.fang.chopsticks.tab.SlidingTabLayout;

import java.util.LinkedList;

/**
 * Created by FANG on 2017/5/16.
 */

public class TabFragment extends Fragment {

    private SlidingTabLayout tabs;
    private ViewPager pager;
    private FragmentPagerAdapter adapter;

    public static Fragment newInstance(){
        TabFragment f = new TabFragment();
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frg_tab, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //adapter
        final LinkedList<BaseFragment> fragments = getFragments();
        adapter = new TabFragmentPagerAdapter(getFragmentManager(), fragments);
        //pager
        pager = (ViewPager) view.findViewById(R.id.pager);
        pager.setAdapter(adapter);
        //tabs
        tabs = (SlidingTabLayout) view.findViewById(R.id.tabs);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {

            @Override
            public int getIndicatorColor(int position) {
                return fragments.get(position).getIndicatorColor();
            }

            @Override
            public int getDividerColor(int position) {
                return fragments.get(position).getDividerColor();
            }
        });
        tabs.setBackgroundResource(R.color.color_primary);
        tabs.setViewPager(pager);
    }

    private LinkedList<BaseFragment> getFragments(){
        int indicatorColor = Color.parseColor(this.getResources().getString(R.color.color_accent));
        int dividerColor = Color.TRANSPARENT;

        LinkedList<BaseFragment> fragments = new LinkedList<BaseFragment>();
        fragments.add(FirstStepFragment.newInstance("進料", indicatorColor, dividerColor));
      //  fragments.add(SecondStepFragment.newInstance("倒角", indicatorColor, dividerColor));
       // fragments.add(ThirdStepFragment.newInstance("上膠", indicatorColor, dividerColor));
        return fragments;
    }
}
