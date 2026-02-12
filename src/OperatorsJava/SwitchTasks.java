package OperatorsJava;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Вывод дня недели по номеру
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }

        //Стоимость билета по дню недели
        int days = scanner.nextInt();
        switch (days) {
            case 1, 2, 3, 4, 5:
                System.out.println("Стоимость билета в кино сегодня 300 рублей");
                break;
            case 6, 7:
                System.out.println("Стоимость билета в кино сегодня 450 рублей");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }

        //Перевод числовых оценок в буквенные
        int ocenka = scanner.nextInt();
        switch (ocenka / 10) {
            case (10) -> System.out.println("A");
            case (9) -> System.out.println("A");
            case (8) -> System.out.println("B");
            case (7) -> System.out.println("C");
            case (6) -> System.out.println("D");
            case 5, 4, 3, 2, 1 -> System.out.println("F");
            default -> System.out.println("Не существует такого перевода в оценку");
        }


        //Обработка текстовых комманд
        while (true) {
            System.out.println("Введите команду :");
            String command = scanner.nextLine();
            switch (command) {
                case "start" -> System.out.println("Приложение запущно");
                case "stop" -> System.out.println("Приложение остановлено");
                case "restart" -> System.out.println("Рестарт приложения");
                case "status" -> System.out.println("Стаус приложенния: система работает корректно");
                default -> System.out.println("Система не распознает данную команду");
            }
            break;
        }

        //Калькулятор
        int number1 = scanner.nextInt();
        String operator = scanner.next();
        int number2 = scanner.nextInt();

        if (number2 == 0 && operator.equals("/")) {
            System.out.println("На 0 делиться нельзя");
        } else {
            switch (operator) {
                case "+" -> System.out.println(number1 + number2);
                case "-" -> System.out.println(number1 - number2);
                case "*" -> System.out.println(number1 * number2);
                case "/" -> System.out.println((double) number1 / number2);
            }
        }
    }
}
