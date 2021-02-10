package com.example.welcometoamritsar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        ArrayList<Item> restaurants = new ArrayList<Item>();
        restaurants.add(new Item("Kesar Da Dhaba","12:00-16:45 and 18:00-21:00",R.drawable.kesar_dhaba,true));
        restaurants.add(new Item("Beera Chicken Corner","12:30-23:00",R.drawable.beera_corner,true));
        restaurants.add(new Item("Giani Tea Stall","04:30-20:00",R.drawable.giani_tea,true));
        restaurants.add(new Item("La Roma Pizzeria","11:00-23:00",R.drawable.pizzeria,true));
        restaurants.add(new Item("Bella Italian Trattoria","07:00-23:30",R.drawable.bella_italian,true));
        restaurants.add(new Item("ThaiChi","07:00-23:30",R.drawable.thaichi,true));
        restaurants.add(new Item("The Kulcha Land","10:00-17:30",R.drawable.kulcha_land,true));
        restaurants.add(new Item("Makhan Fish Corner","11:00-23:30",R.drawable.makhan_fish,true));

        ItemAdapter itemAdapter = new ItemAdapter(this,restaurants,R.color.restaurants);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item currItem = restaurants.get(position);
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