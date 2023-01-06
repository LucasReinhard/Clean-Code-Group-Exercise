public class Item {
    //Type of the Item
    private String mTypeString;
    //Price of the Item
    private int mPrice;
    //Name of the Item
    private String mNameString;

    public String getType() {
        return mTypeString;
    }

    public void setType(String type) {
        this.mTypeString = type;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int price) {
        this.mPrice = price;
    }

    public Item()
    {

    }
    
    public Item(String type, int price, String nameString) {
        this.mNameString = nameString;
        this.mTypeString = type;
        this.mPrice = price;
    }
}
