package OperatorsJava;

import java.util.Scanner;

public class IfelseTasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Определение знака числа
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

        //Поиск наибольшего из двух чисел
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

        //Вывод оценки по шкале 1-5
        int number5 = scanner.nextInt();
        if (number5 == 5) {
            System.out.println("Отлично");
        }
        else if (number5 == 4) {
            System.out.println("Хорошо");
        }
        else if (number5 == 3) {
            System.out.println("Удовлетворительно");
        }
        else if (number5 < 3 && number5 > 0) {
            System.out.println("Неудовлетворительно");
        }

        //Проверка на чётность
        int number8 = scanner.nextInt();;
        if (number8 % 2 == 0 ) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное ");
        }

        //Определение размера скидким по возрасту
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


        //Оценка результата теста по баллам
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


