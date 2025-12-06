package users;

public class Address {
    String doorNumber;
    String street;
    long pincode;
    String city;
    String state;
    String country;

    public Address(String street, String doorNumber, long pincode, String city, String country, String state) {
        this.street = street;
        this.doorNumber = doorNumber;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.city = city;
    }
}
