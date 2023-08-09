public class Contact {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String emailID;
    public Contact(String firstName, String lastName, long phoneNumber, String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "First Name = "+firstName+", Last Name = "+lastName+", Phone number = "+phoneNumber+", email = "+emailID;
    }
}
