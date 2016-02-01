package com.example.hhle.hhle_fueltrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EntryLog myInstance = EntryLog.getMyInstance();
    ListView entryLogList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button addEntryButton = (Button) findViewById(R.id.btn_add_entry);

        addEntryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddEntryActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        ArrayAdapter<Entry> logsAdapter = new ArrayAdapter<Entry>(this,android.R.layout.simple_list_item_1, myInstance.getEntryList());
        entryLogList = (ListView) findViewById(R.id.entryLogList);
        entryLogList.setAdapter(logsAdapter);

        /*
        entryLogList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, )
            }
        });*/
    }

    @Override
    protected  void onResume() {
        super.onResume();

        TextView textView = (TextView) findViewById(R.id.total_fuel_cost);
        String fuelCostString = "Total Fuel Cost: $ " + myInstance.totalFuelCosts();
        textView.setTextSize(30);
        textView.setText(fuelCostString);

    }

}
