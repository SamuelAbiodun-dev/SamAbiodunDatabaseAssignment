package Chapter8;

import ChapterEight.Chapter8.TimeConstructorOverload;

class TimeConstructorOverloadTest {
    public static void main(String[] args) {
        TimeConstructorOverload t1 = new TimeConstructorOverload();
        TimeConstructorOverload t2 = new TimeConstructorOverload(1);
        TimeConstructorOverload t3 = new TimeConstructorOverload(1, 3);
        TimeConstructorOverload t4 = new TimeConstructorOverload(1, 2, 3);
        TimeConstructorOverload t5 = new TimeConstructorOverload(t4);

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour nd minute specified; default second", t3);
        displayTime("t4: hour, minute, second specified", t4);
        displayTime("t5: The class's object specified:", t5);

        try {
            TimeConstructorOverload t6 = new TimeConstructorOverload(27, 74, 99);
        }
    catch (IllegalArgumentException e){
        System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
    }
    }
    private static void displayTime(String header, TimeConstructorOverload time) {
        System.out.printf("%s%n  %s%n %s%n", header, time.toUniversalString(), time.toString());
    }

}