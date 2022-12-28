package exceptions.task2;

import exceptions.task2.NotAPolindromExeption;

import java.util.Scanner;

public class MainNotAPolindromExeption {
    public static void main(String args[]) {

        String n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a line: ");
        n = scanner.nextLine();
        try {
            if (!isPolindrom(n))
                throw new NotAPolindromExeption(n);
        } catch (NotAPolindromExeption e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean isPolindrom(String str) {

        int strLength = str.length();
        StringBuilder reverseStr = new StringBuilder();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr.append(str.charAt(i));
        }

        if (str.equalsIgnoreCase(reverseStr.toString())) {
            System.out.println(str + " is a Palindrome String.");
            return true;
        } else {
            System.out.println(str + " is not a Palindrome String.");
            return false;
        }

    }
}

