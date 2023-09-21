public class BuddyInfo {

    private String address;
    private String phoneNumber;
    private String name;

    public BuddyInfo(String address, String phoneNumber, String name) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    public static void main(String[] args) {
        System.out.println("Address Book");
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy1 = new BuddyInfo("1234 street", "12345678", "Joe");
        addressBook.addBuddy(buddy1);
        System.out.println("hello, the street is: " + buddy1.getAddress() + " the phone number is: " + buddy1.getPhoneNumber() + " the name is: " + buddy1.getName());
        addressBook.removeBuddy(buddy1);
    }
}
