package complex_tasks.task_5;

import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected InventoryService service;
    protected Product BUTTER;
    protected Product SALT;
    protected Product CHARGER;

    @BeforeEach
    void setUpTest() {
        service = new InventoryService(true);
        BUTTER = new Product("butter", 2.00, "food");
        SALT = new Product("salt", 0.50, "food");
        CHARGER = new Product("charger", 20.00, "electronics");
    }
}
