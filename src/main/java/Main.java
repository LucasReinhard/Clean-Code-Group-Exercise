public class Main {

    public static void main(String[] args) {
    Item apple = new Item ("Food", 50 , "Apple");
    Item fork = new Item ("Other", 100 , "Fork");
    Cart cart = new Cart();
    cart.add(apple);
    cart.add(fork);
    int total = cart.checkout();
        System.out.println("The total price of your cart is "+total/100+"."+total%100+"€");
    }
}
