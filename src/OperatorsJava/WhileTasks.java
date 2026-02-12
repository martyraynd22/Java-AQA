package OperatorsJava;

import java.util.Scanner;

public class WhileTasks {
    public static void main (String[] args) {

        //Вычисление факториала
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 1;
        int i = 1;
        while (i <= number){
            sum = sum * i;
            i++;
        }
        System.out.println("Факториал: "+ sum);

        //Вывод всех четных чисел до заданного
        int civra = scanner.nextInt();
        int d = 1;
        while (d < civra) {
            if(d % 2 == 0) {
            System.out.println(d);
        }
        d++;
    }

        //Обратный отсчет от введеного числа до 1
        int number2 = scanner.nextInt();
        while (number2 >= 1 ){
            System.out.println(number2);
            number2 --;
        }




    }
}
