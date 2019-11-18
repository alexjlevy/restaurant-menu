package restaurant;

import java.util.Calendar;
import java.util.Objects;

public class MenuItem {

    private String itemName;
    private Double price;
    private String description;
    private String category;
    private Calendar date;
    private Boolean isNew;

    public MenuItem (String itemName, Double price, String description, String category) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = Calendar.getInstance();
        this.isNew = getIsNew();
    }

    public MenuItem (String itemName) {
        this.itemName = itemName;
        this.price = 0.0;
        this.description = "";
        this.category = "";
        this.date = Calendar.getInstance();
        this.isNew = getIsNew();
    }

    public String getItemName (){ return itemName; }
    public void setItemName (String aItemName){ itemName = aItemName; }
    public Double getPrice (){
        return price;
    }
    public void setPrice (Double aPrice){ price = aPrice; }
    public String getDescription (){
        return description;
    }
    public void setDescription (String aDescription){
        description = aDescription;
    }
    public String getCategory (){ return category; }
    public void setCategory(String aCategory) { this.category = aCategory; }
    public Calendar getDate (){ return date; }
    public void setDate(Calendar aDate) { this.date = aDate; }
    public boolean getIsNew(){
        Calendar compareDate = Calendar.getInstance();
        compareDate.set(2019, 10, 10);
        if (this.date.before(compareDate)){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(itemName, menuItem.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName);
    }


    @Override
    public String toString() {
        return "MenuItem{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
