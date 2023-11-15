import java.util.ArrayList;

/*
 * This is a little experiment to help us figure out the
 * behavior of the ArrayList.  The question:
 *
 *   "Does the ArrayList perform a DEEP copy or a SHALLOW
 *    copy when making a copy of another list?"
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        int x;

        // An array list
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(1234, "red", "Charger"));

        // Another list makes a copy of the first one
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
