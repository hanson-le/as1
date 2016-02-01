package com.example.hhle.hhle_fueltrack;

import java.util.ArrayList;
import java.util.Collections;

public class EntryLog {
    private static final EntryLog myInstance = new EntryLog();
    public static EntryLog getMyInstance() {
        return myInstance;
    }

    public EntryLog() {
        this.entryList = new ArrayList<Entry>();
    }

    private ArrayList<Entry> entryList;

    public void addEntry(Entry entry){
        entryList.add(entry);
        // http://stackoverflow.com/questions/10766492/what-is-the-simplest-way-to-reverse-an-arraylist
        Collections.reverse(entryList);
    }

    public void editEntry(int index,Entry entry){
        entryList.set(index, entry);
    }

    public Entry getEntry(int index) {
        return entryList.get(index);
    }

    public ArrayList<Entry> getEntryList() {
        return this.entryList;
    }

    public String totalFuelCosts(){
        double value = 0;
        int i = 0;
        while(i < entryList.size()) {
            value += entryList.get(i).getFuelCost();
            i++;

        }
        return String.format("%.2f", value);
    }
}
