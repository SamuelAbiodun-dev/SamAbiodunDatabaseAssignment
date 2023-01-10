package diary.Services;

import diary.Data.Models.Repositories.Contact;
import diary.Data.Models.Repositories.PhoneBookRepositories;
import diary.PhoneBook;
import diary.PhoneBookRepositoriesImpl;

public class PhoneBookServiceImpl implements PhoneBookService{
PhoneBookRepositories phoneBookRepositories = new PhoneBookRepositoriesImpl();
    @Override
    public void register(String ownersName, String ownersPhoneNumber) {
        PhoneBook savedPhoneBook = phoneBookRepositories.findById(ownersPhoneNumber);
        if(savedPhoneBook != null) throw new IllegalArgumentException("User Exists");
        //if(userExist(ownersPhoneNumber)) throw new IllegalArgumentException("User already exist")
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setOwnersName(ownersName);
        phoneBook.setPhoneNumber(ownersPhoneNumber);
        phoneBookRepositories.save(phoneBook);
    }

//    private boolean userExist(String ownersPhoneNumber) {
//
//    }
    @Override
    public void addContact(String ownersPhoneNumber, String firstName, String lastName, String phoneNumber) {

    }

    @Override
    public Contact findContact(String ownersPhoneNumber, String phoneNumberToSearchFor) {
        return null;
    }

    @Override
    public void delete() {

    }

    @Override
    public void updateContact() {

    }

    @Override
    public int countNumberOfUsers() {
        return phoneBookRepositories.count();
    }
}
