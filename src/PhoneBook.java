import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Contact> phoneBook = new ArrayList<>();
    public void addContact(Contact contact){
        phoneBook.add(contact);
    }
    public List<Contact> viewAllContacts(){
        return new ArrayList<>(phoneBook);
    }
    public Contact viewContactGivenPhone(long phoneNo){
        for(Contact c: phoneBook){
            if(c.getPhoneNumber() == phoneNo) return c;
        }
        return null;
    }
    public boolean removeContact(long phoneNo){
        Contact toDelete = null;
        boolean res = false;
        for(Contact c: phoneBook){
            if(c.getPhoneNumber() == phoneNo) {
                toDelete = c;
                res = true;
            }
        }
        if(res)phoneBook.remove(toDelete);
        return res;
    }
}
