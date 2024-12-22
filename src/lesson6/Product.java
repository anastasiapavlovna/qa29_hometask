package lesson6;

public class Product {

    public enum TypeProduct {
        TV,
        MOBILE,
        AUDIO
    }
    public int price;
    public String name;
    public boolean isavailable;
    public TypeProduct type;

    public Product(int price, String name, boolean availability, TypeProduct type) {
        this.price = price;
        this.name = name;
        this.isavailable = availability;
        this.type = type;

    }

    public void setType(TypeProduct type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
    }

    public TypeProduct getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public boolean isIsavailable() {
        return isavailable;
    }

}
