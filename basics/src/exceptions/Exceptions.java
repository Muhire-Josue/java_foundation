package exceptions;

import classes.User;

import java.time.LocalDate;

public class Exceptions {

    public static void divideByZero(){
        System.out.println(17/0);
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[] {1,2,3,4};
//        System.out.println(integers[9]);
//        divideByZero();
        LocalDate today = null;
//        System.out.println(today.getMonth());
        String hello = "hello";
//        Double.valueOf(hello);
        try {
            User user = new User("John Doe", -9);
        } catch (InvalidAgeException e) {
            throw new RuntimeException(e);
        }
    }
}
