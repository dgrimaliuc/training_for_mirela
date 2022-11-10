package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class BookList {

    public static void main(String[] args) {

        String[] books = books();

        displayAllBooks(books);

        System.out.println("\nSorted books list: ");

        int size = books.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].compareTo(books[j]) > 0) {
                    String temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
        displayAllBooks(books);
    }


    public static String[] books() {
        String[] books = new String[10];

        books[0] = "Java for Dummies,John Smith";
        books[1] = "JavaScript in 10 Minutes,Jack Arnold";
        books[2] = "IOS,Edgar Alan Poe";
        books[3] = "SQL,James Rodriguez";
        books[4] = ".Net is not boring,Hungry Jack";
        books[5] = "Shine while learing Ruby,Britney Spears";
        books[6] = "Move like a snake with Phython";
        books[7] = "PHP and work in Facebook,Bill Gates";
        books[8] = "C only if you are smart, Goofy";
        books[9] = "C++ in a year++, Atreyu";

        return books;
    }

    public BookList(String[] books) {
        books = new String[10];
    }

    public static void displayAllBooks(String[] books) {

        for (int i = 0; i < books.length; i++)
            System.out.println((i + 1) + ") " + books[i]);
    }
}