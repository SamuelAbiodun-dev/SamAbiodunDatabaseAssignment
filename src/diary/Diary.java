package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    //private int numberOfHappenings;

    private boolean isLocked;
    private String password;
    private List<Entry> entries;

    public Diary(String userName, String password){
        this.password = password;
        entries = new ArrayList<>();
        isLocked = true;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if(passwordMatches) {
            isLocked = false;
        }
    }
    public void lock() {
        isLocked = true;
    }
    public void write(String title, String body) {
//        if(isLocked) throw new IllegalArgumentException("Unlock your diary before writing");
//        if(!isLocked()) writeIntoDiary(title, body);

        IllegalArgumentException exception = new IllegalArgumentException("Unlock your diary to write");
        if(isLocked) throw exception;
        writeIntoDiary(title, body);
    }

    private void writeIntoDiary(String title, String body) {
        int id = numberOfHappenings() + 1;
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
    }

    public int numberOfHappenings() {
        return entries.size();
    }

    public Entry findEntryWithId(int id) {
        for(Entry entry: entries){
            if(entry.getId() == id){
                return entry;
            }
        }
        return null;
    }

    public int numberOfEntries() {
        return entries.size();
    }
}
