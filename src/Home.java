public class Home extends Products {

    double number;

    public Home(String name, double price, double number) {
        super(name, price);
        this.number = number;
    }


    @java.lang.Override
    public void doPrice(double number,   price) {
        double pr += number*price;

    }
}



