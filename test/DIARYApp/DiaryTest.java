package DIARYApp;

import diary.Diary;
import diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary myDiary;
    @BeforeEach
    public void setUp(){
        myDiary = new Diary("Samuel", "correctPassword");
    }
    @Test
    public void diaryExistTest(){
        assertNotNull(myDiary);
    }

    @Test
    public void newDiaryIsLocked(){
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void lockedCanBeUnlocked(){
        assertTrue(myDiary.isLocked());
        myDiary.unlockWith("correctPassword");
        assertFalse(myDiary.isLocked());
    }
    @Test
    public void wrongPasswordCannotUnlockDiaryTest(){
        assertTrue(myDiary.isLocked());
        myDiary.unlockWith("wrongPassword");
        assertTrue(myDiary.isLocked());
    }
    @Test
    public void diaryCanBeLocked(){
        myDiary.unlockWith("correctPassword");
        assertFalse(myDiary.isLocked());
        myDiary.lock();
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void happeningsCanBeAddedToTheDiary(){
        myDiary.unlockWith("correctPassword");
        assertFalse(myDiary.isLocked());

        myDiary.write("Prayer1",
                "I shall be a great Software Engineer...");
        assertEquals(1, myDiary.numberOfHappenings());
    }

    @Test
    public void aSecondHappeningCanBeAddedAndToTheDiary(){
        myDiary.unlockWith("correctPassword");
        assertFalse(myDiary.isLocked());

       myDiary.write("Prayer2",
               "I shall be a great Software Engineer...");
       assertEquals(1, myDiary.numberOfHappenings());

        myDiary.write("Prayer3",
                "By the Grace of God, success is mine...");
        assertEquals(2, myDiary.numberOfHappenings());

        myDiary.write("Prayer4", "By the Grace of God, success is mine, Amen...");
        assertEquals(3, myDiary.numberOfHappenings());
    }

    @Test
    public void entryCannotBeAddedWhenDiaryIsLocked(){
        assertTrue(myDiary.isLocked());
        myDiary.write("Prayer4", "By the Grace of God, success is mine, Amen...");
        assertEquals(0, myDiary.numberOfHappenings());
    }
    @Test
    public void writingToLockedDiaryThrowsException(){
        assertTrue(myDiary.isLocked());
        assertThrows(Exception.class, () -> myDiary.write("My usual prayer",
                    "I shall be successful by God's grace..."));
        assertEquals(0, myDiary.numberOfEntries());
    }

    @Test
    public void happeningsCannotBeAddedWhenDiaryIsLockedTest(){
        assertTrue(myDiary.isLocked());

        try{
            myDiary.write("My prayer", "I shall be successful");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(0, myDiary.numberOfEntries());
    }

    @Test
    public void entryCanBeFoundById(){
        myDiary.unlockWith("correctPassword");
        assertFalse(myDiary.isLocked());

        myDiary.write("Prayer1",
                "I shall be a great Software Engineer...");
        Entry foundEntry = myDiary.findEntryWithId(1);
        assertEquals(1, foundEntry.getId());
        assertEquals("Prayer1", foundEntry.getTitle());
        assertEquals("I shall be a great Software Engineer...", foundEntry.getBody());
    }
   }
