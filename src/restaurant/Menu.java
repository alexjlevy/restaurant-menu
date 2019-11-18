package restaurant;

import java.util.ArrayList;
import java.util.Calendar;

public class Menu {
//
    private String name;
    private Calendar lastUpdate;
    private ArrayList <MenuItem> itemsList = new ArrayList<>();

        public Menu(String name) { this.name = name; this.lastUpdate = lastUpdate; }

        public  void getName() {
            System.out.println("Welcome to " + name);
        }
        public void setName (String aName) {name = aName;}
        public void getLastUpdate () {
            System.out.println("Menu updated as of: " + lastUpdate.getTime());
        }

        public void addItem (MenuItem aItem) {
            if (!this.itemsList.contains(aItem)) {
                itemsList.add(aItem);
                lastUpdate = Calendar.getInstance();
            } else {
                System.out.println("****Tried to add duplicate item ****");
            }
        }
        public void removeItem (String aName) {
            MenuItem removeMe = new MenuItem(aName);
            if(this.itemsList.contains(removeMe)){
                itemsList.remove(this.itemsList.indexOf(removeMe));
            }
        }

        public void getItemsList() {
            for (MenuItem item : this.itemsList){
                System.out.println(item.toString());
            }
        }
        public void getSingleItem(String aName) {
            MenuItem findMe = new MenuItem(aName);
            if(this.itemsList.contains(findMe)){
                System.out.println(this.itemsList.get(this.itemsList.indexOf(findMe)));
            }
        }

}
