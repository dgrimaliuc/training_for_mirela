package src.other_folder;

import src.info.BookAccount;
import src.info.BrokerAccount;

import java.security.SecureRandom;


public class Main {

    public static void main(String[] args) {
        BrokerAccount brokerAccount = new BrokerAccount(123, 456);

        BookAccount bookAccount = new BookAccount(randInt(), randInt(), "Denis", "Iuri", brokerAccount);


        System.out.println("Book");
        System.out.println(bookAccount);



    }


    public static int randInt() {
        return new SecureRandom().nextInt();
    }

}