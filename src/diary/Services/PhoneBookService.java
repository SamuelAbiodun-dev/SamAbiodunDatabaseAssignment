package diary.Services;

import diary.Data.Models.Repositories.Contact;

public interface PhoneBookService {

    void register(String ownersName, String ownersPhoneNumber);
    void addContact(String ownersPhoneNumber, String firstName, String lastName, String phoneNumber);
    Contact findContact(String ownersPhoneNumber, String phoneNumberToSearchFor);
    void delete();
    void updateContact();
    int countNumberOfUsers();
}
