package datastructures;

import java.util.Arrays;

public class ArraysOfObjects {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,};
        Book[] books = new Book[10];

        books[4] = new Book("A good read", "John Doe", 17.99);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(books));
    }
}
