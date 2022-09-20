public class Calculator {

    public Calculator(int firstNum, int secNum) {
    }

    public int addTwoNumbers(int firstNum, int secNum) {
        int sum = firstNum + secNum;
        return sum;
    }

    public int productTwoNumbers(int firstNum, int secNum) {
        int product = firstNum * secNum;
        return product;
    }

    public int divideTwoNumbers(int firstNum, int secNum) {
        int division = firstNum / secNum;
        return division;
    }

//    //public int collectUsersInput(int input1, int input2, int input3) {
//        //if (input1 <= 0 || input2 <= 0 || input3 <= 0) {
//            System.out.printf("%s%n", "Invalid integer");
//        }
//        int result = input1 + input2 + input3;
//        return result;
//    }

    //||
    public int receiveUsersInput(int input1, int input2, int input3) {
        if (input1 <= 0) {
            System.out.println("Your input can't be that less!");
        } else
            if (input2 <= 0) {
            System.out.println("Ahh! Wetin happun?");
        } else
            if (input3 <= 0 ) {
                System.out.println("I don give up, God abeggg!");
            }
            return input1 + input2 + input3;
    }
    //||

}


