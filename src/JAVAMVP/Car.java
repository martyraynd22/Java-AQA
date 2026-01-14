package JAVAMVP;

public class Car {
     int year;
     String brand;

    public Car(int someyear,String somebrand) {
        this.year = someyear;
        this.brand = somebrand;
    }

    void setYear (int newYear) {
        this.year = newYear;
    }
    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    int getYear (){
        return this.year;
    }

    String getBrand(){
      return this.brand;
    }
     void print() {
         System.out.println("Марка " + this.brand + " Год выпуска " + this.year);
     }
    }


