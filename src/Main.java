import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        System.out.println("Welcome to phone book\nMenu:");
        while (true){
            System.out.println("1.Add contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter first name: ");
                    String firstName = sc.next();
                    System.out.println("Enter last name: ");
                    String lastName = sc.next();
                    System.out.println("Enter phone number: ");
                    long phoneNumber = sc.nextLong();
                    System.out.println("Enter email id: ");
                    String email = sc.next();
                    Contact c = new Contact(firstName, lastName, phoneNumber, email);
                    phoneBook.addContact(c);
                }
                case 2 -> {
                    List<Contact> contactList = phoneBook.viewAllContacts();
                    contactList.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.println("Enter phone number: ");
                    long phone = sc.nextLong();
                    Contact viewContact = phoneBook.viewContactGivenPhone(phone);
                    if(viewContact != null) System.out.println(viewContact);
                    else System.out.println("No contact available with number "+phone+"!");
                }
                case 4 -> {
                    System.out.println("Enter phone number: ");
                    long phone = sc.nextLong();
                    boolean ans = phoneBook.removeContact(phone);
                    if(ans) System.out.println("Phone number removed successfully!");
                    else System.out.println("No contact available with number "+phone+"!");
                }
                case 5 -> System.exit(-1);
            }
        }
    }
}