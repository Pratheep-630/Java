package users;

public class User {
    public String username;
    public long contactNumber;
    private String password;
    public String emailId;
    public String role;
    public String id;
    Address address;

    public User(String username, long contactNumber, String password, String emailId, String state, String country, String city, String street, String doorNumber, long pincode, String role, String id) {
        this.username = username;
        this.contactNumber = contactNumber;
        this.password = password;
        this.emailId = emailId;
        this.role = role;
        this.id = id;
        // create an address object 
        Address addr = new Address(street, doorNumber, pincode, city, country, state);
        this.address = addr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
