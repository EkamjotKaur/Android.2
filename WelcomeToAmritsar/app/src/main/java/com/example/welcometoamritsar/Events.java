package com.example.welcometoamritsar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        ArrayList<Item> events = new ArrayList<Item>();
        events.add(new Item("Ram Tirath Fair","In the month of November",R.drawable.ram_tirath_fair,false));
        events.add(new Item("Basant Panchami","16 February",R.drawable.basant_panchami,false));
        events.add(new Item("Baisakhi","14 April",R.drawable.baisakhi,false));
        events.add(new Item("Lohri","13 January",R.drawable.lohri,false));
        events.add(new Item("Baba Bakala Festival","18 April",R.drawable.baba_bakala,false));
        events.add(new Item("Hola Mohalla","29 March",R.drawable.hola_mohalla,false));
        ItemAdapter itemAdapter= new ItemAdapter(this,events,R.color.events);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}