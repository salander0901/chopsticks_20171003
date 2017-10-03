package com.example.fang.chopsticks.tab;


import android.graphics.Color;
import android.support.v4.app.Fragment;
/**
 * Created by FANG on 2017/5/16.
 */

public class BaseFragment extends Fragment {

    private String title = "";
    private int indicatorColor = Color.BLUE;
    private int dividerColor = Color.GRAY;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getIndicatorColor() {
        return indicatorColor;
    }
    public void setIndicatorColor(int indicatorColor) {
        this.indicatorColor = indicatorColor;
    }
    public int getDividerColor() {
        return dividerColor;
    }
    public void setDividerColor(int dividerColor) {
        this.dividerColor = dividerColor;
    }

}
