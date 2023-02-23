import com.engeto.hotel.Booking;
import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla", "Malíková",
                LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček",
                LocalDate.of(1995, 5, 5));

        List<Guest> otherGuests = new ArrayList<>();
        otherGuests.add(guest1);
        otherGuests.add(guest2);

        for (Guest guest : otherGuests) {
            System.out.println( "Host: " + guest.getName() +
                                " " + guest.getSurname() +
                                ", datum narození: " + guest.getBorn());
        }

        Room room1 = new Room(1, 1,
                true, true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2, 1,
                true, true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3, 3,
                false, true, BigDecimal.valueOf(2400));

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);


        for (Room room : roomList) {
            System.out.println( "Číslo Pokoje " + room.getRoomNumber() +
                                ", počet lůžek " + room.getNumberOfBeds() +
                                ", s balkonem " + room.isBalcony() +
                                ", s výhledem na moře " + room.isSeeView() +
                                ", cena pokoje za jednu noc " + room.getPricePerNight());
            }

        Booking booking1 = new Booking(room1, guest1, null,
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26),
                "Rekreační");

        Booking booking2 = new Booking(room3, guest2,
                Collections.singletonList(otherGuests.get(0)),
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14),
                "Pracovní");

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(new Booking(room2, guest1, null,
                LocalDate.of(2021, 8, 3),
                LocalDate.of(2021, 8, 15),
                "Turistická"));
        bookingList.add(new Booking(room1, guest2, null,
                LocalDate.of(2022, 2, 18),
                LocalDate.of(2022, 2, 25),
                "Pracovní"));


        for (Booking booking : bookingList) {
            System.out.println("Rezervační systém:" );
            System.out.println("Číslo pokoje: " + booking.getRoom().getRoomNumber());
            System.out.println("Rezervace na jméno: " + booking.getGuest().getName() +
                                                    " " + booking.getGuest().getSurname());
            System.out.println("Další osoby: " + booking.getOtherGuests());
            System.out.println("Délka pobytu od " + booking.getStartDate() + " do " + booking.getEndDate());
            System.out.println("Druh pobytu: " + booking.getTypeOfVacation());
        }


    }




}