package ChibuzorAssignment;
class MyersBriggs2Test {
        public static void main(String[] args) {
            MyersBriggs2 questionnaire = new MyersBriggs2();
            questionnaire.askName();
            for(int i = 1; i <= 20; i ++){
                questionnaire.displayQuestion(i);
            }
            questionnaire.displaySummary();
        }

}