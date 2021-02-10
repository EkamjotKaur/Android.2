package com.example.welcometoamritsar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TopAttractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_attractions);

        ArrayList<Item> topAttractions = new ArrayList<Item>();
        topAttractions.add(new Item("Sri Harmandir Sahib","Open 24 hrs",R.drawable.harmandir_sahib,true));
        topAttractions.add(new Item("JallainWala Bagh","10:00-18:00",R.drawable.jallianwala_bagh,true));
        topAttractions.add(new Item("Partition Museum","10:00-18:00",R.drawable.partition_museum,true));
        topAttractions.add(new Item("Akal Takht","02:30-22:00",R.drawable.akal_takht,true));
        topAttractions.add(new Item("Sadda Pind","10:30-21:30",R.drawable.sadda_pind,true));
        topAttractions.add(new Item("Central Sikh Museum","09:00-16:00\nSaturday:Closed Sunday:Closed",R.drawable.central_sikh_museum,true));
        topAttractions.add(new Item("Ram Tirath Road","Open 24 hrs",R.drawable.ram_tirath_road,true));
        topAttractions.add(new Item("Wagah Border","10:00-16:00",R.drawable.wagah_border,true));

        ItemAdapter itemAdapter = new ItemAdapter(this,topAttractions,R.color.topAttractions);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Item currItem = topAttractions.get(position);
                Uri gmmIntentUri = Uri.parse("google.navigation:q="+currItem.getName());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}