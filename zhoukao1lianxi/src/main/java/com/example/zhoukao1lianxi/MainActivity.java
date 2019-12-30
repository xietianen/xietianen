package com.example.zhoukao1lianxi;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.zhoukao1lianxi.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private android.support.v4.view.ViewPager vp;
    private android.support.design.widget.TabLayout tab;

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);
    }

    @Override
    protected void initListener() {

        MyVp myVp=new MyVp(getSupportFragmentManager());
        vp.setAdapter(myVp);
        tab.setupWithViewPager(vp);

    }

    @Override
    protected void initData() {

    }
}
