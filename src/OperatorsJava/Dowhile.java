package OperatorsJava;

import java.util.Scanner;

public class Dowhile {
    public static void main (String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите число : ");
            number = scanner.nextInt();
        }
        while (number <= 0 );
            System.out.println("Вы ввели положительное число. Успех!");
         */

        /*
        Scanner scanner = new Scanner(System.in);
        String login;
        String password;
        do {
            System.out.println("Введите логин: ");
            login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
        } while (!login.equalsIgnoreCase("admin") || !password.equalsIgnoreCase("1234"));
        System.out.println("Вход разрешен");
         */

        /*
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            number = number + 1;     //
            System.out.println(number);
        }while (number < 10);
         */

        /*
        Scanner scanner = new Scanner(System.in);
        String words;

        do {
            System.out.println("Введите слово");
            words = scanner.nextLine();
        }
        while (!words.equalsIgnoreCase("exit"));
        System.out.println("Работа программы завершена");
         */

        /*
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number;
        System.out.println("Введите число:");
        number = scanner.nextInt();
        do {
            number = number / 10;
            count ++;
        }
        while (number > 0);
        System.out.println(count);
         */

    }
}


