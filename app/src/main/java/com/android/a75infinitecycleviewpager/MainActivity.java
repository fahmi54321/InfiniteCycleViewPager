package com.android.a75infinitecycleviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(R.drawable.batik_kawung);
        list.add(R.drawable.batik_lasem);
        list.add(R.drawable.batik_mega_mendung);
        list.add(R.drawable.batik_parang_kusumo);

        HorizontalInfiniteCycleViewPager pager = (HorizontalInfiniteCycleViewPager) findViewById(R.id.horizontal_cycle);
        MyAdapter adapter = new MyAdapter(list,getBaseContext());
        pager.setAdapter(adapter);
    }
}