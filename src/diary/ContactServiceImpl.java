//package diary;
//
//import diary.Data.Models.Repositories.Contact;
//import diary.Services.ContactService;
//
//public class ContactServiceImpl implements ContactService {
//    Contact contacts = new Contact();
//    ContactRepositories contactRepositories = new ContactRepositoriesImpl();
//
//    @Override
//    public void addContact(String ownersPhoneNumber, String firstName, String lastName, String phoneNumber) {
//        Contact savedContact = findContact();
//    }
//
//    @Override
//    public Contact findContact(String ownersPhoneNumber, String phoneNumberToSearchFor) {
//        for(Contact contact : contacts){
//            if(contact.getPhoneNumber().equals(ownersPhoneNumber)) return contact;
//        }
//        for(Contact contact : contacts){
//            if(contact.getPhoneNumber().equals(phoneNumberToSearchFor)) return contact;
//        }
//        return null;
//    }
//
//    @Override
//    public void delete() {
//
//    }
//}
