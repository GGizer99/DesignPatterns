package SecondOne.Model;

import SecondOne.Shopping;

import java.util.ArrayList;
import java.util.List;
//Gizer Doğan 18070006036
public class Cart {
    private Shopping shopping;

    ArrayList<Product> products = new ArrayList<>();


    public Cart(Shopping shopping) {
        this.shopping = shopping;
    }

    public void addProduct(Product shopping) {

        products.add(shopping);



    }

    public double getTotalPrice() {
        return shopping.calculatePrice(products);
    }
}
