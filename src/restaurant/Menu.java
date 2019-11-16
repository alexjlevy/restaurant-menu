package restaurant;

import java.util.ArrayList;

public class Menu {
//
    protected String name;
    protected ArrayList <MenuItem> itemsList = new ArrayList<>();

        public Menu(String name) {
            this.name = name;
        }

        public  String getName() {return name; }
        public void setName (String aName) {name = aName;}

        public void addItem (MenuItem aItem) {itemsList.add(aItem);}

        public ArrayList<String> getItems() {
            ArrayList<String> itemsList = new ArrayList<>();

            for(MenuItem item : this.itemsList) {
                String menuItem = "";

                menuItem += "\n" + "Category: " + item.getCategory();
                menuItem += "\n" + item.getItemName();
                menuItem +=  "\n" + item.getDescription();
                menuItem += " - $" + item.getPrice() +"\n";

                itemsList.add(menuItem);

            }

            return itemsList;
        }

}
