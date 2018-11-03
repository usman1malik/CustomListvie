package com.malik.usman.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
int pic_arr[]={R.drawable.mercedes2,R.drawable.mercedes11,R.drawable.mercedes12,R.drawable.merceds,R.drawable.pradonew,R.drawable.prado};
String Car_name[]={"Mercedes","mercedes Benz","Luxury","Mercedes Outclass","Prado","Prado new"};
String Car_model[]={"2007","2018","2016","2019","2014","2013"};
String Car_price[]={"Price:40L","Price:30L","Price:45L","Price:20L","Price:21L","Price:23L"};
    ListView l1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       l1= findViewById(R.id.lstv1);



   Adapter abc = new Adapter(this,pic_arr);
   Adapter bc = new Adapter(this,Car_model);
l1.setAdapter(abc);
l1.setAdapter(bc);


    }
}
