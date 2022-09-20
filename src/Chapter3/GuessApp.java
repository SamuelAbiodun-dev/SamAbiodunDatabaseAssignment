package Chapter3;

public class GuessApp {



    public static void main(String[] args) {

        int count = 0;
        while(count <= 10) {
            count = count + 2;
            //or count = count + 2;
            if(count % 2 == 0) {
            System.out.print(count + " ");

        }
    }
}
}
