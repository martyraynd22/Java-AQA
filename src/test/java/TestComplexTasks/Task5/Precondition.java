package TestComplexTasks.Task5;

import ComplexTasks.Task5.InventoryService;
import ComplexTasks.Task5.Product;
import org.junit.jupiter.api.BeforeEach;

public class Precondition {
    protected InventoryService targeClass;

    protected Product p1;
    protected Product p2;
    protected Product p3;
    protected Product p4;
    protected Product p5;
    protected Product p6;
    protected Product p7;

    @BeforeEach
    public void getPrecondition(){
        this.targeClass = new InventoryService();
        this.p1 = new Product("Ананас","Фрукты",21.0);
        this.p2 = new Product(null,"Фрукты",99.0);
        this.p3 = new Product("Арбуз",null,150);
        this.p4  = new Product("Банан","Фрукты",22.0);
        this.p5 = new Product("Огурец","Овощи",66.0);
        this.p6 = new Product("Кабачок","Овощи",100.0);
        this.p7 = new Product("Слива","Фрукты",34.0);
    }

}
