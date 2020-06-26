package behavioral.strategyPattern;

public class TestStrategyPattern {

    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("123,",10);
        Item item2 = new Item("456",20);

        cart.addItem(item1);
        cart.addItem(item2);


        cart.pay(new PaypalStrategy("email@email","123"));
        cart.pay(new CreditCardStrategy("abc","123","456","12"));

    }



}
