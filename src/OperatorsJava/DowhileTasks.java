package OperatorsJava;

import java.util.Scanner;

public class DowhileTasks {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        //Запрос положительного числа
        int number;
        do {
            System.out.print("Введите положительное число: ");
            number = scanner.nextInt();
            if (number > 0) {
                break; // выход из цикла
            }
            System.out.println("Число должно быть больше 0. Попробуйте снова.");
        } while (true);
        System.out.println("Вы ввели положительное число: " + number);


        //Проверка пароля
        String password;
        do {
            System.out.println( "Введите пароль: " );
            password = scanner.next();
        }
        while (!password.equalsIgnoreCase("123456"));
        System.out.println("Вход разрешен");

        //Вывод чисел от 1 до 10
        int n = 0;
        do {
            n = n + 1;
            System.out.println(n);
        }while (n < 10);


        //Завершение программы по команде "exit"
        String password1;
        do {
            System.out.println("Введите слово чтобы выйти из програмы: ");
            password1 = scanner.next();
        }
        while (!password1.equalsIgnoreCase("exit"));
        System.out.println("Работа программы завершена");



        //Подсчет количества цифр в числе
        int number1;
        int count= 0;
        System.out.println("Введите число:");
        number1 = scanner.nextInt();
        do {
            number1 = number1 / 10;
            count ++;
        }while (number1 > 0);
        System.out.println("Количество цифр в числе: " + count);











    }
}
