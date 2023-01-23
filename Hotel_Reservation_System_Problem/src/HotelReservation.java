public class HotelReservation {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Program");

        HotelReservationSystem reservationSystem = new HotelReservationSystem();
        reservationSystem.addHotel();
        reservationSystem.addHotel();
       // reservationSystem.addHotel();
        reservationSystem.printHotel();
        reservationSystem.cheapestHotel();
    }
}