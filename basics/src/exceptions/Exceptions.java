package exceptions;

public class Exceptions {

    public static void divideByZero(){
        System.out.println(17/0);
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[] {1,2,3,4};
//        System.out.println(integers[9]);
        divideByZero();
    }
}
