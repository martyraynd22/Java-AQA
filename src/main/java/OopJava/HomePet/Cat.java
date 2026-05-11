package OopJava.HomePet;

public class Cat extends HomePet {

    public Cat(String name) {
        super(name);
    }


    @Override
    public void feed(){
        System.out.println("Питание: ест влажный корм");
    }

    @Override
    public void interact(){
        System.out.println("C ним нужно играть" );
    }
}
