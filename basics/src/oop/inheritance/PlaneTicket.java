package oop.inheritance;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PlaneTicket extends TravelTicket{
    private Integer travelClass;
    private Integer seatNumber;
    private Integer stopOver;

    public PlaneTicket() {
    }

    public PlaneTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime,
                       LocalDateTime arrivalTime, Integer travelClass, Integer seatNumber, Integer stopOver) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.travelClass = travelClass;
        this.seatNumber = seatNumber;
        this.stopOver = stopOver;
    }

    public Integer getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(Integer travelClass) {
        this.travelClass = travelClass;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getStopOver() {
        return stopOver;
    }

    public void setStopOver(Integer stopOver) {
        this.stopOver = stopOver;
    }
}
