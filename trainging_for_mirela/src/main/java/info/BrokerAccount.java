package info;

public class BrokerAccount extends AbstractAccount {

    private final String nickName;

    public BrokerAccount(int balance, int id) {
        super(balance, id);
        this.nickName = "John";
    }

    @Override
    public String toString() {
        return String.format("Balance: %d\nId: %d\nNick Name: %s\n", getBalance(), getId(), nickName);
    }

}
