package ComplexTasks.Task5;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();
        inventoryService.isInventoryToggle();
        Product product1 = new Product("Ананас","Фрукты",599.0);
        Product product2 = new Product("Яблоко","Фрукты",99.0);
        Product product3 = new Product("Арбуз","Фрукты",150);
        Product product4 = new Product("Апельсин","Фрукты",99.0);
        Product product5 = new Product("Огурец","Овощи",66.0);
        Product product6 = new Product("Кабачок","Овощи",100.0);

        inventoryService.addProduct(product1);
        inventoryService.addProduct(product2);
        inventoryService.addProduct(product3);
        inventoryService.addProduct(product4);
        inventoryService.addProduct(product5);
        inventoryService.addProduct(product6);

        System.out.println(inventoryService.filterByCategory("Фрукты"));
        System.out.println(inventoryService.filterByPrice("Фрукты",100,1000));
    }
}
