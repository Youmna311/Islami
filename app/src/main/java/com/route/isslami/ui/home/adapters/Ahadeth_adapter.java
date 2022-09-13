package com.route.isslami.ui.home.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.route.isslami.R;

import java.util.ArrayList;

public class Ahadeth_adapter extends RecyclerView.Adapter<Ahadeth_adapter.AhadethViewholder> {

    String[] ahadeth = new String[50];

    public Ahadeth_adapter(String[] ahadeth) {
        this.ahadeth = ahadeth;
    }

//    public ArrayList<String> hadethlines;
//
//    public Ahadeth_adapter(ArrayList<String> hadethlines) {
//        this.hadethlines = hadethlines;
//    }


    @NonNull
    @Override
    public AhadethViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ahadeth_template, parent, false);
        return new AhadethViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AhadethViewholder holder, @SuppressLint("RecyclerView") int position) {

        holder.hadethno.setText(ahadeth[position]);
        holder.hadethno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hadethitem.onhadethclickfun(ahadeth[position], position);

            }
        });
    }

    public interface Onhadethclickedinterface {
        public void onhadethclickfun(String itemname, int index);
    }
    public Onhadethclickedinterface hadethitem;
    @Override
    public int getItemCount() {
        return ahadeth.length;
    }

    class AhadethViewholder extends RecyclerView.ViewHolder {

        TextView hadethno;

        public AhadethViewholder(@NonNull View itemView) {
            super(itemView);
            hadethno = itemView.findViewById(R.id.ahaethno);

        }
    }
}
