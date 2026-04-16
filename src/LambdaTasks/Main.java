package LambdaTasks;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Создайте свой функциональный интерфейс
        MathOperation add = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation divide = (a, b) -> a / b;
        MathOperation multiplication = (a, b) -> a * b;

        int a = 10;
        int b = 3;
        System.out.println("Сложение " + "= " + add.math(a, b));
        System.out.println("Вычитание " + "= " + subtraction.math(a, b));
        System.out.println("Деление " + "= " + divide.math(a, b));
        System.out.println("Умножение " + "= " + multiplication.math(a, b));


        //2.Использование анонимного класса
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r1.run();

        //3.Лямбда-выражение с Predicate

        Predicate<Integer> isParity =integer -> integer % 2 == 0;
        System.out.println("Является ли число " + a + " чётным? Ответ: " + isParity.test(a));
        System.out.println("Является ли число " + b + " чётным? Ответ: " + isParity.test(b));

        //4.Лямбда-выражение с Function

        Function<String,Integer> lenghtLine = str -> str.length();
        System.out.println(lenghtLine.apply("Эта строка очень и очень и очень длинная!!!"));

        //5.Использование Consumer

        Consumer<String> printer = System.out::println;
        printer.accept("Я напечатаю эту строку через консьюмер");

        //Часть 2: Stream API – базовые операции
        //1. Фильтрация строк по длине больше 5

        List<String> pet = new ArrayList<>(List.of("Собака","Кошка","Черепаха","Попугай","Слон"));
        List<String> lenghtLessThanFive = pet.stream()
                .filter(s->s.length()>5)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(lenghtLessThanFive);

        //2.Фильтрация чисел, кратных 5
        ArrayList<Integer> integerList = new ArrayList<>(List.of(1,2,35,10,25,50,50,7));
        List<Integer> aMultipleOfFive = integerList.stream()
                .filter(s-> s % 5 == 0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(aMultipleOfFive);

        //3. Преобразование строк в их длины
        List<Integer> lenghtStr = pet.stream()
                .map(s -> s.length())
                .collect(Collectors.toUnmodifiableList());

        System.out.println(lenghtStr);

        //4.Создание списка квадратов чисел
        List<Integer> square = integerList.stream()
                .map(s-> s * s)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(square);

        //5.Удаление дубликатов из списка
        List<String> friends = new ArrayList<>(List.of("Богдан","Вася","Вася","Саша","Саша","Данила","Борис"));
        List<String> unique = friends.stream()
                .distinct()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(unique);

        //Часть 3: Stream API – агрегирующие операции
        //1. Поиск максимального элемента
        Integer findMax = integerList.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(findMax);


        //2. Поиск минимального элемента
        Integer findMin = integerList.stream()
                .min(Comparator.naturalOrder())
                .orElse(0);
        System.out.println(findMin);

        //3.Сумма всех элементов списка
        int summa = integerList.stream()
                .mapToInt(s->s)
                .sum();
        System.out.println(summa);

        //4. Поиск первого элемента, начинающегося на "Б"
        List<String> findLetter = friends.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .stream().toList();
        System.out.println(findLetter);

        //5.Проверка наличия хотя бы одного элемента по условию
        List<Integer> findDistinct = integerList.stream()
                .filter(s->s % 2 ==0)
                .distinct()
                .toList();
        System.out.println(findDistinct);

        //Часть 4: Stream API – группировка и редукция
        //1. Группировка строк по первой букве

        Map<Character,List<String>> grouppingFirstLetter = friends.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0)));
        System.out.println(grouppingFirstLetter);

        //2. Группировка чисел по чётности // even or odd
        System.out.println(filter(integerList));

        //3.Поиск среднего значения чисел
        System.out.println(avg(integerList));


    }
    public static Map<String,List<Integer>> filter (List<Integer> integers){
            return integers.stream()
            .collect(Collectors.groupingBy(s-> s % 2 == 0 ? "even" : "odd"));

    }
    public static Double avg (List<Integer> a){
        return a.stream()
            .collect(Collectors.averagingInt(Integer::intValue));
    }
}
