package com.example.user301.childsshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Product> products;

    public DataAdapter(Context context, List<Product> products) {
        this.inflater = LayoutInflater.from(context);
        this.products = products;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Product product = products.get(i);
        viewHolder.imageView.setImageResource(product.getImage());
        viewHolder.nameView.setText(product.getName());
        viewHolder.priceView.setText(product.getPrice());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        final ImageView imageView;
        final TextView nameView, priceView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.image);
            this.nameView = itemView.findViewById(R.id.name);
            this.priceView = itemView.findViewById(R.id.price);
        }
    }
}
