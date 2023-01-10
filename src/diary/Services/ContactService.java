package diary.Services;

import diary.Data.Models.Repositories.Contact;

public interface ContactService {
    void addContact(String ownersPhoneNumber, String firstName, String lastName, String phoneNumber);
    Contact findContact(String ownersPhoneNumber, String phoneNumberToSearchFor);
    void delete();
}
