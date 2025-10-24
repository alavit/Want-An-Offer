package practice_2;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(double discount) {
        this.price = this.price * (1 - discount / 100.0);
    }

    void printInfo() {
        System.out.println("Name: " + this.getName() + ", Price: " + this.getPrice());
    }
}
