package diary.Services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookServiceImplTest {
   @Test
   public void registerUserTest(){
       PhoneBookService phoneBookService = new PhoneBookServiceImpl();
       phoneBookService.register("Sam Abiodun", "081");
       assertEquals(1,phoneBookService.countNumberOfUsers());
   }
    @Test
    public void registerDuplicateUserFailsTest(){
        PhoneBookService phoneBookService = new PhoneBookServiceImpl();
        phoneBookService.register("Sam Abiodun", "081");
        assertThrows(IllegalArgumentException.class, ()->phoneBookService.register("Samuel Abiodun", "081"));
        assertEquals(1,phoneBookService.countNumberOfUsers());
    }


}