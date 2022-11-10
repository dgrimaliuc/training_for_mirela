package time;

import java.lang.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Time implements Comparable {
    int minute, second, hour;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }


    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else throw new IllegalArgumentException("Hour can't be: " + hour);
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else throw new IllegalArgumentException("Minute can't be: " + minute);

    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else throw new IllegalArgumentException("Seconds can't be: " + second);
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hour, minute, second);
    }


    public static Time random() {
        Time time = new Time();
        SecureRandom random = new SecureRandom();
        random.nextInt(10);
        time.setHour(random.nextInt(24));
        time.setMinute(random.nextInt(60));
        time.setSecond(random.nextInt(60));
        return time;
    }


    public static void main(String args[]) {

        List<Time> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objects.add(random());
            System.out.println(objects.get(i));
        }
        System.out.println("\n\n\nSorted time: \n\n\n");

        objects = sort(objects);
        for (int i = 0; i < 10; i++) {
            System.out.println(objects.get(i));
        }

    }

    public static List<Time> sort(List<Time> list){
        for(int i = 0; i<list.size()-1; i++)
        {
            for (int j = i+1; j<list.size(); j++)
            {
                if(list.get(i).compareTo(list.get(j))>0)
                {
                    Time temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }


    @Override
    public int compareTo(Object time2) {
        Time time = (Time) time2;
        if (this.hour == time.hour && this.minute == time.minute && this.second == time.second) {
            return 0;
        } else if (this.hour > time.hour && this.minute > time.minute && this.second > time.second)
            return -1;
        else return 1;
    }
}
