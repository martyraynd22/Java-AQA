package Problem;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;

public class Main {
    static void main(String[] args) {
        Person person = new Person("Alice", 25);
        person.updateAge(7);
        System.out.println("Updated age: " + person.getAge());

        double a = 0.1 * 3;
        double b = 0.3;
        System.out.println(a + " , " + b);
        double s = Math.abs(a-b);
        System.out.println(s);
        if (s < 0.00000000000000007) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        countdown(-5);
    }

    public static void countdown(int n) {
        System.out.println(n);
        if (n == 1) {
            return;
        }
        if (n < 1) {
            countdown(n + 1);
        }
        else
            countdown(n - 1);
    }
}






