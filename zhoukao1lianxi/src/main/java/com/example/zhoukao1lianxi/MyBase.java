package com.example.zhoukao1lianxi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhoukao1lianxi.bean.Beanner;

import java.util.List;

public class MyBase extends BaseAdapter {
    private Context context;
    private List<Beanner> list;

    public MyBase(Context context, List<Beanner> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Hand hand=null;
        if(convertView==null){
            convertView=View.inflate(context, R.layout.gvlist,null);
            hand=new Hand();

            hand.tv=convertView.findViewById(R.id.tv);
            hand.im=convertView.findViewById(R.id.im);
            convertView.setTag(hand);
        }else{
            hand= (Hand) convertView.getTag();
        }
        Beanner beanner = list.get(position);
        String title = beanner.getTitle();
        String imageurl = beanner.getImageurl();
        hand.tv.setText(title);
        NetUtil instance = NetUtil.getInstance();
        instance.doIm(imageurl,hand.im);
        return convertView;
    }
    class Hand{
        private ImageView im;
        private TextView tv;
    }
}
