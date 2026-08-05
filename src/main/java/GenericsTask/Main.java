package GenericsTask;

import GenericsTask.Exception.AgeArgumentException;
import GenericsTask.Exception.InvalidEmailException;
import GenericsTask.Generics.Box;
import GenericsTask.Generics.Pair;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws AgeArgumentException {
        //Исключения
        //1.Обработка проверяемого исключения

        try (FileReader fileReader = new FileReader("data.txt")) {
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении или закрытии файла");
        }

        //2.Обработка непроверяемого исключения
        divide(5,2);
        //divide(1,0);

        //3. Создание и использование собственного проверяемого исключения
        validateAgeUser(149);
        //validateAgeUser(-1);

        //4.Создание и использование собственного непроверяемого исключения
        validateEmail("aqa@mail.ru");
        //validateEmail("bug1");

        //Дженерики
        //1. Задача на дженерик класс

        Box<String> boxString = new Box<>("Книга");
        boxString.setElement("Книга со строками");
        System.out.println(boxString.getElement());
        Box<Integer> boxInteger = new Box<>(1);
        boxInteger.setElement(1000000);
        System.out.println(boxInteger.getElement());

        //2.Задача на дженерик метод
        Integer[] arrayInteger = {1,2,3,4,5};
        String[] arrayStrings = {"A", "B", "C"};
        printArray(arrayInteger);
        printArray(arrayStrings);

        //3. Задача на дженерик с двумя типами данных

        Pair<String,Integer> pair = new Pair<>();
        pair.setKey("Ноутбук");
        pair.setValue(1);
        System.out.println(pair.getKey() + " " + pair.getValue());
        }


        //2. Деление на 0
        public static void divide (int a, int b){
        try {
            System.out.println(a + " / " + b + " = " + a/b);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("На 0 делить нельзя");
        }
        }

        //3. Метод для проверки возраста
        public static void validateAgeUser(int age) throws AgeArgumentException{
        if(age < 0 || age > 150){
            throw new AgeArgumentException("Возраст пользователя не валиден");
        }
            System.out.println("Возраст пользователя валиден");
        }

        //4. Метод для проверки валидности мейл
        public static void validateEmail(String email){
            if (email == null) {
                throw new IllegalArgumentException("Email не может быть null");
            }
        if (email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")){
            System.out.println("Email валиден");
            return;
        }
        throw new InvalidEmailException("Email не валиден");
        }
        //2.Дженерик метод
        public static <T> void printArray(T[] array){
        for (T elements : array){
            System.out.println(elements);
        }
        }
    }



