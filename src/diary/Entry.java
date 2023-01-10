package diary;

import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDate timeOfEntry;


    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        timeOfEntry = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return String.format("""
                 ###########################################
                Entry: %s
                Written on: %s
                 Title: %s
                 Body: %s
                 ###########################################
                 """, id, timeOfEntry, title, body);

    }
    }
