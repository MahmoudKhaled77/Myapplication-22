package com.example.WhatsApp.ui;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.WhatsApp.ui.adapter.MainViewPagerAdapter;
import com.example.myapplication.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intUI();
        tabLayout.setupWithViewPager(viewPager);
        MainViewPagerAdapter adapter=new MainViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragmint(new ChatFragmint(),"Chat");
        adapter.addFragmint(new StatusFragmint(),"Status");
        adapter.addFragmint(new CallFragmint(),"Call");
        viewPager.setAdapter(adapter);

    }

    private void intUI() {
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.view_pager_container);

    }


}