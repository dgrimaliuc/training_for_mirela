package info;

public class AbstractAccount {

    public static String guid = "G12345679";
    private int balance;
    private int id;

    AbstractAccount(int balance, int id) {
        setBalance(balance);
        setId(id);

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
