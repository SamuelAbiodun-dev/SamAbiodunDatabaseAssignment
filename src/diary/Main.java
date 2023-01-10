package diary;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static Scanner keyboardInput = new Scanner(System.in);
    private static Diary diary;

    public static void main(String[] args) {
        createDiary();
        displayLockMenu();
    }
    public static void createDiary(){
        String mainMenu = """
        Welcome to my Diary!!!
        Let's setup your diary up
        """;

        print(mainMenu);
        String userName = input("Enter your name: ");
        String password = input("Enter your password: ");
        diary = new Diary(userName, password);
        print("Diary created for "+ userName);
    }
    public static void displayLockMenu(){
        String mainMenu = """
                Press
                1 --> Unlock Diary
                2 --> Lock Diary
                3 --> exit
                """;

        String userInput = input(mainMenu);
        switch (Integer.parseInt(userInput)) {
            case 1 -> unlockDiary();
            case 2 -> lockDiary();
            case 3 -> exitApplication();
        }
    }

    private static void lockDiary() {
        diary.lock();
        print("Locked successfully!");
        displayLockMenu();
    }

    private static void unlockDiary() {
        String password = input("Enter correct password");
        diary.unlockWith(password);
        if (diary.isLocked()) {
            print("Wrong password");
        }
        displayDiaryMenu();
    }

    private static void displayDiaryMenu() {
        String diaryMenu = """
                Press 1 --> Create entry
                Press 2 --> Find Entry by Id
                Press 3 --> Get total number of entries
                Press 4 --> Lock Diary
                """;

        String userInput = input(diaryMenu);
        switch(Integer.parseInt(userInput)){
            case 1: createEntry();
            case 2: findById();
            case 3: getTotalNumberOfEntries();
            case 4: lockDiary();
        }
    }

    private static void findById() {
        String id = input("Enter the Id for the entry you want to find");
        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDiaryMenu();
    }

    private static void getTotalNumberOfEntries() {
        int totalNumberOfEntry = diary.numberOfEntries();
        print("You have "+ totalNumberOfEntry + "Entries");
        displayDiaryMenu();
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void createEntry(){
        String title = input("Enter title for the entry");
        String body = input("Enter  body for the entry");
        diary.write(title,body);
        print("Written successfully!");
        displayDiaryMenu();
    }


    private static String input(String prompt){
        //System.out.printf(prompt);
        return JOptionPane.showInputDialog(null, prompt);
    }
    private static void print(String  prompt){
        //return keyboardInput.nextLine();
        JOptionPane.showMessageDialog(null, prompt);
    }
}
