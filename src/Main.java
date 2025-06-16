import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Laptop Inventory Management ===");
            System.out.println("1. Add Laptop");
            System.out.println("2. View All Laptops");
            System.out.println("3. Search Laptop");
            System.out.println("4. Delete Laptop");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter serial number: ");
                    String serial = scanner.nextLine();
                    inventory.addLaptop(new Laptop(brand, model, serial));
                    break;

                case 2:
                    inventory.viewLaptops();
                    break;

                case 3:
                    System.out.print("Enter serial number to search: ");
                    String searchSerial = scanner.nextLine();
                    inventory.searchLaptop(searchSerial);
                    break;

                case 4:
                    System.out.print("Enter serial number to delete: ");
                    String deleteSerial = scanner.nextLine();
                    inventory.deleteLaptop(deleteSerial);
                    break;

                case 5:
                    System.out.println("👋 Exiting program...");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}


