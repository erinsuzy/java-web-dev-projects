package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate lastUpdated = LocalDate.now();
    private ArrayList<MenuItem> items;

    public Menu() {
        this.lastUpdated = LocalDate.now();
        this.items = new ArrayList<>();
    }
    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) { this.items = items; }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

     public void addItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = LocalDate.now();
    }

    public String toString() {
        String outputString = "";
        for (MenuItem item : this.items) {
            outputString = outputString + item.toString() + "\n";
        }
        return outputString;
    }

}


