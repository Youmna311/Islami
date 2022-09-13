
package com.route.isslami.ui.home.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.route.isslami.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class suraverse_adapter extends RecyclerView.Adapter<suraverse_adapter.suraverse_Viewholder> {

    public ArrayList<String> suranames;
    public suraverse_adapter(ArrayList<String> suralines) {
        this.suranames = suralines;} //constructor

    @NonNull
    @Override
    public suraverse_Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.suraname_template, parent, false);
        return new suraverse_Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull suraverse_Viewholder holder, @SuppressLint("RecyclerView") int position) {
        holder.suraname.setText(suranames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                suraitem.onitemclicklistenrt(suranames.get(position), position);
            }
        });
    }

    public interface Onitemclickinterface {
        void onitemclicklistenrt(String itemname, int index);
    }

    public Onitemclickinterface suraitem;

    @Override
    public int getItemCount() {
        return suranames.size();
    }

    class suraverse_Viewholder extends RecyclerView.ViewHolder {
        TextView suraname;

        public suraverse_Viewholder(@NonNull View itemView) {
            super(itemView);
            suraname = itemView.findViewById(R.id.suraname_templateitem);
        }
    }
}