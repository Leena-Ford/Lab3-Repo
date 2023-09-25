/***
 * Class initializing a buddy with a name, address and phone number
 *
 * @author Leena Ford 101229281
 * @version September 10, 2023
 */
public class BuddyInfo {

    /* Name of Buddy */
    private String name;

    /* address of Buddy */
    private String address;

    /* Phone number of Buddy */
    private int phoneNumber;

    /* Constructor with defined parameters */
    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    /* Default constructor of my buddy */
    public BuddyInfo() {

    }

    /* Getter method for returning my buddy's name */
    public String getName() {
        return name;
    }

    /* Getter method for returning my buddy's address */
    public String getAddress() {
        return address;
    }

    /* Getter method for returning my buddy's phone number */
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public static void main(String[] args) {
        BuddyInfo myBuddy = new BuddyInfo("Moanna", "696 Stittsville", 210203);
        System.out.println("Hello " + myBuddy.getName());
    }
}
