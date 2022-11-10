package homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookList_easyway {
    public static void main(String[] args) {

        List<String> books = Arrays.asList("Java for Dummies,John Smith", "JavaScript in 10 Minutes,Jack Arnold",
                "IOS,Edgar Alan Poe", "SQL,James Rodriguez", ".Net is not boring,Hungry Jack",
                "Shine while learing Ruby,Britney Spears", "Move like a snake with Phython",
                "PHP and work in Facebook,Bill Gates", "C only if you are smart, Goofy", "C++ in a year++, Atreyu");
        System.out.println(books + "\n");

        System.out.println("Sorted books list: " );
        books.stream().sorted().forEach(System.out::println);

    }

}