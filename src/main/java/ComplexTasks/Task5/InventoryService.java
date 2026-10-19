package ComplexTasks.Task5;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryService {
    private Map<String, List<Product>> inventory;
    private boolean isInventoryOpen;

    public InventoryService() {
        this.inventory = new HashMap<>();
    }

    public Map<String, List<Product>> getInventory() {
        return inventory;
    }

    public boolean isInventoryToggle(){
        return this.isInventoryOpen = !isInventoryOpen;
    }

    public boolean getIsInventoryOpen() {
        return isInventoryOpen;
    }

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            throw new UnsupportedOperationException("Нельзя добавить товар если инвентарь закрыт ");
        }
        if(product == null || product.category() == null || product.name() == null){
            throw new IllegalArgumentException("Товар или категория или имя товара не могут быть null");
        }
        this.inventory.computeIfAbsent(product.category(),r -> new ArrayList<>()).add(product);
        }
    public List<Product> filterByCategory(String category){
        if(category == null || category.isEmpty()){
            throw new OutOfStockException("Категория не может быть null или пустой");
        }
        List<Product> products = this.inventory.get(category);
        if (products == null || products.isEmpty()){
            throw new OutOfStockException("Товара нет");
        }
        return products;
    }

    public List<Product> filterByPrice(String category, double min, double max){
        if (category == null || category.isEmpty()){
            throw new IllegalArgumentException("Нельзя фильтровать по пустой категории");
        }
        return filterByCategory(category).stream()
                .filter(p -> p.price() >= min && p.price() <= max)
                .toList();
    }
        }

