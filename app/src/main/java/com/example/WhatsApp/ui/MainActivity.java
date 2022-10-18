package com.example.WhatsApp.ui;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.WhatsApp.ui.adapter.MainViewPagerAdapter;
import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager;

    String arr [] = {"Chat","Status", "Call"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intUI();

        MainViewPagerAdapter adapter=new MainViewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        adapter.addFragmint(new ChatFragmint());
        adapter.addFragmint(new StatusFragmint());
        adapter.addFragmint(new CallFragmint());

        new TabLayoutMediator(tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                tab.setText(arr[position]);
            }
        }).attach();

        viewPager.setAdapter(adapter);

    }

    private void intUI() {
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.view_pager_container);

    }


}