package SecondOne.Model;
//Gizer Doğan 18070006036
public enum Currency
{
    EUR(1),
    USD(2);

    private int currency;

    Currency(int currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        switch(currency) {
            case 1:
                return "EUR";
            case 2:
                return "USD";
            default:
                return "UNKNOWN";
        }
    }
}