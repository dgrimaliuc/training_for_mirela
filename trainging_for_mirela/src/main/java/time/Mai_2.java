package time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static time.Time.random;

public class Mai_2 {
    public static void main(String[] args)  {

        List<Time> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objects.add(random());
            System.out.println(objects.get(i));
        }
        System.out.println("\n\n\nSorted time: \n\n\n");

        Collections.sort(objects);
        for (int i = 0; i < 10; i++) {
            System.out.println(objects.get(i));
        }



        Time time = new Time(23, 14, 20);
        //Time.notifyAfter(time);
        Time.notifyIn(time);

    }
}

