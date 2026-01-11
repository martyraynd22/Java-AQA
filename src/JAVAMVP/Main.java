package JAVAMVP;

public class Main {
    public static void main(String[] args){
        /*
        Transport bmw = new Transport();
        bmw.setValues(250.5f,2400,"Black", new byte[]{0,0,0});
        String res1 = bmw.getValues();
        //bmw.speed = 300.0f;
        //bmw.weight = 2800;
        //bmw.color = "Black";
        //bmw.coordinate = new byte [] {0, 0, 0};

        Transport truck = new Transport();
        truck.speed =  104.6f;
        truck.weight = 5900;
        truck.color = "Red";
        truck.coordinate = new byte[]{ 100, 0 , 100};

        String res2 = truck.getValues();
        System.out.println(res1);
         */
        //Student Danya = new Student(20,"Danya");


        //Danya.print();
        //Danya.setName("Vasya");
        //System.out.println("Мое новое имя " + Danya.name);
        Car Machine = new Car(1988,"BMW");
        int Andrei = Machine.getYear();

        System.out.println();

    }
}
