package ChapterSeven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneMenuOptionsTest {

    @Test
    public void switchOnMyMobilePhone() {
        // I have a mobile phone
        PhoneMenuOptions phone = new PhoneMenuOptions();
        //When I switched on the mobile phone
        phone.turnOn();
        //check that the mobile phone is now on
        assertTrue(phone.powerStatus());
    }

    @Test
    public void myMobilePhoneHasMenu() {
        //I have a mobile phone
        PhoneMenuOptions phone = new PhoneMenuOptions();
        //My mobile phone is on
        phone.turnOn();
        //My mobile phone has menu options
        phone.menuOptions();








    }


}