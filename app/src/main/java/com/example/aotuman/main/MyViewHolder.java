package com.example.aotuman.main;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.aotuman.anim.ExpandableViewHoldersUtil;
import com.example.aotuman.expandablerecycleview.R;


/**
 * Created by aotuman on 2017/3/23.
 */

public class MyViewHolder extends RecyclerView.ViewHolder implements ExpandableViewHoldersUtil.Expandable{

    private TextView title;
    private TextView content;

    public MyViewHolder(View itemView) {
        super(itemView);
        title = ((TextView) itemView.findViewById(R.id.title));
        content = ((TextView) itemView.findViewById(R.id.content));
    }

    @Override
    public View getExpandView() {
        return content;
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getContent() {
        return content;
    }
}
