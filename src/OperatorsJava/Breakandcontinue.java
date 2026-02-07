package OperatorsJava;

import java.util.Scanner;

public class Breakandcontinue {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        while (true){
            number = scanner.nextInt();
            if(number >= 0){
                count = count + number;
            }
            else {
                System.out.println("Сумма введеных чисел до ввода отрицательного равна:" + count);
                break;
            }
        }

         */

        /*
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

         */

        /*

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = scanner.nextInt();
            if(number < 0 ){
                continue;}
            System.out.println("Вы вводили: " + number);
            }
            while (true);

         */

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите слово: ");
            String words = scanner.nextLine();
            if (words.equals("stop")){
                break;
            }
        }
        }
        }



