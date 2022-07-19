package SecondOne.Model;

import SecondOne.Shopping;

import java.util.List;
//Gizer Doğan 18070006036
public class AmericaShopping implements Shopping {
    int BaseDeliveryFee = 15;
    double Customsduty = 1.01;
    double totalPrice=0;

    @Override
    public double calculatePrice(List<Product> products) {
        for(int i = 0;i<products.size(); i++){
            double temptotalPrice;

            if(products.get(i).getSize() == Size.XL){
                temptotalPrice = ((products.get(i).getPrice()) * Customsduty) + 10;
            }
            else{
                temptotalPrice = (products.get(i).getPrice()) * Customsduty + 5;
            }
            totalPrice=totalPrice+temptotalPrice;
        }

        return totalPrice = (totalPrice + BaseDeliveryFee) * 1.0075;
    }

    @Override
    public Currency getCurrency() {
        return Currency.USD;
    }
}
