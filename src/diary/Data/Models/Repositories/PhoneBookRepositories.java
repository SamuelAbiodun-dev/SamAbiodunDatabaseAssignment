package diary.Data.Models.Repositories;

import diary.PhoneBook;

public interface PhoneBookRepositories {

    PhoneBook save(PhoneBook phoneBook);

    void delete(PhoneBook phoneBook);

    int count();

    PhoneBook findById(String phoneNumber);
}
