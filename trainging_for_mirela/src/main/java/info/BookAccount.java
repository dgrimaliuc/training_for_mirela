package info;

public class BookAccount extends AbstractAccount {

    private String firstName;
    private String lastName;
    private BrokerAccount broker;


    public BookAccount(int balance, int id, String firstName, String lastName, BrokerAccount broker) {
        super(balance, id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.broker = broker;
    }


    public String getLastName() {
        return lastName;
    }

    /**
     * Sets Lst name
     *
     * @param lastName -
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return String.format("Balance: %d\nId: %d\nFirst Name: %s\nLast Name: %s\nBroker: %s", getBalance(), getId(), firstName, lastName, broker);
    }
}
