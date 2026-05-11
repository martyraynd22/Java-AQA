package Classes_and_objects;

public class Laptop {
    String brand;
    int price;

    public Laptop(String newBrand,int newPrice){
        this.brand = newBrand;
        this.price = newPrice;
    }
    public void setPrice(int newPrice){
        this.price = newPrice;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getPrice(){
        return  this.price;
    }

    void printInfo(){
        System.out.println("Ноутбук марки " + this.brand + " " + "Цена " + this.price + "руб");
    }


}
