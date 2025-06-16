import java.util.ArrayList;

public class Inventory {
    private ArrayList<Laptop> laptops = new ArrayList<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
        System.out.println("✅ Laptop added successfully!");
    }

    public void viewLaptops() {
        if (laptops.isEmpty()) {
            System.out.println("⚠️ No laptops in inventory.");
            return;
        }
        System.out.println("📦 Laptop Inventory:");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public void searchLaptop(String serialNumber) {
        for (Laptop laptop : laptops) {
            if (laptop.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                System.out.println("✅ Laptop found: " + laptop);
                return;
            }
        }
        System.out.println("❌ Laptop with serial number " + serialNumber + " not found.");
    }

    public void deleteLaptop(String serialNumber) {
        for (Laptop laptop : laptops) {
            if (laptop.getSerialNumber().equalsIgnoreCase(serialNumber)) {
                laptops.remove(laptop);
                System.out.println("🗑️ Laptop removed successfully.");
                return;
            }
        }
        System.out.println("❌ No laptop found with that serial number.");
    }
}


