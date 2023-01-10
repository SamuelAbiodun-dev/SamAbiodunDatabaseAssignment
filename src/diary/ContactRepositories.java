package diary;

import diary.Data.Models.Repositories.Contact;

public interface ContactRepositories {
    Contact save(Contact contact);
    void delete(Contact contact);
    int count();
    Contact findById(String phoneNumber);
    }

