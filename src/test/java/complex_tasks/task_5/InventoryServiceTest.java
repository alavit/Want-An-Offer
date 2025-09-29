package complex_tasks.task_5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest extends BaseTest {
/*
    Test cases:
    - add product if isInventoryOpen is false --> product is not added
    - add product if isInventoryOpen is true --> product is added
    - filter by category if category exists
    - filter by category if category does not exist --> OutOfStockException
    - filter by price
*/

    @Test
    void userCannotAddProductIfInventoryIsClosed() {
        InventoryService service = new InventoryService(false);

        service.addProduct(BUTTER);

        assertEquals(0, service.getInventory().size());
    }

    @Test
    void userCanAddProductIfInventoryIsOpened() {
        service.addProduct(BUTTER);

        String actualName = service.getInventory().get(BUTTER.getCategory()).get(0).getName();
        double actualPrice = service.getInventory().get(BUTTER.getCategory()).get(0).getPrice();
        String actualCategory = service.getInventory().get(BUTTER.getCategory()).get(0).getCategory();

        assertEquals(1, service.getInventory().size());
        assertEquals(BUTTER.getName(), actualName);
        assertEquals(BUTTER.getPrice(), actualPrice);
        assertEquals(BUTTER.getCategory(), actualCategory);
    }

    @Test
    void userCanFilterByCategoryIfItExists() throws OutOfStockException {
        service.addProduct(BUTTER);
        service.addProduct(SALT);
        service.addProduct(CHARGER);

        List<Product> expectedResult = new ArrayList<>(Arrays.asList(BUTTER, SALT));
        List<Product> actualResult = service.filterByCategory("food");

        assertEquals(2, actualResult.size());
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void userCannotFilterByCategoryIfItDoesNotExist() throws OutOfStockException {
        service.addProduct(BUTTER);

        assertThrows(OutOfStockException.class, () -> service.filterByCategory("electronics"), "Expected filterByCategory() to throw OutOfStockException when category does not exist");
    }

    @Test
    void userCanFilterByPrice() throws OutOfStockException {
        service.addProduct(BUTTER);
        service.addProduct(SALT);
        service.addProduct(CHARGER);

        List<Product> expectedResult = new ArrayList<>(Arrays.asList(CHARGER));
        List<Product> actualResult = service.filterByCategory("electronics");

        assertEquals(1, actualResult.size());
        assertEquals(expectedResult, actualResult);
    }
}
