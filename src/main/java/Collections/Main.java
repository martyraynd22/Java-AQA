package Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        //Задача 2:Напишите программу, которая выводит все чётные числа из ArrayList.

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(8);
        list.forEach(s->{
            if(s % 2==0) {
                System.out.println(s);
            }
        });

        //Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.

        List<Integer> summa = new ArrayList<>();
        summa.add(5);
        summa.add(4);
        summa.add(3);
        summa.add(2);
        int schet = 0;
        for (Integer i : summa){
            schet += i;
        }
        System.out.println(schet);

        //LinkedList
        //Задача 3:Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
        List<String> stringList = new LinkedList<>();
        stringList.add("ААА");
        stringList.add("БББ");
        stringList.add("ВВВ");
        stringList.add("ГГГ");
        System.out.println(stringList.getFirst());
        System.out.println(stringList.getLast());

        //Задача 1:Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Данила");
        linkedList.add("Вася");
        linkedList.add("Коля");
        linkedList.add("Федя");
        linkedList.add("Петя");
        System.out.println(linkedList);

        //HashSet
        //Задача 2:Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(4);
        integerHashSet.add(5);
        integerHashSet.add(6);
        integerHashSet.add(7);
        integerHashSet.add(8);
        integerHashSet.add(9);
        integerHashSet.add(10);
        if (integerHashSet.contains(5)){
            System.out.println("Элемент есть");
        }
        else {
            System.out.println("Элемента нет");
        }

        //Задача 3:Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
        List<String> firstList = new ArrayList<>(List.of("22","22","33","33"));
        System.out.println(removeDuplicates(firstList));

        //LinkedHashSet
        //Задача 2:Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
        LinkedHashSet<Integer> noDuble = new LinkedHashSet<>();
        noDuble.add(5);
        noDuble.add(4);
        noDuble.add(7);
        noDuble.add(10);
        System.out.println(noDuble);
        addIfAbsent(noDuble,5);
        addIfAbsent(noDuble,9999);
        System.out.println(noDuble);

        //TreeSet
        //Задача 3:Найдите ближайшее большее и меньшее число к заданному в TreeSet.
        TreeSet<Integer> blizkieElementi = new TreeSet<>();
        blizkieElementi.add(1);
        blizkieElementi.add(8);
        blizkieElementi.add(99);
        blizkieElementi.add(12);
        System.out.println("Ближайшее меньшее к заданному числу это: " + blizkieElementi.lower(22));
        System.out.println("Ближайшее большее к заданному числу это: " + blizkieElementi.higher(22));

        //HashMap
        //Задача 1:Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
        HashMap<String,Integer> friends = new HashMap<>();
        friends.put("Данила",25);
        friends.put("Катя",45);
        friends.put("София",22);
        friends.put("Андрей",23);
        friends.put("Александр",18);
        System.out.println(friends.entrySet());
        //Задача 2:Проверьте, есть ли определённое имя в HashMap.
        System.out.println(friends.containsKey("Катя") ? "Элемент есть в коллекции" : "Элемента нет в коллекции");

        //LinkedHashMap
        //Задача 2:Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
        LinkedHashMap<String,Integer> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Мама",1234);
        phoneBook.put("Папа",2346);
        phoneBook.put("Сестра",5234);
        System.out.println(phoneBook.get("Мама"));

        //TreeMap
        //Задача 2:Найдите минимальный и максимальный ключ в TreeMap.
        TreeMap<Integer,String> sotrudniki = new TreeMap<>();
        sotrudniki.put(1,"Даша");
        sotrudniki.put(4,"Лиля");
        sotrudniki.put(3,"Петр");
        sotrudniki.put(8,"Дмитрий");
        sotrudniki.put(15,"Аркадий");
        sotrudniki.put(20,"Иван");
        System.out.println(sotrudniki.firstKey());
        System.out.println(sotrudniki.lastKey());

        //PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);
        priorityQueue.offer(3);
        priorityQueue.offer(5);
        priorityQueue.offer(9999);
        removalProcedure(priorityQueue);

        //ArrayDeque
        //Задача 3:Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.addFirst(999);
        arrayDeque.offer(4);
        arrayDeque.offer(5);
        arrayDeque.addLast(1000);
        System.out.println(arrayDeque);
        arrayDeque.removeFirst();
        arrayDeque.removeLast();
        System.out.println(arrayDeque);


    }

    public static Set<String> removeDuplicates(List<String> s) {
        return new HashSet<>(s);
    }

    public static void addIfAbsent(LinkedHashSet<Integer> s, Integer element){
        if(s.contains(element)){
            System.out.println("Элемент уже есть в коллекции");
            return;
        }
        s.add(element);
        System.out.println("Элемента " + element + " ранее не было");
        }

    public static PriorityQueue<Integer> removalProcedure(PriorityQueue<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.poll());
        }
        return s;
    }


    }

