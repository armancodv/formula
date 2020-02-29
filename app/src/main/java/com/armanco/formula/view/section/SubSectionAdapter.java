package com.armanco.formula.view.section;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.armanco.formula.data.models.SubSection;
import com.armanco.formula.view.base.BaseAdapter;
import com.armanco.formula.view.base.BaseViewHolder;

import java.util.List;

public class SubSectionAdapter extends BaseAdapter<SubSection, SubSectionClickListener, SubSectionAdapter.ViewHolder> {

    public SubSectionAdapter(List<SubSection> data, Context context, int layoutId) {
        super(data, context, layoutId);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(layoutId, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    public class ViewHolder extends BaseViewHolder {

        ViewHolder(View itemView) {
            super(itemView);
        }


        @Override
        public void onClick(View v) {
            if (itemClickListener != null) {
                itemClickListener.onSubSectionClick(getAdapterPosition());
            }

        }
    }
}
