import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle(1234, "red", "Charger"));

        ArrayList<Vehicle> vehiclesCopy = new ArrayList<>(vehicles);

        // Now, the test!!!

        Vehicle oldVehicle = vehicles.get(0);
        Vehicle newVehicle = vehiclesCopy.get(0);

        if (oldVehicle == newVehicle){
            System.out.println("SHALLOW!!!");
        }
        else {
            System.out.println("DEEP!!!");
        }

        vehiclesCopy.remove(0);

        // Original list
        System.out.println(vehicles);
        // Copy of list
        System.out.println(vehiclesCopy);
    }
}
