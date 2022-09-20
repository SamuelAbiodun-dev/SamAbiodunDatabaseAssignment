package Chapter2;

public class ChapterTwoArithmetic {

public int sumNumbers(int num1, int num2) {
                int sum = num1 + num2;
                return sum;
}
        public int squareOfSumOfNumbers(int num1, int num2) {
                int sumSquare = (num1 + num2) * (num1 + num2);
                 return sumSquare;
        }
        public int sqrtNum1(int num1) {
                int sqrt1 = (int) Math.sqrt(num1);
                return sqrt1;
        }
        public int sqrtSum(int num1, int num2) {
                int sqrt = (int) (Math.pow(num1,2) + Math.pow(num2,2));
                return sqrt;
        }
        public int numbersDifference(int num1, int num2) {
                int difference= num1 - num2;
                return difference;
        }
        public int squareOfDifferenceOfNumbers(int num1, int num2) {
                int sumDifference = (num1 - num2) * (num1 - num2);
                return sumDifference;
        }
        public int sqrtNum2(int num2) {
                int sqrt2 = (int) Math.sqrt(num2);
                return sqrt2;
        }
        public int sqrtDifference(int num1, int num2) {
                int sqrt = (int) (Math.pow(num1,2) - Math.pow(num2,2));
                return sqrt;
        }

}

