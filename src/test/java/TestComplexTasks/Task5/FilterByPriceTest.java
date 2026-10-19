package TestComplexTasks.Task5;

import ComplexTasks.Task5.OutOfStockException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilterByPriceTest extends Precondition{
    //Позитивные кейсы:
    //[20, 35] -> [3]
    //[21, 35] -> [2]
    //[21, 34] -> [1]
    //Негативные кейсы:
    //null -> IllegalArgumentException
    //empty -> IllegalArgumentException
    //Поиск в пустом инвентаре -> OutOfStockException
    //[4, 10] -> OutOfStockException

    @Test
    @DisplayName("[20, 35],[20, 35],[21, 34]")
    void getListProductsFilteredByPrice_ReturnsCorrectlyProductsList_WhenWeHaveFilteredProducts() {
        targeClass.isInventoryToggle();
        targeClass.addProduct(p1);
        targeClass.addProduct(p4);
        targeClass.addProduct(p7);

        assertEquals(3, targeClass.filterByPrice(p1.category(), 20, 40).size());
        assertEquals(2, targeClass.filterByPrice(p1.category(), 20, 22).size());
        assertEquals(1, targeClass.filterByPrice(p1.category(), 21, 21).size());
    }

    @Test
    @DisplayName("null ")
    void getListProductsFilteredByPrice_ReturnException_WhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> targeClass.filterByPrice(null, 20, 35));
    }

    @Test
    @DisplayName("empty")
    void getListProductsFilteredByPrice_ReturnException_WhenInputIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> targeClass.filterByPrice("",3,6));
    }

    @Test
    @DisplayName("Поиск в пустом инвентаре ")
    void getListProductsFilteredByPrice_ReturnException_WhenInventoryIsEmpty() {
        assertTrue(targeClass.getInventory().isEmpty());
        assertThrows(OutOfStockException.class, () -> targeClass.filterByPrice(p1.category(), 20, 35));
    }

    @Test
    @DisplayName("[4, 10]")
    void getListProductsFilteredByPrice_ReturnException_WhenProductsHasNotHaveInCategory() {
        targeClass.isInventoryToggle();
        targeClass.addProduct(p1);
        targeClass.getInventory().get(p1.category()).clear();

        assertEquals(1, targeClass.getInventory().size());
        assertTrue(targeClass.getInventory().get(p1.category()).isEmpty());
        assertThrows(OutOfStockException.class, () -> targeClass.filterByPrice(p1.category(), 20, 35));
    }
}
