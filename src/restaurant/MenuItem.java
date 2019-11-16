package restaurant;

public class MenuItem {

    protected String itemName;
    protected Double price;
    protected String description;
    protected String category;

    public MenuItem (String itemName, Double price, String description, String category) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
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
}
