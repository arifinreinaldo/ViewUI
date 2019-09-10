package com.ui.mobiledataplanui.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.ui.mobiledataplanui.R;

class AdapterPromoViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivPromo;
    public AdapterPromoViewHolder(@NonNull View itemView) {
        super(itemView);
        ivPromo = itemView.findViewById(R.id.ivPromo);
    }

    public ImageView getIvPromo() {
        return ivPromo;
    }
}
