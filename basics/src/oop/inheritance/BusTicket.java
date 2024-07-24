package oop.inheritance;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BusTicket extends TravelTicket{

    private ArrayList<String> permittedProviders;

    public BusTicket() {
        super();
    }

    public BusTicket(Long bookingRef, String origin, String destination, BigDecimal price, LocalDateTime departureTime,
                     LocalDateTime arrivalTime, ArrayList<String> permittedProviders) {
        super(bookingRef, origin, destination, price, departureTime, arrivalTime);
        this.permittedProviders = permittedProviders;
    }

    public ArrayList<String> getPermittedProviders() {
        return permittedProviders;
    }

    public void setPermittedProviders(ArrayList<String> permittedProviders) {
        this.permittedProviders = permittedProviders;
    }

    @Override
    public void cancel() {
        Duration d = Duration.between(LocalDateTime.now(), getDepartureTime());
        long days = d.toDays();
        if (days > 30){
            super.cancel();
        } else {
            System.out.println("Cannot cancel the ticket within 30 days");
        }
    }
}
