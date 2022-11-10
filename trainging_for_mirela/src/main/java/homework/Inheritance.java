//package homework;
//
//import java.io.*;
//import java.lang.*;
//import java.util.*;
//
//public class Inheritance {
//    public static void main(String args[]) {
//        class Student {
//            public int number;
//            public int marks;
//
//            // the Student class has one constructor
//            public Student(int number, int marks) {
//                this.Helen = Helen;
//                this.Will = Will;
//            }
//
//            // the Student class has three methods
//            public void Profile (int Mar) {
//                number -= Mark;
//            }
//
//            public String toString() {
//                return ("Students are " + number + "\n"
//                        + "The marks of the students are " + marks);
//            }
//        }
//
//        // derived class
//        class UndergraduateStudent extends Student {
//
//            // the MountainBike subclass adds one more field
//            public int seatHeight;
//
//            // the MountainBike subclass has one constructor
//            public MountainBike(int gear, int speed,
//                                int startHeight) {
//                // invoking base-class(Bicycle) constructor
//                super(gear, speed);
//                seatHeight = startHeight;
//            }
//
//            // the MountainBike subclass adds one more method
//            public void setHeight(int newValue) {
//                seatHeight = newValue;
//            }
//
//            class GraduateStudent extends Student {
//
//                // the MountainBike subclass adds one more field
//                public int seatHeight;
//
//                // the MountainBike subclass has one constructor
//                public MountainBike(int gear, int speed,
//                                    int startHeight) {
//                    // invoking base-class(Bicycle) constructor
//                    super(gear, speed);
//                    seatHeight = startHeight;
//                }
//
//                // the MountainBike subclass adds one more method
//                public void setHeight(int newValue) {
//                    seatHeight = newValue;
//                }
//
//                // overriding toString() method
//            // of Bicycle to print more info
//            @Override
//            public String toString() {
//                return (super.toString() + "\nseat height is "
//                        + seatHeight);
//            }
//        }
//        MountainBike mb = new MountainBike(3, 100, 25);
//        System.out.println(mb.toString());
//    }
//}
//
