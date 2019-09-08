package com.ui.mobiledataplanui.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ui.mobiledataplanui.R;
import com.ui.mobiledataplanui.util;

class AdapterPriceViewHolder extends RecyclerView.ViewHolder {
    private TextView tvNominal;
    private Button btPrice;
    private util util;
    public AdapterPriceViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNominal = itemView.findViewById(R.id.adapterPricetvNominalValue);
        btPrice = itemView.findViewById(R.id.adapterPriceBtPrice);
        util = new util();
    }

    public void setTvNominal(int nominal) {
        this.tvNominal.setText(util.convertNumbers(nominal));
    }

    public void setBtPrice(int price) {
        this.btPrice.setText(util.convertNumbers(price));
    }
}
