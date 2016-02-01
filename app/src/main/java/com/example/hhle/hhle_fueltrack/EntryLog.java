package com.example.hhle.hhle_fueltrack;

/* A model class that hold all the individual logs. This class became a singleton class in order
to share its data with the other two activity classes. This class has a method that calculates the
total fuel costs. I wrongly decided to do it in here because of an earlier design choice. There is also
a method that returns the reverse of the Entry ArrayList. This is because one of the requirements was that
new log entries had to be lower on the screen and this was the only way I could do it.
 */

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

    public void addEntry(Entry entry) {
        entryList.add(entry);

    }

    public void editEntry(int index, Entry entry) {
        this.entryList.set(index, entry);
    }

    public Entry getEntry(int index) {
        return entryList.get(index);
    }

    public void setEntryList(ArrayList<Entry> entryList) {
        this.entryList = entryList;
    }

    public ArrayList<Entry> getEntryList() {
        return this.entryList;
    }

    public ArrayList<Entry> getreverseEntryList() {
        //https://ca.answers.yahoo.com/question/index?qid=20100401175631AAtN1Ez
        ArrayList<Entry> reverseList = new ArrayList<Entry>(this.entryList);
        Collections.reverse(reverseList);
        return reverseList;
    }

    public String totalFuelCosts() {
        double value = 0;
        int i = 0;
        while (i < entryList.size()) {
            value += Double.parseDouble(entryList.get(i).getFuelCost());
            i++;

        }
        return String.format("%.2f", value);
    }

}
