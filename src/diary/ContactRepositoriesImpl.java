package diary;

import diary.Data.Models.Repositories.Contact;

import java.util.ArrayList;

public class ContactRepositoriesImpl implements ContactRepositories{
    private ArrayList<Contact> contacts = new ArrayList<>();
    @Override
    public Contact save(Contact contact) {
        Contact savedContact = findById(contact.getPhoneNumber());
        if(savedContact == null){
            contacts.add(contact);
        }
//        else{
//            savedContact.setFirstName(contact.getFirstName());
//            savedContact.setLastName(contact.getLastName());
//            savedContact.setPhoneNumber(contact.getPhoneNumber());
        //}
        return contact;
    }

    @Override
    public void delete(Contact deleteContact) {
       // Contact contactDelete = null;
        for(Contact contact : contacts){
            if(contact.getPhoneNumber().equals(deleteContact.getPhoneNumber())){
                contacts.remove(deleteContact);
                break;
            }
        }
        if(!contacts.contains(deleteContact)) throw new IllegalArgumentException("Number does not exist");
        else{
            contacts.remove(deleteContact);
            System.out.println("Number deleted successfully");
        }
    }
    @Override
    public int count() {
        return contacts.size();
    }
    @Override
    public Contact findById(String phoneNumber) {
        return null;
    }
}
