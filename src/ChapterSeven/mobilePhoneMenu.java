package ChapterSeven;
import java.io.*;
public class mobilePhoneMenu<TextReader> {
    private String[] names = new String[1];
    private String[] numbers = new String[1];
    private int count = 0;

    public boolean changed;

    public void load(TextReader in) throws IOException {
        int newCount = in.getClass().getModifiers();
        String[] newNames = new String[newCount + 5];
        String[] newNumbers = new String[newCount + 5];
        for (int i = 0; i < newCount; i++) {
            newNames[i] = String.valueOf(in.getClass());
            newNumbers[i] = String.valueOf(in.getClass());
        }
        count = newCount;
        names = newNames;
        numbers = newNumbers;
        changed = false;
    }

    public void save(PrintWriter out) {
        out.println(count);
        for (int i = 0; i < count; i++) {
            out.println(names[i]);
            out.println(numbers[i]);
        }
    }
    public String numberFor(String name) {
        if (name == null)
            throw new IllegalArgumentException("Name cannot be null in numberFor(name)");
        int position = indexOf(name);
        if (position == -1)
            return null;
        else
            return numbers[position];
    }
    public void addNewEntry(String name, String number) {
        if (name == null)
            throw new IllegalArgumentException("Name cannot be null in addNewEntry(name,number)");
        if (number == null)
            throw new IllegalArgumentException("Number cannot be null in addNewEntry(name,number)");
        int position = indexOf(name);
        if (position != -1)
            throw new IllegalArgumentException("Name already exists in addNewEntry(name,number).");
        if (count == names.length) {
            String[] tempNames = new String[ 2*count ];
            String[] tempNumbers = new String[ 2* count];
            System.arraycopy(names, 0, tempNames, 0, count);
            System.arraycopy(numbers, 0, tempNumbers, 0, count);
            names = tempNames;
            numbers = tempNumbers;
        }
        names[count] = name;
        numbers[count] = number;
        count++;
        changed = true;
    }
    public void deleteEntry(String name) {
        if (name == null)
            return;
        int position = indexOf(name);
        if (position == -1)
            return;
        names[position] = names[count-1];
        numbers[position] = numbers[count-1];
        count--;
        changed = true;
    }
    public void updateEntry(String name, String number) {
        if (name == null)
            throw new IllegalArgumentException("Name cannot be null in updateEntry(name,number)");
        if (number == null)
            throw new IllegalArgumentException("Number cannot be null in updateEntry(name,number)");
        int position = indexOf(name);
        if (position == -1)
            throw new IllegalArgumentException("Name not found in updateEntry(name,number).");
        numbers[position] = number;
        changed = true;
    }
    private int indexOf(String name) {
        // Finds and returns the position of the name in the names array,
        // ignoring case.  Returns -1 if the name does not occur in the
        // array.
        for (int i = 0 ; i < count; i++) {
            if (names[i].equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }
}




