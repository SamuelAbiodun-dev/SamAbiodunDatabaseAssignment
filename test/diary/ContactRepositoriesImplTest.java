package diary;

import diary.Data.Models.Repositories.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContactRepositoriesImplTest {
ContactRepositoriesImpl contactRepositories;
@BeforeEach
    public void setUp(){
    contactRepositories = new ContactRepositoriesImpl();
}
@Test
    public void saveContactAndContactIsOne(){
    Contact contact = new Contact();
    contactRepositories.save(contact);
    assertEquals(1, contactRepositories.count());
}
@Test
    public void deleteContactAndContactIsEmpty(){
    Contact contact = new Contact();
    contact.setLastName("john");
    contact.setFirstName("mark");
    contact.setPhoneNumber("09087654321");
    contactRepositories.save(contact);
    contactRepositories.delete(contact);

   // contactRepositories.delete(contact);
    assertEquals(0, contactRepositories.count());
}
@Test
    public void cannotDeleteAContactThatDoesNotExist(){
    Contact contact1 = new Contact();
    assertThrows(IllegalArgumentException.class, ()-> contactRepositories.delete(contact1));
}

}