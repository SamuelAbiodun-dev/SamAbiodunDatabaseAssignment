package ChapterFourteen;
import java.util.Arrays;
public class ExampleTwo {
    public static void main(String[] args) {
        char[] chars = new char[20];
        String string = new String("Semicolon Africa");
        string.getChars(2, 9, chars, 1);

        System.out.println(Arrays.toString(chars));
    }

}
