package com.armanco.formula.view.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class BaseAdapter<D, L, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {
    protected List<D> data;
    protected LayoutInflater inflater;
    protected L itemClickListener;
    protected int position;
    protected D item;
    protected int layoutId;
    protected Context context;

    public BaseAdapter(List<D> data, Context context, int layoutId) {
        this.data = data;
        this.inflater = LayoutInflater.from(context);
        this.layoutId = layoutId;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    @Override
    public void onBindViewHolder(@NonNull V holder, int position) {
        this.position = position;
        item = data.get(position);
    }

    public D getItem() {
        return item;
    }

    public int getPosition() {
        return position;
    }

    public void setClickListener(L itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

}
