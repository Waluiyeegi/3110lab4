import java.util.ArrayList;

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
}
