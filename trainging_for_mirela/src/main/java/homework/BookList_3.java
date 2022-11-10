package homework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookList_3 {

    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();

        books.add("Java for Dummies,John Smith");
        books.add("IOS,Edgar Alan Poe");
        books.add("SQL,James Rodriguez");
        books.add(".Net is not boring,Hungry Jack");
        books.add("C only if you are smart, Goofy");
        books.add("Shine while learing Ruby,Britney Spears");

        System.out.println("\nSorted books list: ");
        for (int i = 0; i < books.size(); i++) {
            Collections.sort(books);
            System.out.println(books.get(i));
        }

            System.out.println("\nBook 1: "+ books.get(1));

        Scanner console = new Scanner(System.in);

        // Get the book from the user index.
        System.out.println("\nEnter index of the book ");
        String nameBook = console.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).equals(nameBook))
            System.out.println("The book " + nameBook + " has index: " + i);
        }

    }

}