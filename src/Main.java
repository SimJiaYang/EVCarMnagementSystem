import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Manufacturer> manufacturerList = new ArrayList<Manufacturer>();
        // Manufacturer list
        Manufacturer manufacturer1 = new Manufacturer("M1", "Tesla");
        Manufacturer manufacturer2 = new Manufacturer("M2", "Ora");
        manufacturerList.add(manufacturer1);
        manufacturerList.add(manufacturer2);
        // Car list
        ElectricCar car1 = new Tesla("T1", "Tesla Model 3", manufacturer1,
                false, true, true);
        ElectricCar car2 = new Tesla("T2", "Tesla Model X", manufacturer1,
                true, true, true);
        ElectricCar car3 = new Ora("O1", "ORA Black Cat", manufacturer2,
                true, true);
        ElectricCar car4 = new Ora("O2", "ORA Good Cat", manufacturer2,
                true, false);
        // Register the car to Manufacturer
        manufacturer1.addElectronicCar(car1);
        manufacturer1.addElectronicCar(car2);
        manufacturer2.addElectronicCar(car3);
        manufacturer2.addElectronicCar(car4);

        // Customer
        Customer customer1 = new Customer("C1", "Tom");
        Customer customer2 = new Customer("C2", "Jerry");

        System.out.println("---------Welcome to EV Car Management System---------");
        System.out.println("--------This is our car and manufacturer list--------");
        for (Manufacturer car : manufacturerList) {
            System.out.println(car);
        }
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Purchase electric cars ");
        System.out.println("2. Display the list of electric cars owner and their information ");
        System.out.print("Enter your choice number: ");

        int choice;
        choice = input.nextInt();

        // Allow customers to purchase electric cars from different manufacturers.
        while (choice!=0) {
            if (choice == 1) {
                String selectedCar;
                System.out.print("Please select the car which to buy (Using Car ID): ");
                selectedCar = input.next();
                if (selectedCar.toUpperCase().equals(car1.getCarID())) {
                    customer1.addElectricCar(car1);
                }
                if (selectedCar.toUpperCase().equals(car2.getCarID())) {
                    customer1.addElectricCar(car3);
                }
                if (selectedCar.toUpperCase().equals(car3.getCarID())) {
                    customer1.addElectricCar(car3);
                }
                if (selectedCar.toUpperCase().equals(car4.getCarID())) {
                    customer1.addElectricCar(car4);
                }
            } else if (choice == 2) {
                System.out.println(customer1.toString());
            } else if (choice == 0) {
                System.exit(0);
            }

            System.out.println("\n-----------------------------------------------------");
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Purchase electric cars ");
            System.out.println("2. Display the list of electric cars owner and their information ");
            System.out.print("Enter your choice number: ");

            choice = input.nextInt();
        }
    }

}