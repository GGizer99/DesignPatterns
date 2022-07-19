package SecondOne.Model;

import SecondOne.Shopping;

import java.util.ArrayList;
import java.util.List;
//Gizer Doğan 18070006036
public class EuropeShopping implements Shopping {
    double Customsduty = 1.015;
    int BaseDeliveryFee = 11;
    double totalPrice=0;

    @Override
    public double calculatePrice(List<Product> products) {

        for(int i = 0;i<products.size(); i++){
            double temptotalPrice;

            if(products.get(i).getSize() == Size.XL){
                temptotalPrice = ((products.get(i).getPrice()) * Customsduty) + 10;
            }
            else{
                temptotalPrice = (products.get(i).getPrice()) * Customsduty;
            }
            totalPrice=totalPrice+temptotalPrice;

        }

        return totalPrice = totalPrice + BaseDeliveryFee;
    }

    @Override
    public Currency getCurrency() {
        return Currency.EUR;

    }
}
