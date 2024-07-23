package oop.inheritance;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TrainTicket trainTicket = new TrainTicket();
        trainTicket.cancel();

        TrainTicket trainTicket2 = new TrainTicket(123L, "London", "Edinburgh", new BigDecimal("59.0"),
                LocalDateTime.of(2022, 3, 7, 16, 3),
                LocalDateTime.of(2022, 3, 7, 19, 3),
                3, 3, 42);

        trainTicket2.upgrate();;
    }
}
