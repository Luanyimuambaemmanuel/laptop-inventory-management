import java.util.*;

public class InventoryManager {
    private List<Laptop> inventory = new ArrayList<>();

    public void addLaptop(Laptop laptop) {
        inventory.add(laptop);
    }

    public void showInventory() {
        for (Laptop l : inventory) {
            System.out.println(l);
        }
    }

    // add update, delete, search methods...
}

