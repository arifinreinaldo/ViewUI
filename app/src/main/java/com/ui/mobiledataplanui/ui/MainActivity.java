package com.ui.mobiledataplanui.ui;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.WindowManager;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.ui.mobiledataplanui.R;
import com.ui.mobiledataplanui.adapter.AdapterPrice;
import com.ui.mobiledataplanui.adapter.AdapterPromo;
import com.ui.mobiledataplanui.module.PojoPromo;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements MainListener{
    private ViewPager viewPager;
    private RecyclerView rvPromo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        rvPromo = findViewById(R.id.rvPromo);

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Pulsa", PaymentFragment.class)
                .add("Data Package", PaymentFragment.class)
                .create());

        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(viewPager);
        setTitlePage("Top Up");

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);


    }

    @Override
    protected void onResume() {
        super.onResume();
        LinearLayoutManager layoutManagerDay
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        layoutManagerDay.setReverseLayout(true);
        rvPromo.setLayoutManager(layoutManagerDay);
        SnapHelper helper = new LinearSnapHelper();
        rvPromo.setOnFlingListener(null);
        helper.attachToRecyclerView(rvPromo);
        AdapterPromo mAdapter = new AdapterPromo(MainActivity.this, getDailyData(),this);
        rvPromo.setAdapter(mAdapter);
    }

    @Override
    public void getPromo() {
        startActivity(new Intent(MainActivity.this, PromoActivity.class));
    }
    private ArrayList<PojoPromo> getDailyData(){
        ArrayList<PojoPromo> promos = new ArrayList<>();
        promos.add(new PojoPromo("12"));
        promos.add(new PojoPromo("13"));
        return promos;
    }
}
