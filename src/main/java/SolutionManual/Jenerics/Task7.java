package SolutionManual.Jenerics;

import java.util.Objects;

public class Task7 {

    public static <T extends Number> void divide(T numbers1, T numbers2) {
        Objects.requireNonNull(numbers2,"Не может быть null");
        Objects.requireNonNull(numbers2,"Не может быть null");
        System.out.println(numbers1.doubleValue() / numbers2.doubleValue());
    }
    public static void main(String[] args) {
        divide(5,1);
        divide(5,0);
    }
}
