package Week03.project;


public class Product extends Menu {

    double price;

    public Product(String name, String explain, double price) {
        super(name, explain);
        this.price = price;
    }

    public void output() {
        System.out.printf("%-15s | %s\n", name, explain);
    }

}





