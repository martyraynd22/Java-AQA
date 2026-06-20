package ComplexTask.Task1;

public class Main extends User {

    public Main(int age, String name, boolean isAcitive){
        super(age,name,isAcitive);
    }
    public static void main (String[] args) {
        Main a = new Main(15,"Danila",false);
        Main g = new Main(16,"Danila",false);
        Main b = new Main(22,"Andrei",true);
        Main c = new Main(10,"Sasha",false);
        Main d = new Main(1,"Petya",true);
        Main e = new Main(25,"Sova",false);
        Main f = new Main(29,"Alina",true);
        EntityManager<Main> manager = new EntityManager<>();
        manager.addEntity(a);
        manager.addEntity(b);
        manager.addEntity(c);
        manager.addEntity(d);
        manager.addEntity(e);
        manager.addEntity(f);
        manager.addEntity(g);

        System.out.println(manager.getEntity());
        System.out.println(manager.filteredByAge(10,19));
        System.out.println(manager.filteredByName("makaka"));
        System.out.println(manager.filteredByName("Danila"));
        System.out.println(manager.filteredByActive(true));
        System.out.println(manager.filteredByActive(false));
        System.out.println(manager.deleteEntity(d));
        System.out.println(manager.deleteEntity(new Main(99,"Papa",false)));
        System.out.println(manager.getEntity());
    }
}
