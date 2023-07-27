import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Manufacturer> manufacturerList = new ArrayList<Manufacturer>();
        ArrayList<ChargingStation> chargingStationList = new ArrayList<ChargingStation>();
        ArrayList<Customer> customersList = new ArrayList<Customer>();
        // Manufacturer list
        Manufacturer manufacturer1 = new Manufacturer("M1", "Tesla");
        Manufacturer manufacturer2 = new Manufacturer("M2", "Ora");
        manufacturerList.add(manufacturer1);
        manufacturerList.add(manufacturer2);
        // Car list
        ElectricCar car1 = new Tesla("T1", "Tesla Model 3", 57.5,manufacturer1,
                false, true, true);
        ElectricCar car2 = new Tesla("T2", "Tesla Model X", 47.5, manufacturer1,
                true, true, true);
        ElectricCar car3 = new Ora("O1", "ORA Black Cat",37.5, manufacturer2,
                true, true);
        ElectricCar car4 = new Ora("O2", "ORA Good Cat", 37.5,manufacturer2,
                true, false);
        // Register the car to Manufacturer
        manufacturer1.addElectronicCar(car1);
        manufacturer1.addElectronicCar(car2);
        manufacturer2.addElectronicCar(car3);
        manufacturer2.addElectronicCar(car4);

        // Customer
        Customer customer1 = new Customer("C1", "Tom");
        Customer customer2 = new Customer("C2", "Jerry");
        customersList.add(customer1);
        customersList.add(customer2);

        // Charging Station
        ChargingStation chargingStation1 = new ChargingStation("CS1", "Impian Emas",40);
        ChargingStation chargingStation2 = new ChargingStation("CS2", "Pontian",70);
        ChargingStation chargingStation3 = new ChargingStation("CS3", "Austin",120);
        chargingStationList.add(chargingStation1);
        chargingStationList.add(chargingStation2);
        chargingStationList.add(chargingStation3);

        System.out.println("---------Welcome to EV Car Management System---------");
        System.out.println("--------This is our car and manufacturer list--------");
        for (Manufacturer car : manufacturerList) {
            System.out.println(car);
        }
        System.out.println("\n-----------------------------------------------------");
        System.out.println("\nWhat would you like to do?");
        System.out.println("1. Purchase electric cars ");
        System.out.println("2. Display the list of electric cars owner and their information ");
        System.out.println("3. Customers to view and update the charging station ");
        System.out.println("4. Display a list of electric car manufacturers and their car models ");
        System.out.println("0. Exit the System ");
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
                    car1.setChargingStation(chargingStation1);
                    System.out.println("Purchase successfully");
                }
                if (selectedCar.toUpperCase().equals(car2.getCarID())) {
                    customer1.addElectricCar(car3);
                    car2.setChargingStation(chargingStation2);
                    System.out.println("Purchase successfully");
                }
                if (selectedCar.toUpperCase().equals(car3.getCarID())) {
                    customer1.addElectricCar(car3);
                    car3.setChargingStation(chargingStation1);
                    System.out.println("Purchase successfully");
                }
                if (selectedCar.toUpperCase().equals(car4.getCarID())) {
                    customer1.addElectricCar(car4);
                    car4.setChargingStation(chargingStation3);
                    System.out.println("Purchase successfully");
                }
            } else if (choice == 2) {
                for(Customer cs:customersList){
                    System.out.println(cs);
                    ArrayList<ElectricCar> cars = cs.getElectricCars();
                    for(ElectricCar c: cars){
                        System.out.println(c);
                    }
                }
            } else if (choice == 3) {
                System.out.println("\nAvailable Charging Station");
                for (ChargingStation cs:chargingStationList){
                    System.out.println(cs);
                }
                System.out.println("\n\nUpdate Charging Station");
                System.out.println("Your car's Charging Station");
                ArrayList<ElectricCar> ec = customer1.getElectricCars();
                for(ElectricCar e : ec) {
                    System.out.println("\n" + e.getCarModel() + ", ID : " + e.getCarID() + e.getChargingStation());
                }
                System.out.print("\nDo you want to update the information(Y/N): ");
                String update;
                update = input.next();
                if(update.toUpperCase().equals("Y")){
                    System.out.print("Select which car you want to update the Charging Station (Using Car ID): ");
                    String carUpdate = input.next();
                    for(ElectricCar e : ec) {
                        if(e.getCarID().equals(carUpdate.toUpperCase())){
                            System.out.print("Select which station you want to update (Using Station ID):");
                            String stsID = input.next();
                            for (ChargingStation cs:chargingStationList){
                                if(cs.getChargingStationID().equals(stsID.toUpperCase())){
                                    e.setChargingStation(cs);
                                    System.out.println("Update successfully");
                                }
                            }
                        }
                    }
                }

            } else if(choice == 4){
                System.out.println("--------This is our car and manufacturer list--------");
                for (Manufacturer car : manufacturerList) {
                    System.out.println(car);
                }
            }
            else if (choice == 0) {
                System.exit(0);
            }

            System.out.println("\n-----------------------------------------------------");
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Purchase electric cars ");
            System.out.println("2. Display the list of electric cars owner and their information ");
            System.out.println("3. Customers to view and update the charging station ");
            System.out.println("4. Display a list of electric car manufacturers and their car models ");
            System.out.println("0. Exit the System ");
            System.out.print("Enter your choice number: ");

            choice = input.nextInt();
        }
    }

}