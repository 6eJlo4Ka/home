public class Food extends Products implements Price{

    double number;


    public Food(String name, double price, double number) {
        super(name, price);
        this.number = number;
    }


    @java.lang.Override
    public void doPrice(double number,   price) {
        double pr += number*price;

    }
}
