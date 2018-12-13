package com.system.uilibrary.views.tabview;

import android.support.v4.app.Fragment;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * 作者：yaochangliang on 2016/8/13 18:37
 * 邮箱：yaochangliang159@sina.com
 */
public class TabViewChild {
    private int imageViewSelIcon;
    private int imageViewUnSelIcon;
    private boolean isBig;
    private String textViewText;
    private SupportFragment mFragment;

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    private TabViewChild(){

    }
    public TabViewChild(int imageViewSelIcon, int imageViewUnSelIcon, String textViewText, SupportFragment mFragment) {
        this.imageViewSelIcon = imageViewSelIcon;
        this.imageViewUnSelIcon=imageViewUnSelIcon;
        this.textViewText = textViewText;
        this.mFragment=mFragment;
    }


    public int getImageViewSelIcon() {
        return imageViewSelIcon;
    }


    public void setImageViewSelIcon(int imageViewSelIcon) {
        this.imageViewSelIcon = imageViewSelIcon;
    }


    public int getImageViewUnSelIcon() {
        return imageViewUnSelIcon;
    }


    public void setImageViewUnSelIcon(int imageViewUnSelIcon) {
        this.imageViewUnSelIcon = imageViewUnSelIcon;
    }


    public String getTextViewText() {
        return textViewText;
    }


    public void setTextViewText(String textViewText) {
        this.textViewText = textViewText;
    }


    public SupportFragment getmFragment() {
        return mFragment;
    }

    public void setmFragment(SupportFragment mFragment) {
        this.mFragment = mFragment;
    }
}
