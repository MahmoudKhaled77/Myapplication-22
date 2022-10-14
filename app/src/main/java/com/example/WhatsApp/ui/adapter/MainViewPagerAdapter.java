package com.example.WhatsApp.ui.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.WhatsApp.ui.CallFragmint;
import com.example.WhatsApp.ui.ChatFragmint;
import com.example.WhatsApp.ui.StatusFragmint;

import java.util.ArrayList;

public class MainViewPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment>fragmentList=new ArrayList<>();
    ArrayList<String>titleslist=new ArrayList<>();


    public MainViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void addFragmint(Fragment fragment,String title){
        fragmentList.add(fragment);
        titleslist.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleslist.get(position);
    }
}
