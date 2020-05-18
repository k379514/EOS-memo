package com.example.eosadvanced.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.eosadvanced.R;

public class MemoViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView text;
    public TextView date;

    public MemoViewHolder(View view){
        super(view);
        title=view.findViewById(R.id.item_title);
        text=view.findViewById(R.id.item_text);
        date=view.findViewById(R.id.item_date);
    }

}
