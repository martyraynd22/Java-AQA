package OperatorsJava;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        String discriptions = "";
        int number = scanner.nextInt();
        if(number > 0) {
            discriptions = "Число положительное";
        } else if (number < 0) {
            discriptions = "Число отрицательное";
        }
        else {
            discriptions = "Число равно нулю";
        }
        System.out.println(discriptions);
    }
         */
        /*
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int maximus;
        if (number1 > number2) {
            maximus = number1;
        }
        else {
            maximus = number2;
        }
        System.out.println("Наибольшее из двух чисел - " + maximus);
         */


        /*
        int number = scanner.nextInt();
        if (number == 5) {
            System.out.println("Отлично");
        }
        else if (number == 4) {
            System.out.println("Хорошо");
        }
        else if (number == 3) {
            System.out.println("Удовлетворительно");
        }
        else if (number < 3 && number > 0) {
            System.out.println("Неудовлетворительно");
        }
        */

        /*
        int number = scanner.nextInt();;
        if (number % 2 == 0 ) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное ");
        }
         */

        /*
        int age = scanner.nextInt();
        String discount = "";
        if (age < 18 ){
            discount = "Ваша скидка составит 25%";
        } else if (age >=65) {
            discount = "Ваша скидка составит 30%";
        }
        else {
            discount = "Для вас не распространяется скидка";
        }
        System.out.println(discount);
         */

        int ocenka = scanner.nextInt();
        if (ocenka >=90) {
            System.out.println("Отлично");
        }
        else if (ocenka >=75) {
            System.out.println("Хорошо");
        }
        else if (ocenka >= 60){
            System.out.println("Удовлетворительно");
        }
        else if (ocenka < 60) {
            System.out.println("Неудовлетворительно");
        }


    }
}
