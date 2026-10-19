package ComplexTasks.Task1;

public class Main {
    public static void main(String[] args) {
        Entity e1 = new Entity(15, "Данила", true);
        Entity e2 = new Entity(17, "Вася", false);
        Entity e3 = new Entity(20, "Коля", true);
        Entity e4 = new Entity(25, "Саша", false);

        EntityManager<Entity> entityManager = new EntityManager<>();
        entityManager.addEntity(e1);
        entityManager.addEntity(e2);
        entityManager.addEntity(e3);
        entityManager.addEntity(e4);
        entityManager.addEntity(e1);

        System.out.println(entityManager.getAllEntities());
        System.out.println(entityManager.filterByActive(true));
        System.out.println(entityManager.filterByAge(16, 25));
        System.out.println(entityManager.filterByName("Данила"));
    }
}
