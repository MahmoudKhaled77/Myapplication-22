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

public class MainViewPagerAdapter extends FragmentStateAdapter {
    ArrayList<Fragment>fragmentList=new ArrayList<>();


    public MainViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    public void addFragmint(Fragment fragment){
        fragmentList.add(fragment);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();
    }
}
