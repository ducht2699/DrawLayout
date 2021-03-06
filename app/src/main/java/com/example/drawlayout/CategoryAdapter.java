package com.example.drawlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private List<CategoryItem> categoryItems;
    private Context context;

    public CategoryAdapter(List<CategoryItem> categoryItems, Context context) {
        this.categoryItems = categoryItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.category_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CategoryItem categoryItem = categoryItems.get(position);
        holder.m_imvIcon.setBackgroundResource(categoryItem.getM_iIcon());
        holder.m_tvName.setText(categoryItem.getM_sName());
    }

    @Override
    public int getItemCount() {
        return categoryItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView m_imvIcon;
        private TextView m_tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            m_imvIcon = itemView.findViewById(R.id.imv_category_icon);
            m_tvName = itemView.findViewById(R.id.tv_category_name);
        }
    }
}
