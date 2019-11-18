package com.company;

import restaurant.Menu;
import restaurant.MenuItem;
import java.util.Calendar;


public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu("Yellowbelly");

        menu.addItem(new MenuItem("Salmon",32.00 , "Seared Salmon with fried rice", "Entree"));
        menu.addItem(new MenuItem("Fries",7.00  ,"Cooked in beef fat","Side"));
        menu.addItem(new MenuItem("Busch",4.00 ,"You know.","Beverage"));
        menu.addItem(new MenuItem("Art of Neurosis"));
        menu.addItem(new MenuItem("Art of Neurosis"));
        menu.removeItem("Busch");
        menu.getName();
        menu.getLastUpdate();
        menu.getItemsList();
        menu.getSingleItem("Fries");

    }
}
