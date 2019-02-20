package com.example.ets_1023.arrdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fnLoadImg(Context mContext, ImageView mImg, String mUrl) {
        Glide.with(mContext)
                .load(mUrl)
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .into(mImg);
    }
}
