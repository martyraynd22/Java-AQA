package JAVAMVP;

public class Product {
    String name;
    double price;
    double discount;


    public Product (String newName,double newPrice){
        this.name = newName;
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double applyDiscount(){
        return price - (price *(discount / 100));
    }

    void printInfo(){
        System.out.println("Название товара " + this.name +"\n" + "Цена товара " + applyDiscount());
    }
}
