package TestComplexTasks.Task5;

import ComplexTasks.Task5.OutOfStockException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilterByCategoryTest extends Precondition{
    //
    //Позитивные кейсы :
    //Есть категория 1 -> Получили лист продуктов (1)
    //Есть категория 1 -> Получили лист продуктов (3)
    //
    //Негативные кейсы:
    //null -> IllegalArgumentException
    //empty -> IllegalArgumentException
    // Нет товаров в категории -> OutOfStockException
    //

    @Test
    @DisplayName("")
    void getListProductsByCategory_ReturnsListWithOneElementInSameCategory() {
        targeClass.isInventoryToggle();
        targeClass.addProduct(p1);
        targeClass.addProduct(p5);

        assertEquals(1, targeClass.filterByCategory(p1.category()).size());
        assertEquals(1, targeClass.filterByCategory(p5.category()).size());
    }

    @Test
    void getListProductsByCategory_ReturnsListWithThreeElementsInOneCategory() {
        targeClass.isInventoryToggle();
        targeClass.addProduct(p1);
        targeClass.addProduct(p4);
        targeClass.addProduct(p7);
        assertEquals(1,targeClass.getInventory().size());
    }

    @Test
    void getListProductsByCategory_ReturnsException_WhenInputIsNull() {
        assertThrows(OutOfStockException.class, () -> targeClass.filterByCategory(null));
    }

    @Test
    void getListProductsByCategory_ReturnsException_WhenInputIsEmpty() {
        assertThrows(OutOfStockException.class, () -> targeClass.filterByCategory(""));
    }

    @Test
    void getListProductsByCategory_ReturnsException_WhenCategoryHasNotHaveElements() {
        targeClass.isInventoryToggle();
        targeClass.addProduct(p1);
        targeClass.getInventory().get(p1.category()).clear();

        assertEquals(1, targeClass.getInventory().size());
        assertTrue(targeClass.getInventory().get(p1.category()).isEmpty());

        assertThrows(OutOfStockException.class, () -> targeClass.filterByCategory(p1.category()));
    }
}
