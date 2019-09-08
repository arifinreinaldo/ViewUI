package com.ui.mobiledataplanui.ui;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import com.ui.mobiledataplanui.R;
import com.ui.mobiledataplanui.adapter.AdapterPrice;
import com.ui.mobiledataplanui.module.PojoPrice;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaymentFragment extends Fragment {
    private RecyclerView rvPrice;
    private AdapterPrice adapterPrice;
    public PaymentFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_payment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        rvPrice = view.findViewById(R.id.rvPricing);

        LinearLayoutManager layoutManagerDayVerti
                = new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false);
        rvPrice.setLayoutManager(layoutManagerDayVerti);
        adapterPrice = new AdapterPrice(this.getContext(), getPricelist());
        rvPrice.setAdapter(adapterPrice);
    }

    private ArrayList<PojoPrice> getPricelist(){
        ArrayList<PojoPrice> rtn = new ArrayList<>();
        rtn.add(new PojoPrice(25000,25000));
        rtn.add(new PojoPrice(50000,50000));
        rtn.add(new PojoPrice(100000,100000));
        rtn.add(new PojoPrice(195000,200000));
        return rtn;
    }
}
