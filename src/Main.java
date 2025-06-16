import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        // Simple menu loop
        while (true) {
            System.out.println("\n1. Add Laptop\n2. Show Inventory\n0. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Processor: ");
                    String processor = scanner.nextLine();
                    System.out.print("RAM (GB): ");
                    int ram = scanner.nextInt();
                    manager.addLaptop(new Laptop(brand, model, processor, ram));
                    break;
                case 2:
                    manager.showInventory();
                    break;
                case 0:
                    return;
            }
        }
    }
}

