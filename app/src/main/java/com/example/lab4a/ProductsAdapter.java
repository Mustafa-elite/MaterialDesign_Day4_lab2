package com.example.lab4a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {


    List<Mobile> mobiles;

    public ProductsAdapter(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.textTitle.setText(mobiles.get(position).getMobileName());
        holder.textDescription.setText(mobiles.get(position).getMobileDescription());
        holder.productImage.setImageResource(mobiles.get(position).getImage());
        holder.productIcon.setImageResource(R.drawable.baseline_add_box_24);

    }

    @Override
    public int getItemCount() {
        return mobiles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage,productIcon;
        TextView textTitle,textDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage=itemView.findViewById(R.id.productImage);
            productIcon=itemView.findViewById(R.id.productIcon);
            textTitle=itemView.findViewById(R.id.textTitle);
            textDescription=itemView.findViewById(R.id.textDescription);
        }
    }
}
