package homework;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;

public class array {
    public static void main(String args[]) {

        //Numbers Array
        int[] numbers;//declaration of an array
        numbers = new int[]{22, 33, 44, 55, 66};//initializing array after declaration

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        //String Array
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Toyota");
        System.out.println("\n" + cars);

        //Conversion of array to ArrayList
        List all = Arrays.asList(cars);
        System.out.println("ArrayList: " + all);

        //Easy way
        List<String> cars2 = Arrays.asList("Volvo", "BMW", "Ford", "Mazda", "Toyota", "Reno", "Mercedes","BMW","Toyota","Reno");
        System.out.println(cars2 + "\n");

        //Finding the index of an element
        System.out.println("Size of cars list: " + cars.size());
        int retval = cars.indexOf("Mazda");
        System.out.println("The element Mazda is at index " + retval + "\n");


        //Sort a list
        System.out.println("Sorted cars list: ");
        List<String> sortedList = cars2.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        //Reverse order of cars list
        Collections.reverse(cars2);
        System.out.println("\nReversed order of cars list : " + cars2);

        //Foreach loop
        foreachDisplay(numbers);

        //Sublist
        System.out.println("\n\nSublist: " + cars2.subList(1, 4));

        //List is an ordered sequence of elements (the same order) whereas
        //Set is a distinct list of elements which is unordered (ascending order)
        //List allows duplicates while Set doesn't allow duplicates

        //Duplicate List
        Set<String> duplicate = new HashSet<>(cars2);
        System.out.println("\nRemoved duplicates from = " + duplicate);



        //Map
            List<String> names = Arrays.asList("cats,dogs,birds,flowers".split(","));
            List<String> number = Arrays.asList("123,456,789,99".split(","));
            Map<String, String> map = new LinkedHashMap<String, String>();  // ordered

            for (int i = 0; i < names.size(); i++) {
                map.put(names.get(i), number.get(i));    // is there a clearer way?
            }

            System.out.println("\n" + map);



         //Foreach Map loop
           map.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));


         //Sorted Map
           TreeMap<String, String> sorted = new TreeMap<>(map);
           System.out.println("\n" + sorted);


        //Finding a value from birds
        System.out.println("\nThe value from birds is: " + map.get("birds"));
        //QUESTION?


        System.out.println("The key from the 123: " + getKeyByValue (map,"123"));

    }


    public static void foreachDisplay(int[] data) {
        System.out.println("\nDisplay an array using foreach loop");
        for (int a : data) {
            System.out.print(a + " ");
        }
    }

    public static String getKeyByValue (Map<String, String> map, String value){
        for (Map.Entry<String, String> o:map.entrySet()) {
            if(o.getValue().equals(value))
                return o.getKey();
        }
        return null;
    }


}
