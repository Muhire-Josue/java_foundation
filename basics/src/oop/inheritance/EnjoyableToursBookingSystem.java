package oop.inheritance;

public class EnjoyableToursBookingSystem implements BookingSystem{
    @Override
    public void setTravelTicket(TravelTicket ticket) {
        System.out.println("Enjoyable Tours has recived ticket" + ticket);
    }

    @Override
    public void requestBooking() {
        System.out.println("Enjoyable Tours received a booking request");
    }

    @Override
    public boolean getStatus() {
        System.out.println("Enjoyable Tours is providing the booking status");
        return false;
    }
}
