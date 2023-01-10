package ChapterEight.Chapter8;

//public enum Region {
//    SOUTH_EAST(),
//    NORTH_NORTH(),
//    SOUTH_SOUTH();
//
//    private final String[] states;
//    Region(String... states){
//
//    }
//}

public class Region {
    public static int count;
    private int number;
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public String toString() {
        return "I am an object";
    }

    public Region(int number) {
        this.number = number;
        ++count;


        System.out.printf("Welcome, number %d%n",number);
        System.out.printf("No of object is now %d%n", count);
    }


    public static void main(String[] args) {
        Region region = new Region(45);
        Region region2 = new Region(56);
        Region region3= new Region(56);
        Region region4 = new Region(56);

    }
}
