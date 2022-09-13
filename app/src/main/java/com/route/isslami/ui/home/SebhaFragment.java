package com.route.isslami.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.route.isslami.R;


public class SebhaFragment extends Fragment {

    Button counter;
    Button zekr;
    int count=0;
    String azkars [] = new String[]{"سبحان الله","اللهم صلي على النبي","لا حول ولا قوة الا بالله","لا اله الا الله","الحمدلله","استغر الله"};
    public SebhaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sebha, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        counter= view.findViewById(R.id.counterbutton);
        zekr=view.findViewById(R.id.zekrbutton);
        counter.setText(count+"");
        zekr.setText(azkars[1]);

        zekr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                if (0 < count && count <= 33) {
                    zekr.setText(azkars[1]);
                    counter.setText(count + "");
                    //count++;
                } else if (33 < count && count <= 66) {
                    zekr.setText(azkars[2]);
                    counter.setText((count - 33) + "");

                } else if (66 < count && count <= 99) {
                    zekr.setText(azkars[3]);
                    counter.setText((count - 66) + "");
                }

            }

        });


    }
}