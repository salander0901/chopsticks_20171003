package com.example.fang.chopsticks.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.fang.chopsticks.tab.BaseFragment;
import java.util.LinkedList;


/**
 * Created by FANG on 2017/5/16.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    LinkedList<BaseFragment> fragments = null;

    public TabFragmentPagerAdapter(FragmentManager fm, LinkedList<BaseFragment> fragments) {
        super(fm);
        if (fragments == null) {
            this.fragments = new LinkedList<BaseFragment>();
        }else{
            this.fragments = fragments;
        }
    }

    @Override
    public BaseFragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getTitle();
    }

}
