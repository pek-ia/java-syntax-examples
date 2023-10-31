package pluralsight.hotel;

import pluralsight.hotel.ui.UserInterface;

import java.time.LocalDate;
import java.util.List;

public class Hotel {
    private List<Room> rooms;
    private List<Reservation> reservations;


    FrontDesk frontDesk;


    public void makeReservation(){
        UserInterface.getReservationInformation();

        // UI should return the following information
        LocalDate start = null;
        LocalDate end = null;
        Guest guest = null;
        RoomType roomType = null;

        // Create a reservation and add to list
        Reservation r = new Reservation(start, end, guest, roomType);
        reservations.add(r);
    }

    public void checkIn(){

        // See if they have a reservation
        // Go through all the reservations, and look for their name
        // if found
        //   Check them in
        //   Go through rooms
        //   Match available room with room type
        //   Mark reservation as fulfilled
        // Create key for room
        //
        // else
        //

    }
}
