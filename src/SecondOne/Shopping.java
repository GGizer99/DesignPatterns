package SecondOne;

import SecondOne.Model.Currency;
import SecondOne.Model.Product;

import java.util.List;
//Gizer Doğan 18070006036
public interface Shopping {

    double calculatePrice(List<Product> products);
    Currency getCurrency();
}