package OperatorsJava;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        /*
        int day = scanner.nextInt();
        switch (day){
            case 1 :
                System.out.println("Понедельник");
                break;
            case 2 :
                System.out.println("Вторник");
                break;
            case 3 :
                System.out.println("Среда");
                break;
            case 4 :
                System.out.println("Четверг");
                break;
            case 5 :
                System.out.println("Пятница");
                break;
            case 6 :
                System.out.println("Суббота");
                break;
            case 7 :
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня недели нет!");
        }
         */

        /*

        int day = scanner.nextInt();
        switch (day){
            case 1, 2, 3, 4,5:
                System.out.println("300 рублей");
                break;
            case 6, 7:
                System.out.println("450 рублей");
                break;
            default:
                System.out.println("Такого дня недели нет!");
        }
         */

        /*

        int ocenka = scanner.nextInt();
            switch (ocenka / 10) {
                case (10) -> System.out.println("A");
                case (9) -> System.out.println("B");
                case (8) -> System.out.println("C");
                case (7) -> System.out.println("D");
                case 6, 5, 4, 3, 2, 1 -> System.out.println("F");
                default -> System.out.println("Не входит в диапазон");
        }
         */

        /*
        while (true) {
            System.out.println("Введите команду: ");
            String system = scanner.nextLine();
            switch (system) {
                case "start" -> System.out.println("Система запущена");
                case "stop" -> System.out.println("Система остановлена");
                case "restart" -> System.out.println("Система перезапущена");
                case "status" -> System.out.println("Система статус");
                default -> System.out.println("Такой команды нет");
            }
        }
         */

        /*

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        String operator = scanner.next();

        if (number2 == 0 && operator.equals("/")){
            System.out.println("На 0 делить нельзя");
        }
        switch (operator) {
            case "*" -> System.out.println(number1 * number2);
            case "+" -> System.out.println(number1 + number2);
            case "-" -> System.out.println(number1 - number2);
            case "/" -> System.out.println(number1 / number2);
            }
         */
        }

    }
