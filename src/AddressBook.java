import java.util.ArrayList;
//test
public class AddressBook {
    ArrayList<BuddyInfo> buddyInfos;

    public AddressBook() {
        this.buddyInfos = new ArrayList<>();
    }

    public ArrayList<BuddyInfo> getBuddyInfos() {
        return buddyInfos;
    }

    public void addBuddy(BuddyInfo buddy) {
        buddyInfos.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddyInfos.remove(buddy);
    }

    public void method() {
    }

    public static void main(String[] args){
        BuddyInfo buddyInfo = new BuddyInfo("123 road", "12345678", "Caleb");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(buddyInfo);
    }
}


