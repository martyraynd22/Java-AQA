package OperatorsJava;

import java.util.Scanner;

public class BreakandcontinueTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Сумма чисел до первого отрицательного
        int number;
        int count = 0;
        while (true) {
            number = scanner.nextInt();
            if (number >= 0) {
                count = count + number;
            } else {
                System.out.println("Сумма введеных чисел до ввода отрицательного равна:" + count);
                break;
            }
        }

        //Пропуск чисел делящихся на 3
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }


        //Вывод только положительных чисел
        int number2;
        int i = 5;
        while (i > 0) {
            number2 = scanner.nextInt();
            i--;
            if (number2 < 0) {
                continue;
            }
            System.out.println(number2);
        }

        //Вывод строк до команды "stop"
        while (true) {
            String words = scanner.nextLine();
            if (words.equals("stop")){
                break;
            }
            else {
                System.out.println("Введите слово для выхода: ");
                continue;
            }
        }
        }
        }





