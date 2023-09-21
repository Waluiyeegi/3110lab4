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
    }
}
