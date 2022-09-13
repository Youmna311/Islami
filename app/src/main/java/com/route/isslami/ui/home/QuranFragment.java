package com.route.isslami.ui.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.route.isslami.R;
import com.route.isslami.ui.details.SuraActivity;
import com.route.isslami.ui.home.adapters.Quran_adapter;
import com.route.isslami.ui.home.adapters.Quran_adapter.Onitemclickinterface;
import com.route.isslami.ui.home.adapters.suraverse_adapter;


public class QuranFragment extends Fragment {

    RecyclerView surasnamerv;
    String surasnames []={"الفاتحه","البقرة","آل عمران","النساء","المائدة","الأنعام","الأعراف","الأنفال","التوبة","يونس","هود"
            ,"يوسف","الرعد","إبراهيم","الحجر","النحل","الإسراء","الكهف","مريم","طه","الأنبياء","الحج","المؤمنون"
            ,"النّور","الفرقان","الشعراء","النّمل","القصص","العنكبوت","الرّوم","لقمان","السجدة","الأحزاب","سبأ"
            ,"فاطر","يس","الصافات","ص","الزمر","غافر","فصّلت","الشورى","الزخرف","الدّخان","الجاثية","الأحقاف"
            ,"محمد","الفتح","الحجرات","ق","الذاريات","الطور","النجم","القمر","الرحمن","الواقعة","الحديد","المجادلة"
            ,"الحشر","الممتحنة","الصف","الجمعة","المنافقون","التغابن","الطلاق","التحريم","الملك","القلم","الحاقة","المعارج"
            ,"نوح","الجن","المزّمّل","المدّثر","القيامة","الإنسان","المرسلات","النبأ","النازعات","عبس","التكوير","الإنفطار"
            ,"المطفّفين","الإنشقاق","البروج","الطارق","الأعلى","الغاشية","الفجر","البلد","الشمس","الليل","الضحى","الشرح"
            ,"التين","العلق","القدر","البينة","الزلزلة","العاديات","القارعة","التكاثر","العصر",
            "الهمزة","الفيل","قريش","الماعون","الكوثر","الكافرون","النصر","المسد","الإخلاص","الفلق","الناس"};
    public QuranFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quran, container, false);
    }

     @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);
         surasnamerv= view.findViewById(R.id.suranamesrv);
         Quran_adapter quranobj = new Quran_adapter(surasnames);
         quranobj.suraitem= new Onitemclickinterface() {
             @Override
             public void onitemclicklistenrt(String itemname, int index) {
                 startscreen(itemname,index+1+".txt");
             }
         };
         surasnamerv.setAdapter(quranobj);
     }

    private void startscreen(String suraname,String filename) {
        // start quran screen according to sura name
        Intent intent = new Intent(getActivity(), SuraActivity.class);
        intent.putExtra("SuraName", suraname);
        intent.putExtra("FileName",filename);
        startActivity(intent);





    }


}