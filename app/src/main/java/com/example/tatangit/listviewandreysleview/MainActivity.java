package com.example.tatangit.listviewandreysleview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tatangit.listviewandreysleview.Adapter.ViewPagerAdapter;
import com.example.tatangit.listviewandreysleview.Fragment.FragmentGridView;
import com.example.tatangit.listviewandreysleview.Fragment.FragmentListView;
import com.example.tatangit.listviewandreysleview.Fragment.FragmentRecyclerview;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tabs)
    TabLayout tableLayout;

    @BindView(R.id.viewpager)
    ViewPager viewPager;

    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupViewPager(viewPager);
        tableLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FragmentListView(), "ListView");
        viewPagerAdapter.addFragment(new FragmentRecyclerview(), "Recyclerview");
        viewPagerAdapter.addFragment(new FragmentGridView(), "GridView");
        viewPager.setAdapter(viewPagerAdapter);
    }


}
