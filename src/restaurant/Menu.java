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

                menuItem += item.getCategory() +"\n";
                menuItem += item.getItemName() +"\n";
                menuItem += item.getDescription() +"\n";
                menuItem += item.getPrice();

                itemsList.add(menuItem);

            }

            return itemsList;
        }

}
