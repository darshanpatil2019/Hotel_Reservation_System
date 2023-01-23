public class HotelData {
    String customer_type;
    String hotelName;
    int rate;
    int regularCustomerRate;
    String checkInDate;
    String checkOutDate;

    public HotelData(String customer_type, String hotelName, int rate, int regularCustomerRate, String checkInDate, String checkOutDate) {
        this.customer_type = customer_type;
        this.hotelName = hotelName;
        this.rate = rate;
        this.regularCustomerRate = regularCustomerRate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public void setRegularCustomerRate(int regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return "HotelData{" +
                "customer_type='" + customer_type + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", rate=" + rate +
                ", regularCustomerRate=" + regularCustomerRate +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}
