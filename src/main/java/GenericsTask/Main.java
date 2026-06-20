package GenericsTask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void divide(int x, int y){
        if(y == 0){
            throw new ArithmeticException("На 0 делить нельзя");
        }
        else {
            System.out.println(x/y);
        }
    }

    public static void validationAgeUser(int age) throws AgeArgument{
        if(age < 0 || age > 150){
            throw new AgeArgument("Возраст невалиден");
        }
        else {
            System.out.println("Ваш возраст " + age + " явлется валидным");
        }
    }

    public static <T> void printArray(T [] array){
        for (T elements : array){
            System.out.print(elements);
        }
    }

    public static void main(String[] args) {
        String array[] = {"p","r","i","v","e","t"};
        printArray(array);

        try {
            FileReader fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            validationAgeUser(120);
        } catch (AgeArgument e) {
            throw new RuntimeException(e);
        }
    }





}
