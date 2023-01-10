package diary;

import diary.Data.Models.Repositories.PhoneBookRepositories;

import java.util.ArrayList;

public class PhoneBookRepositoriesImpl implements PhoneBookRepositories {
private ArrayList<PhoneBook> phonebooks = new ArrayList<>();
    @Override
    public PhoneBook save(PhoneBook phoneBook) {
        PhoneBook savedPhoneBook = findById(phoneBook.getPhoneNumber());
        if(savedPhoneBook == null) phonebooks.add(phoneBook);
        else {
            savedPhoneBook.setOwnersName(phoneBook.getOwnersName());
            savedPhoneBook.setContacts(phoneBook.getContacts());
            savedPhoneBook.setPhoneNumber(phoneBook.getPhoneNumber());
        }
        return phoneBook;
    }

        @Override
    public void delete(PhoneBook phoneBook) {

    }

    @Override
    public int count() {
        return phonebooks.size();
    }

    @Override
    public PhoneBook findById(String phoneNumber) {
        for(PhoneBook phoneBook: phonebooks){
            if(phoneBook.getPhoneNumber().equals(phoneNumber)) return phoneBook;
        }
        return  null;
    }
}
