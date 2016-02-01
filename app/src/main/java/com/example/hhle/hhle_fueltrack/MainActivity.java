package com.example.hhle.hhle_fueltrack;

/*
The main activity that deals with most of the User Interface and showing the log entry.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EntryLog myInstance = EntryLog.getMyInstance();
    private ListView entryLogList;
    private Button addEntryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addEntryButton = (Button) findViewById(R.id.btn_add_entry);

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

        ArrayAdapter<Entry> logsAdapter = new ArrayAdapter<Entry>(this,android.R.layout.simple_list_item_1, myInstance.getreverseEntryList());
        entryLogList = (ListView) findViewById(R.id.entryLogList);
        entryLogList.setAdapter(logsAdapter);


        entryLogList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Entry entry = (Entry) parent.getItemAtPosition(position);
                int entryListIndex = myInstance.getEntryList().indexOf(entry);
                Intent intent = new Intent(MainActivity.this, AddEntryActivity.class);
                intent.putExtra("Edit", entryListIndex);
                startActivity(intent);
            }
        });
    }

    @Override
    protected  void onResume() {
        super.onResume();

        // display the total fuel cost
        // http://stackoverflow.com/questions/5477341/update-android-textview
        TextView textView = (TextView) findViewById(R.id.total_fuel_cost);
        String fuelCostString = "Total Fuel Cost: $ " + myInstance.totalFuelCosts();
        textView.setTextSize(30);
        textView.setText(fuelCostString);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }


}
