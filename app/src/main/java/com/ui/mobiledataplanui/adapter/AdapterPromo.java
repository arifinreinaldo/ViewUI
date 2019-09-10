package com.ui.mobiledataplanui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ui.mobiledataplanui.R;
import com.ui.mobiledataplanui.module.PojoPromo;
import com.ui.mobiledataplanui.ui.MainListener;

import java.util.List;

public class AdapterPromo<MainL> extends RecyclerView.Adapter<AdapterPromoViewHolder> {
    private Context ctx;
    private List<PojoPromo> list;
    private MainListener listener;

    public AdapterPromo(Context ctx, List<PojoPromo> list, MainListener listener) {
        this.ctx = ctx;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public AdapterPromoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_promo, viewGroup, false);
        return new AdapterPromoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPromoViewHolder adapterPromoViewHolder, int i) {
        adapterPromoViewHolder.getIvPromo().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.getPromo();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
