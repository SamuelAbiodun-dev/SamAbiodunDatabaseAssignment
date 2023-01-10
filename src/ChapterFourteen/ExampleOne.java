package ChapterFourteen;

public class ExampleOne {
    public static void main(String[] args) {
        String name = new String();
        //TODO String name = "";
        byte item1 = Byte.parseByte("65");
        byte item2 = Byte.parseByte("66");
        byte item3 = Byte.parseByte("67");

        byte[] myByteArray = {item1, item2, item3};
        String myName = new String(myByteArray, 0, 3);
        System.out.println("str:: "+ myName );

        char[] charArray = {'A', 'B', 'C', 'D'};
        String mySchoolName = new String(charArray);
        System.out.println(mySchoolName);
        System.out.println(mySchoolName.length()==3);
        System.out.println(mySchoolName.charAt(2));
    }
}
