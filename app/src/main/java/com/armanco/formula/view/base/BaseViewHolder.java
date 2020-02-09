package com.armanco.formula.view.base;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public BaseViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

}

