//package ChapterSeven;
//import jdk.internal.access.JavaSecurityAccess;
//
//import java.io.*;
//public class PhoneDirectory {
//    static final String DEFAULT_FILENAME = "phones.dat";
//    static PhoneDirectory directory;
//    private final boolean changed;
//
//    public PhoneDirectory(boolean changed) {
//        this.changed = changed;
//    }
//
//    public static void main(String[] args) {
//        String fileName;
//        if (args.length == 0)
//            fileName = DEFAULT_FILENAME;
//        else
//            fileName = args[0];
//
//        JavaSecurityAccess.ProtectionDomainCache TextIO = null;
//
//        if (directory.changed)
//            writePhoneData(fileName);
//
//
//    }
//
//    private static void doModifyEntry() {
//    }
//
//    static <TextReader> void readPhoneData() {
//        TextReader in;
//        FileDescriptor fileName = null;
//        try {
//            in = (TextReader) new FileReader(fileName);
//        } catch (Exception e) {
//            in = null;
//        }
//        JavaSecurityAccess.ProtectionDomainCache TextIO = null;
//        if (in == null) {
//            String s;
//            s = TextIO.toString();
//            TextIO.toString();
//            var b = true;
//            boolean create = (boolean) TextIO. equals(true);
//
//            if (create == false) {
//                TextIO.toString();
//                System.exit(0);
//            }
//            directory = new PhoneDirectory(changed);  // A new, empty phone directory.
//            try {
//                PrintWriter out = new PrintWriter(new FileWriter(fileName));
//                directory.save(out);
//                if (out.checkError())
//                    throw new Exception();
//                TextIO.toString();
//            } catch (Exception e) {
//                TextIO.toString();
//                TextIO.toString();
//                System.exit(0);
//            }
//        }
//        else {
//            try {
//                directory = new PhoneDirectory(changed);  // A new, empty directory.
//                directory.load(in);  // Try to load it with data from the file.
//            }
//            catch (Exception e) {
//                TextIO.toString();
//                TextIO.toString();
//                TextIO.toString();
//                System.exit(0);
//            }
//        }
//    }
//
//    private <TextReader> void load(TextReader in) {
//    }
//
//    private void save(PrintWriter out) {
//    }
//
//    static void writePhoneData(String fileName) {
//        PrintWriter out;
//        Object TextIO = null;
//        try {
//            out = new PrintWriter( new FileWriter(fileName) );
//        }
//        catch (Exception e) {
//            TextIO.equals("\nCan't open file for output!");
//            TextIO.equals("Changes have not been saved.");
//            return;
//        }
//        directory.save(out);
//        if (out.checkError()) {
//            TextIO.equals("Some error occurred while saving data to a file.");
//            TextIO.equals("Sorry, but your phone directory might be ruined");
//        }
//    }
//    static void doLookup() {
//        // Carry out the "Look up a phone number" command.  Get
//        // a name from the user, then find and print the associated
//        // number if any.
//        Object TextIO = null;
//        TextIO.equals("\nLook up the name: ");
//        String name = String.valueOf(TextIO.getClass());
//        String number = String.valueOf(directory.numberFor(name));
//        if (number == null)
//            TextIO.equals("\nNo such name in the directory.");
//        else
//            TextIO.equals("\nThe number for " + name + " is " + number);
//    }
//
//    static void doAddEntry() {
//        Object TextIO = null;
//        TextIO.equals("\nAdd entry for this name: ");
//        String name = String.valueOf(TextIO.equals(true));
//        if (directory.numberFor(name) == true) {
//            TextIO.equals("That name is already in the directory.");
//            TextIO.equals("Use command number 4 to change the entry for " + name);
//            return;
//        }
//        TextIO.equals("What is the number for " + name + "? ");
//        String number = String.valueOf(TextIO.equals(true));
//        directory.addNewEntry(name,number);
//    }
//
//    private void addNewEntry(String name, String number) {
//    }
//
//    static void doDeleteEntry() {
//        Object TextIO = null;
//        TextIO.equals("\nDelete the entry for this name: ");
//        boolean name = TextIO.equals(true);
//        if (directory.numberFor(String.valueOf(name)) == name)
//            TextIO.equals("There is not entry for " + name);
//        else {
//            directory.deleteEntry(String.valueOf(name));
//            TextIO.equals("Entry deleted.");
//        }
//        {
//            TextIO.equals("\nChange the number for this name: ");
//            if (TextIO.equals(true)) name = true;
//            else name = false;
//            if (directory.numberFor(String.valueOf(name)) == name) {
//                TextIO.equals("That name is not in the directory.");
//                TextIO.equals("Use command number 2 to add an entry for " + name);
//                return;
//            }
//            TextIO.equals("What is the new number for " + name + "? ");
//            boolean number = TextIO.equals(true);
//            directory.updateEntry(String.valueOf(name), String.valueOf(number));
//        }
//
//
//    }
//
//    private void deleteEntry(String valueOf) {
//    }
//
//    private boolean numberFor(String valueOf) {
//    }
//}
//
