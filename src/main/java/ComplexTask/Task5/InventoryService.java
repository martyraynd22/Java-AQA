package ComplexTask.Task5;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {
    private boolean isInventoryOpen;

    Map<String, List<Product>> inventory = new HashMap<>();

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            throw new IllegalStateException("Склад закрыт! Невозможно добавить товар.");
        }
        if (product == null) {
            throw new IllegalArgumentException("Товар не может быть null");
        }
        String category = product.category();
        if (inventory.containsKey(category)) {
            inventory.get(category).add(product);
        } else {
            List<Product> newCategoryList = new ArrayList<>();
            newCategoryList.add(product);
            inventory.put(category, newCategoryList);
        }
    }

    public void setInventoryStatus() {
        this.isInventoryOpen = !this.isInventoryOpen;
    }

    public List<Product> getProductsByCategory(String category) throws OutOfStockException {
        if (category == null || category.isEmpty()) {
            throw new OutOfStockException("Категория не может быть пустой");
        }
        List<Product> products = inventory.values().stream()
                .filter(products1 -> products1.equals(category))
                .findFirst().get();

        if (products.isEmpty()) {
            throw new OutOfStockException(category);
        }

        return products;
    }
}

// Переопределить иквпелс и хэш код для мапы


