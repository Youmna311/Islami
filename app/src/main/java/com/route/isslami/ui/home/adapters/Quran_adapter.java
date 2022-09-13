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

public class Quran_adapter extends RecyclerView.Adapter<Quran_adapter.QuranViewholder> {


    String[] suranames = {};
    public Quran_adapter(String[] suranames) {
        this.suranames = suranames;
    } //constructor

    public ArrayList<String> suralines;
    public Quran_adapter(ArrayList<String> suralines) {
        this.suralines = suralines;
    } //constructor

    @NonNull
    @Override
    public QuranViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.suraname_template, parent, false);
        return new QuranViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuranViewholder holder, @SuppressLint("RecyclerView") int position) {
        holder.suraname.setText(suranames[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                suraitem.onitemclicklistenrt(suranames[position], position);
            }
        });
    }

    public interface Onitemclickinterface {
        void onitemclicklistenrt(String itemname, int index);
    }

    public Onitemclickinterface suraitem;

    @Override
    public int getItemCount() {
        return suranames.length;
    }

    class QuranViewholder extends RecyclerView.ViewHolder {
        TextView suraname;

        public QuranViewholder(@NonNull View itemView) {
            super(itemView);
            suraname = itemView.findViewById(R.id.suraname_templateitem);
        }
    }
}