package ChapterSeven;

public class PhoneMenuOptions {
   private boolean power;
   private String menu;


    public void turnOn() {
        if(!power){
            power = true;
        }
    }

    public boolean powerStatus() {
               return power;
    }

    public static void menuOptions() {
        System.out.println("");
    }

}
