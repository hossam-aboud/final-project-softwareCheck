package com.abuqusai.softwarecheck_lab.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.abuqusai.softwarecheck_lab.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.namesViewHolder> {

    static ArrayList<String> names ;

    public Adapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public namesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.name_layout,null);
        namesViewHolder holder = new namesViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull namesViewHolder holder, int position) {
        String name = names.get(position);
        holder.bind(name);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public static int getArrayCount() {
        return names.size();
    }

    class namesViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name ;
        LinearLayout card;

        String name;

        public namesViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.layout_name);
            card = itemView.findViewById(R.id.layout_card);

        }

        public void bind(String name) {
            this.name = name ;

            tv_name.setText(this.name);
        }
    }
}
