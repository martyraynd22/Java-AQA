package Classes_and_objects;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        Car bmw = new Car("X5",2000);
        bmw.setYear(1999);
        bmw.print();

        Rectangle figura = new Rectangle(10,4);
        figura.setWeight(9);
        System.out.println("Площадь " + figura.calculateArea());

        Book kniga = new Book("Gogol","Mertvie Dushi");
        kniga.setAuthor("Tolstoy");
        kniga.printInfo();

        BankAccount ytka = new BankAccount("Makdak",500);
        ytka.deposit(50);
        ytka.withdraw(50);
        ytka.printBalance();


        Point otrezok = new Point(33,22);
        otrezok.setX(66);
        otrezok.print();

        StudentGroup shkolniclass = new StudentGroup("B",40);
        shkolniclass.setStudentCount(25);
        shkolniclass.printInfo();

        Circle krug = new Circle(26.9);
        krug.setRadius(66);
        System.out.println("Площадь " + krug.calculateArea() + " " + "Длина " + krug.calculateCircumference());

        Teacher man = new Teacher("Petr","Math");
        man.setSubject("Literatura");
        man.prinInfo();

        Product meat = new Product("Chicken",1000);
        meat.setDiscount(30);
        meat.printInfo();

        Laptop noutbuk = new Laptop("HP",60000);
        noutbuk.setPrice(35000);
        noutbuk.printInfo();



    }


}

