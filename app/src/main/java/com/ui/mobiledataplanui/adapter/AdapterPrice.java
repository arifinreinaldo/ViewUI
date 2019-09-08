package com.ui.mobiledataplanui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ui.mobiledataplanui.R;
import com.ui.mobiledataplanui.module.PojoPrice;

import java.util.List;

public class AdapterPrice extends RecyclerView.Adapter<AdapterPriceViewHolder> {
    private Context ctx;
    private List<PojoPrice> priceList;

    public AdapterPrice(Context ctx, List<PojoPrice> priceList) {
        this.ctx = ctx;
        this.priceList = priceList;
    }

    @NonNull
    @Override
    public AdapterPriceViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_price, viewGroup, false);
        return new AdapterPriceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPriceViewHolder adapterPriceViewHolder, int i) {
        PojoPrice price = priceList.get(i);
        adapterPriceViewHolder.setBtPrice(price.getPrice());
        adapterPriceViewHolder.setTvNominal(price.getNominal());

    }

    @Override
    public int getItemCount() {
        return priceList.size();
    }
}
