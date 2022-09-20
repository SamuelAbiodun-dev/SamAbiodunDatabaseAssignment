package Chapter2;

public class SmallestLargest {
    public int sum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }

    public int average(int num1, int num2, int num3) {
        int result = (num1 + num2 + num3) / 3;
        return result;
    }

    public int product(int num1, int num2, int num3) {
        int result = num1 * num2 * num3;
        return result;
    }

    public int smallest(int num1, int num2, int num3) {
        int smallestNumber = num1;
        if (num2 < smallestNumber) {
            smallestNumber = num2;
        }
        if(num3 < smallestNumber) {
            smallestNumber = num3;
        }
        return smallestNumber;
    }
    public int largest(int num1, int num2, int num3) {
        int largestNumber = num1;
        if (num2 > largestNumber) {
            largestNumber = num2;
        }
        if(num3 > largestNumber) {
            largestNumber = num3;
        }
        return largestNumber;
    }

}
