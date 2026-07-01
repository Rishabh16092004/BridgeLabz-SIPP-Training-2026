import java.util.*;

public class ParkingSlotManager {
    static ArrayList<String> vehicles = new ArrayList<>();
    static void addVehicle(String number) {
        vehicles.add(number);
        System.out.println(number + " Entered.");
    }
    static void removeVehicle(String number) {
        if (vehicles.remove(number))
            System.out.println(number + " Exited.");
        else
            System.out.println("Vehicle Not Found.");
    }
    static void searchVehicle(String number) {
        if (vehicles.contains(number))
            System.out.println("Vehicle is Parked.");
        else
            System.out.println("Vehicle Not Found.");
    }
    static void displayVehicles() {
        System.out.println("\nParked Vehicles:");
        for (String s : vehicles)
            System.out.println(s);
        System.out.println("Occupied Slots = " + vehicles.size());
    }
    public static void main(String[] args) {
        addVehicle("UP32AB1234");
        addVehicle("DL10XY5678");
        addVehicle("MH12AA1111");

        searchVehicle("DL10XY5678");

        removeVehicle("UP32AB1234");

        displayVehicles();
    }
}