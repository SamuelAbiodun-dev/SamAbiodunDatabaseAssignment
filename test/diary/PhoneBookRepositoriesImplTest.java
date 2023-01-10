package diary;

import diary.Data.Models.Repositories.PhoneBookRepositories;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookRepositoriesImplTest {
    PhoneBookRepositoriesImpl phoneBookRepositories;
    @BeforeEach
    public void setUp(){
        phoneBookRepositories = new PhoneBookRepositoriesImpl();
    }
    @Test
    public void savePhoneBookAndTotalPhonebookIsOneTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBookRepositories.save(phoneBook);
        assertEquals(1, phoneBookRepositories.count());
    }

    @Test
    public void findPhoneBookTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.setPhoneNumber("9900");
        phoneBook.setOwnersName("Sam");
        phoneBookRepositories.save(phoneBook);
        PhoneBook savedPhoneBook = phoneBookRepositories.findById("9900");
        assertEquals(phoneBook, savedPhoneBook);
    }

    @Test
    public void updatePhoneBookFindByIdReturnSavedPhonebook(){
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.setPhoneNumber("9900");
        phoneBook1.setOwnersName("Sam");
        phoneBookRepositories.save(phoneBook1);
        PhoneBook phoneBook2 = new PhoneBook();
        phoneBook2.setOwnersName("9900");
        phoneBook2.setPhoneNumber("Samuel");
        phoneBookRepositories.save(phoneBook2);
        PhoneBook savedPhoneBook = phoneBookRepositories.findById("9900");

        assertEquals(2, phoneBookRepositories.count());
        assertEquals("Sam", savedPhoneBook.getOwnersName());

    }
}