package TestComplexTasks.Task5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddProductTest extends Precondition {
    //Позитивные кейсы:
    //Добавление 1 продукта  -> продукт добавляется и он 1
    //Добавление 2 продуктов одного типа -> продукт добавляется и у 1 типа 2 продукта
    //Добавление другого типа продукта -> продукт добавляется и теперь 2 типа продуктов
    //Негативные кейсы:
    // Если инвентарь закрыт -> -> UnsupportedOperationException
    // Если продукт null -> IllegalArgumentException
    // Если категория null -> IllegalArgumentException
    // Если имя продукта null -> IllegalArgumentException

    @Test
    @DisplayName("Добавление 1 продукта ")
    void adding_One_Product(){
        targeClass.isInventoryToggle();
        targeClass.addProduct(p1);
        assertEquals(1,targeClass.getInventory().get(p1.category()).size());
    }

    @Test
    @DisplayName("Добавление 2 продуктов одного типа ")
    void adding_Two_Products_Of_The_Same_Type(){
        targeClass.isInventoryToggle();
        targeClass.addProduct(p1);
        targeClass.addProduct(p4);
        assertEquals(2,targeClass.getInventory().get(p1.category()).size());
    }

    @Test
    @DisplayName("Добавление другого типа продутка")
    void adding_Another_Type_Of_Product(){
        targeClass.isInventoryToggle();
        targeClass.addProduct(p1);
        targeClass.addProduct(p5);
        assertEquals(2,targeClass.getInventory().size());
    }

    @Test
    @DisplayName("Если продукт null")
    void adding_If_The_Product_Is_Null(){
        targeClass.isInventoryToggle();
        assertThrows(IllegalArgumentException.class,()-> targeClass.addProduct(p3));
    }

    @Test
    @DisplayName("Если категория null")
    void adding_If_The_Product_Category_Is_Null(){
        targeClass.isInventoryToggle();
        assertThrows(IllegalArgumentException.class,()-> targeClass.addProduct(p3));
    }

    @Test
    @DisplayName("Если имя продукта null")
    void adding_If_The_Product_Name_Is_Null(){
        targeClass.isInventoryToggle();
        assertThrows(IllegalArgumentException.class,()-> targeClass.addProduct(p2));
    }
}
