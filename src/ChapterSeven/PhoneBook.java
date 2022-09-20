package ChapterSeven;

import PhoneBookEntry.PhoneBookEntry;

import java.io.*;
import java.util.Scanner;

public class PhoneBook {

    private final PhoneBookEntry[] book;
    private int cur_entry;

    // Creates an empty PhoneBook object.
    public PhoneBook() {
        book = new PhoneBookEntry[10];
        cur_entry = 0;
    }

    // Returns true iff the current object is full.
    public boolean full() {
        return (cur_entry == 10);
    }

    // Adds the entry e into the current object, returning true if the add
    // was done successfully. If false is returned, no entry is added to the
    // current object.
    public boolean add(PhoneBookEntry e) {
        if (cur_entry == 10) return false;

        book[cur_entry] = e;
        cur_entry++;
        return true;
    }

    // Prints out the entire object.
    public void printBook() {

        System.out.println("Here are all the current entries:");
        for (int i=0; i<cur_entry; i++)
            System.out.println(i+". "+book[i]);
    }

    // Prints out all entries that have the last name lastname.
    public void search(String lastname) {

        for (int i=0; i<cur_entry; i++)
            if (book[i].sameLastName(lastname))
                System.out.println(i+". "+book[i]);
    }

    // Returns the number of entries with the last name lastname.
    public int searchNumMatches(String lastname) {

        int cnt = 0;
        for (int i=0; i<cur_entry; i++)
            if (book[i].sameLastName(lastname))
                cnt++;
        return cnt;
    }

    // Returns the index of the first entry in the current object with the
    // last name lastname. If no such entry exists, -1 is returned.
    public int getIndex(String lastname) {

        for (int i=0; i<cur_entry; i++)
            if (book[i].sameLastName(lastname))
                return i;
        return -1;
    }

    // Changes the last name of entry index to new-lastname.
    public void changeLastName(int index, String newLastName) {
        book[index].changeLastName(newLastName);
    }

    // Changes the phone number of entry index to newNum.
    public void changeNumber(int index, int newNum) {
        book[index].changeNumber(newNum);
    }

    // Prints out the menu for the user.
    public static void menu() {

        System.out.println("Here are your options:");
        System.out.println("1. Add an entry to the phonebook.");
        System.out.println("2. Print out all phonebook entries.");
        System.out.println("3. Search for an entry.");
        System.out.println("4. Change the last name of an entry.");
        System.out.println("5. Change the phone number of an entry.");
        System.out.println("6. Quit.");

    }

    // Asks the user for the entry to change and executes the change.
    public void doChangeName(Scanner stdin) throws IOException {

        // Find the last name of the entry to change.
        System.out.println("What is the last name you want to change?");
        String last = stdin.next();
        int nummatches = searchNumMatches(last);

        // No matching entries.
        if (nummatches == 0)
            System.out.println("Sorry no entries match that last name.");

            // Exactly one match found.
        else if (nummatches == 1) {
            System.out.println("Exactly one entry matched:");
            search(last);

            // Get and set the new last name.
            System.out.println("What is the new last name?");
            String newln = stdin.next();
            changeLastName(getIndex(last), newln);
        }

        // Multiple matches found.
        else {

            System.out.println("Here are the matching entries:");
            search(last);

            // Get the appropriate entry.
            System.out.println("Enter the number of the entry you want to change.");
            int changei = stdin.nextInt();

            // Get and set the new last name.
            System.out.println("What is the new last name?");
            String newln = stdin.next();
            changeLastName(changei, newln);
        }
    }

    // Asks the user for the entry to change and executes the change.
    public void doChangeNumber(Scanner stdin) throws IOException {

        // Asks for the last name of the entry to change.
        System.out.println("What is the last name for the number you want to change?");
        String last = stdin.next();
        int nummatches = searchNumMatches(last);

        // No matching entries.
        if (nummatches == 0)
            System.out.println("Sorry no entries match that last name.");

            // Exactly one match.
        else if (nummatches == 1) {
            System.out.println("Exactly one entry matched:");
            search(last);

            // Get and set the new number.
            System.out.println("What is the phone number?");
            int num = stdin.nextInt();
            changeNumber(getIndex(last), num);
        }

        // Multiple matching entries.
        else {

            // Get the exact entry to change.
            System.out.println("Here are the matching entries:");
            search(last);
            System.out.println("Enter the number of the entry you want to change.");
            int changei = stdin.nextInt();

            // Get and set the new number.
            System.out.println("What is the new phone number?");
            int num = stdin.nextInt();
            changeNumber(changei, num);
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner stdin = new Scanner(System.in);

        PhoneBook book = new PhoneBook(); // PhoneBook object to use.

        menu();
        int ans = stdin.nextInt();

        // Loop until the user quits.
        while (ans != 6) {

            // Execute the add option.
            if (ans == 1) {
                if (book.full())
                    System.out.print("Sorry, the phonebook is full, no entry can be added");
                else {
                    PhoneBookEntry e = PhoneBookEntry.getEntry();
                    book.add(e);
                    System.out.println("The entry has been added.");
                }
            }

            // Print out the Phone Book.
            else if (ans == 2)
                book.printBook();

                // Execute a search on the phone book.
            else if (ans == 3) {
                System.out.println("What is the last name for your search?");
                String last = stdin.next();
                if (book.searchNumMatches(last) > 0) {
                    System.out.println("Here are the entries the matched your search.");
                    book.search(last);
                } else
                    System.out.println("Sorry, no entries matched your search.");
            } else if (ans == 4)
                book.doChangeName(stdin);

            else if (ans == 5)
                book.doChangeNumber(stdin);

            else if (ans != 6)
                System.out.println("Sorry that is an invalid menu choice.\n");

            menu();
            ans = stdin.nextInt();
        }
        }

    }



