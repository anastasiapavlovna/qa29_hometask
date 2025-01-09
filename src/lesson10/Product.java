package lesson10;

public class Product {

    public String name;

    public int price;

    public int number;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public Product(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

}
