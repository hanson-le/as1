package com.example.hhle.hhle_fueltrack;

import java.util.ArrayList;

public class EntryLog {
    private static final EntryLog myInstance = new EntryLog();
    public static EntryLog getMyInstance() {
        return myInstance;
    }

    private ArrayList<Entry> entryList;

    public void addEntry(Entry entry){
        entryList.add(entry);
    }

    public void editEntry(int index,Entry entry){
        entryList.set(index, entry);
    }

    public Entry getEntry(int index) {
        return entryList.get(index);
    }
}
