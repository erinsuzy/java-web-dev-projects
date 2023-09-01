package org.launchcode;

import org.launchcode.MenuItem;
import org.launchcode.Menu;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MenuItem fishTacos = new MenuItem(12.99, "Fish Tacos", "Main", true);
        MenuItem gardenSalad = new MenuItem(4.99, "Garden Salad", "Appetizer", false);
        MenuItem cheesecake = new MenuItem(2.99, "Cheesecake", "Dessert", false);



        Menu myMenu = new Menu();
        myMenu.addItem(fishTacos);
        myMenu.addItem(gardenSalad);
        myMenu.addItem(cheesecake);

        System.out.println(myMenu);




    }
}
