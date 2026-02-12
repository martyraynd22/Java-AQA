package OperatorsJava;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Выдача чисел от 1 до 10 делящихся на 3
        for (int i = 1; i < 100;i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        //Сумма число от 1 до введенного числа
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1;i <= number; i++){
            sum = sum + i;
        }
        System.out.println("Сумма чисел диапазона равна " + sum);


        //Таблица умножения для числа
        int number1 = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(number1 + " * " + i + " = " + number1 * i);
        }


        //Проверка на простое числа
        System.out.println("Введите число:");
        int number2 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number2; i++) {
            if (number2 % i == 0) {
                count++;
            }
        }
            if (count > 2){
                System.out.println("Не простое");
            }
            else {
                System.out.println("Число простое");
            }


        //Вывод чисел от 1 до 10
        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }


        }
    }


