package Classes_and_objects;

public class Product {
    String name;
    double price;
    double discount;

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
return price - (price * (discount /100 ));
        }

        void printInfo(){
            System.out.println("Имя продукта " + this.name + " " + "Итоговая цена продукта " + applyDiscount());
        }
    }

