package Classes_and_objects;

public class Product {
    String name;
    double price;
    double discount;

    // поле double discount - можно было не создавать и в аргументах метода applyDiscount() - указать аругмент, в main после этого вызывать метод - чтобы присаивать скидку.

    public Product(String newName,double newPrice){
        this.price = newPrice;
        this.name = newName;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public double getPrice(){
        return  this.price;
    }

    public String getName() {
        return this.name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(){
     return price - (price * (discount /100));
        }

        void printInfo(){
            System.out.println("Имя продукта " + this.name + " " + "Итоговая цена продукта " + applyDiscount());
        }
    }

