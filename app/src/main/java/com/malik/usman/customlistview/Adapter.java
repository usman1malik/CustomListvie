package com.malik.usman.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class Adapter extends BaseAdapter {
LayoutInflater inflater,inflate2;
Context Activtyontext,Activitytext2;
int[] pic_array;
String[] cr_model;

    public Adapter(Context activtyontext, int[] pic_array) {
        inflater=(LayoutInflater.from(activtyontext));
        this.Activtyontext = Activtyontext;
        this.pic_array = pic_array;
    }

    public Adapter(Context activitytext2, String[] Car_model) {
        inflate2=(LayoutInflater.from(activitytext2));
        this.Activitytext2= Activitytext2;
        this.cr_model= Car_model;
    }

    @Override
    public int getCount() {
        return pic_array.length ;
    }

    @Override
    public Object getItem(int i) {
        return pic_array[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.design,null);

        ImageView imgv1=view.findViewById(R.id.imgv1);
        TextView model_txt=view.findViewById(R.id.txtv2);
        imgv1.setImageResource(pic_array[i]);
        model_txt.setText(cr_model[i]);

        return view;
    }
}
