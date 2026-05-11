package Classes_and_objects;

public class Car {
    String brand;
    int year;

    public Car(String newBrand, int newYear) {
        this.brand = newBrand;
        this.year = newYear;
    }

    public void setBrand(String newBrand){
        this.brand = newBrand;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    int getYear(){
        return this.year;
    }

    String getBrand(){
        return this.brand;
    }

    void print(){
        System.out.println("Год выпуска " + this.year + " Марка машины " + this.brand);
    }
}
