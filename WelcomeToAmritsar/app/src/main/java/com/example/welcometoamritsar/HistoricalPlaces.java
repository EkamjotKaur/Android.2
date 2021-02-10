package com.example.welcometoamritsar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_places);

        ArrayList<Item> historicalPlaces = new ArrayList<Item>();
        historicalPlaces.add(new Item("Sri Harmandir Sahib","Open 24 hrs",R.drawable.harmandir_sahib,true));
        historicalPlaces.add(new Item("JallianWala Bagh","10:00-18:00",R.drawable.jallianwala_bagh,true));
        historicalPlaces.add(new Item("Akal Takht","02:30-22:00",R.drawable.akal_takht,true));
        historicalPlaces.add(new Item("Wagah Border","10:00-16:00",R.drawable.wagah_border,true));
        historicalPlaces.add(new Item("Maharaja Ranjit Singh Museum","09:00-18:00",R.drawable.ranjit_singh_museum,true));
        historicalPlaces.add(new Item("Sri Ram Tirath Ashram","Open 24 hrs",R.drawable.ram_tirath_road,true));
        historicalPlaces.add(new Item("Durgiana Temple","06:00-22:00",R.drawable.durgiana_temple,true));
        historicalPlaces.add(new Item("Gobindgarh Fort","10:00-22:00",R.drawable.gobindgarh_fort,true));
        historicalPlaces.add(new Item("Jama Masjid Kairuddin","09:00-18:00",R.drawable.masjid,true));
        historicalPlaces.add(new Item("Pul Kanjri","10:00-18:00",R.drawable.pul_kanjri,true));


        ItemAdapter itemAdapter = new ItemAdapter(this,historicalPlaces,R.color.historical);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item currItem = historicalPlaces.get(position);
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