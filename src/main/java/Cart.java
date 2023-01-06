import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> itemsList;

    public Cart()
    {
        itemsList = new ArrayList<Item>();
    }

    public void add(Item item)
    {
        itemsList.add(item);
    }

    int checkout() {
        int price = 0;
        for (Item item : itemsList) {
            int itemPrice = 0;
            switch (item.getType()) {
                /*
                case "Food":
                    itemPrice = item.getPrice() + (item.getPrice() / 100) * 5;
                    break;
                case "Other":
                    itemPrice = item.getPrice() + (item.getPrice() / 100) * 16;
                    break;
                 */
                case "Food":
                    itemPrice = item.getPrice() + (item.getPrice() / 100) * 7;
                    break;
                case "Other":
                    itemPrice = item.getPrice() + (item.getPrice() / 100) * 19;
                    break;
                case "None":
                    itemPrice = item.getPrice();
                    break;
            }
            price += itemPrice;
        }
        if (price < 10000) {
            if (itemsList.size() < 3)
                price += 149; //envelope
            else
                price += 495; //package
        }
        itemsList.clear();
        return price;
    }
}
