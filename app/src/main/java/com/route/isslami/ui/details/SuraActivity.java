package com.route.isslami.ui.details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.route.isslami.R;
import com.route.isslami.ui.home.adapters.Quran_adapter;
import com.route.isslami.ui.home.adapters.suraverse_adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SuraActivity extends AppCompatActivity {
    ArrayList<String> suralist= new ArrayList<String>();
    RecyclerView suralinesrv;
    suraverse_adapter suraverse_adapter;
    TextView suranametv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura);
        suralinesrv=findViewById(R.id.suralinesrv);
        suranametv= findViewById(R.id.suranames);
        String SuraName = getIntent().getStringExtra("SuraName");
        suranametv.setText(SuraName);
        String FileName = getIntent().getStringExtra("FileName");
        readsurafile(FileName);
        //Log.e("FileName",FileName);
        suraverse_adapter = new suraverse_adapter(suralist);
        suralinesrv.setAdapter(suraverse_adapter);
    }

    private void readsurafile(String fileName)
    {
        BufferedReader reader;
        try{
            final InputStream file = getAssets().open(fileName);
            reader = new BufferedReader(new InputStreamReader(file));
            String line = reader.readLine();
            while(line != null){
                //Log.e("readsurafilefun",line);
                suralist.add(line);
                line = reader.readLine();
            }
        } catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}