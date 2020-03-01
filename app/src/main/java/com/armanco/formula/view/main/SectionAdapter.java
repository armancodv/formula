package com.armanco.formula.view.main;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.armanco.formula.R;
import com.armanco.formula.data.models.Section;
import com.armanco.formula.utils.Listener;
import com.armanco.formula.view.base.BaseAdapter;
import com.armanco.formula.view.base.BaseViewHolder;

import java.util.List;

public class SectionAdapter extends BaseAdapter<Section, Listener.SectionClickListener, SectionAdapter.ViewHolder> {

    SectionAdapter(List<Section> data, Context context, int layoutId) {
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
        holder.imageView.setImageResource(item.imageId);
    }

    public class ViewHolder extends BaseViewHolder {

        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.section_image);
        }

        @Override
        public void onClick(View v) {
            if(itemClickListener != null) {
                itemClickListener.onSectionClick(getAdapterPosition());
            }
        }


    }
}
