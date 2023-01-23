import java.util.*;

public class HotelReservationSystem {
    List<HotelData> hotelDataArrayList = new ArrayList<>();

    public void addHotel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Type : ");
        String customerType = sc.nextLine();
        System.out.println("Enter the Hotel Name : ");
        String hotelName = sc.nextLine();
        System.out.println("Enter the Rating : ");
        int rating = sc.nextInt();
        System.out.println("Enter the Check-In Date : ");
        String checkInDate = sc.next();
        System.out.println("Enter the Check-Out Date : ");
        String checkOutDate = sc.next();

        System.out.println("Enter the Regular Customer rate : ");
        int regularCustomerRate = sc.nextInt();

        HotelData hotelData = new HotelData(customerType, hotelName, rating, regularCustomerRate, checkInDate, checkOutDate);
        hotelDataArrayList.add(hotelData);
    }

    public void printHotel() {
        System.out.println(hotelDataArrayList);
    }

    public void cheapestHotel() {
        String hotelName = hotelDataArrayList.stream().min(Comparator.comparing(HotelData::getRegularCustomerRate)).get().getHotelName();
        System.out.println("The Cheapest Hotel is  " + hotelName);
    }
}
