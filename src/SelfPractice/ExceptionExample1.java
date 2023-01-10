package SelfPractice;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample1 {

    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        try {
             reader = new FileReader("C:\\Users\\user\\IdeaProjects\\samJava\\src\\SelfPractice\\Samuel");
             bufferedReader = new BufferedReader(reader);
            System.out.println(bufferedReader.readLine());
        }catch(IOException exception){
            System.out.println(exception.getMessage());
            System.exit(1);
        }finally {
            System.out.println("In finally block");
            if(bufferedReader != null) {
                bufferedReader.close();
            }
            if(reader != null) {
                System.out.println("Closing reader");
                reader.close();
            }
        }
    }
}
