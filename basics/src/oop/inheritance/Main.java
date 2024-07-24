package oop.inheritance;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TrainTicket trainTicket = new TrainTicket();
        trainTicket.cancel();

//        String[] providers = {"First provider", "Second provider"};

        ArrayList providers = new ArrayList();
        providers.add("First provider");
        providers.add("Second provider");
        providers.add("Third provider");
        TrainTicket trainTicket2 = new TrainTicket(123L, "London", "Edinburgh", new BigDecimal("59.0"),
                LocalDateTime.of(2024, 8, 23, 16, 3),
                LocalDateTime.of(2022, 3, 7, 19, 3),
                3, 3, 42);

//        BusTicket busTicket = new BusTicket(123L, "London", "Edinburgh", new BigDecimal("59.0"),
//                LocalDateTime.of(2024, 8, 20, 16, 3),
//                LocalDateTime.of(2022, 3, 7, 19, 3), providers);

        trainTicket2.upgrate();
//        busTicket.cancel();
    }
}
