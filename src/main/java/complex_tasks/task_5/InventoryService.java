package complex_tasks.task_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryService {
    private boolean isInventoryOpen;
    private Map<String, List<Product>> inventory = new HashMap<>();

    public InventoryService(boolean isInventoryOpen) {
        this.isInventoryOpen = isInventoryOpen;
    }

    public Map<String, List<Product>> getInventory() {
        return inventory;
    }

    public boolean addProduct(Product product) {
        if (!isInventoryOpen) {
            System.out.println("Warehouse is closed");
            return false;
        }

        inventory.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
        return true;
    }

    public List<Product> filterByCategory(String category) throws OutOfStockException {
        List<Product> result = inventory
                .values()
                .stream()
                .flatMap(List::stream)
                .filter(p -> p.getCategory().equals(category))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            throw new OutOfStockException("Products by category " + category + " are out of stock");
        } else {
            return result;
        }
    }

    public List<Product> filterByPrice(Double price) {
        return inventory
                .values()
                .stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() == price)
                .collect(Collectors.toList());
    }
}
