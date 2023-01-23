import java.util.Scanner;

public class HotelReservationSystem {
    public void addHotel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Type : ");
        String customerType = sc.next();
        System.out.println("Enter the Hotel Name : ");
        String hotelName = sc.next();
        System.out.println("Enter the Rating : ");
        int rating = sc.nextInt();
        System.out.println("Enter the Check-In Date : ");
        String checkInDate = sc.next();
        System.out.println("Enter the Check-Out Date : ");
        String checkOutDate = sc.next();
        System.out.println("Enter the Regular Customer rate : ");
        int regularCustomerRate = sc.nextInt();
    }
}
