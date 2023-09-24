import java.util.ArrayList;

/***
 * Class containing collection of BuddyInfo objects
 *
 * @author Leena Ford 101229281
 * @version September 17, 2023
 */

public class
AddressBook {

    // collection of BuddyInfo objects
    private ArrayList <BuddyInfo> buddiesCollection;

    // Constructor
    public AddressBook() {
        buddiesCollection = new ArrayList<>(); //received warning to remove <BuddyInfo>
    }

    // Add a BuddyInfo object to the collection
    public void addBuddy(BuddyInfo buddyToAdd) {
        buddiesCollection.add(buddyToAdd);
    }

    // Checks if a buddy is in the array list and removes the BuddyInfo object from collection
    public void removeBuddy(BuddyInfo buddyToRemove) {

        //for each loop
        for (BuddyInfo removeThisBud: buddiesCollection) {
            if (removeThisBud == buddyToRemove) {
                buddiesCollection.remove(buddyToRemove);
            }
        }

    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Larry", "University Street", 18374);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}
