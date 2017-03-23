package com.example.aotuman.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aotuman.anim.ExpandableViewHoldersUtil;
import com.example.aotuman.expandablerecycleview.R;


/**
 * Created by aotuman on 2017/3/23.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    ExpandableViewHoldersUtil.KeepOneH<MyViewHolder> keepOne = new ExpandableViewHoldersUtil.KeepOneH<>();

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        keepOne.bind(holder,position);
        holder.getTitle().setText("title"+position);
        holder.getContent().setText("content"+position);
        holder.getTitle().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                keepOne.toggle(holder);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
