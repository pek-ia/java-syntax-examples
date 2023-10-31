package pluralsight.hotel;

import java.time.LocalDate;
import java.util.List;

public class Reservation {
    public Reservation() {
    }

    public Reservation(LocalDate start, LocalDate end, Room room, Guest guest, List<RoomKey> keys) {
        this.start = start;
        this.end = end;
        this.room = room;
        this.guest = guest;
        this.keys = keys;
    }

    LocalDate start;
    LocalDate end;
    Room room = null;
    Guest guest;
    List<RoomKey> keys;
    RoomType requestedType;
}
