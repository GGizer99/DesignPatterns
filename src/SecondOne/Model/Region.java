package SecondOne.Model;
//Gizer Doğan 18070006036
public enum Region {

    EUR(1),
    USA(2);

    private int region;

    Region(int regionNumber) {
        this.region = region;
    }

    public int getRegion() {
        return region;
    }

    @Override
    public String toString() {
        switch(region) {
            case 1:
                return "EUR";
            case 2:
                return "USA";
            default:
                return "UNKNOWN";
        }
    }
}