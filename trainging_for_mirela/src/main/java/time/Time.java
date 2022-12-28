package time;

import java.security.SecureRandom;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Time implements Comparable {
    private int minute, second, hour;

    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public int getHour() {
        return hour;
    }


    public Time() {
        this(0, 0, 0);
    }
    public Time(int hour) {
        this(hour, 0, 0);
    }
    public Time(int hour, int minute) {
        this(hour, minute, 0);
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


    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public static Time random() {
        Time time = new Time();
        SecureRandom random = new SecureRandom();
        random.nextInt(10);
        time.setHour(random.nextInt(24));
        time.setMinute(random.nextInt(120));
        time.setSecond(random.nextInt(60));
        return time;
    }


    @Override
    public String toString() {
        return String.format("%d:%d:%d", hour, minute, second);
    }


    public static void notifyAfter(Time time) {

        System.out.println("Sleep time = " + time);
        sleep(convertToMilliseconds(time.hour, time.minute, time.second));

    }

    public static void notifyIn(Time time) {

        LocalTime now = LocalTime.now();
        Time currentTime  = new Time(now.getHour(), now.getMinute(),  now.getSecond());
        if (currentTime.compareTo(time) < 0) {

            System.out.println("notifyIn time = " + time);
            sleep(convertToMilliseconds(0, 0, 0));
        }throw new IllegalArgumentException("Time is not valid: " + time);

    }

    private static int convertToMilliseconds(int hour, int minute, int second) {
        hour = hour * 3600000;
        minute = minute * 60000;
        second = second * 1000;

        return hour + minute + second;
    }

    public static void sleep (int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ignored) {
        }

    }



        @Override
        public int compareTo (Object time2){
            Time time = (Time) time2;
            int cmp = (this.hour - time.hour);
            if (cmp == 0) {
                cmp = (this.minute - time.minute);
                if (cmp == 0) {
                    cmp = (this.second - time.second);
                }
            }
            return cmp;
        }


    }
