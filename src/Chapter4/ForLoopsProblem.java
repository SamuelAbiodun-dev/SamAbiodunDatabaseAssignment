package Chapter4;

public class ForLoopsProblem {

    public static String [] problems = {"Food", "Money", "Interpreting questions", "Thinking through"};
    public static void main(String[] args) {
        for(String problem : problems){
            System.out.println(problem);
        }
    }
}
