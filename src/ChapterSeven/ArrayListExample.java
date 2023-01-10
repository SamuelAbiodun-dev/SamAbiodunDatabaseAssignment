package ChapterSeven;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
     ArrayList<String> foodList = new ArrayList<>();
        System.out.println(foodList);
        foodList.add("Eba");
        System.out.println(foodList);
        foodList.add(0, "Rice");
        foodList.add(2, "Yam");
        foodList.add(3, "Fish");
        foodList.add(4, "Spaghetti");
        foodList.add(5,"Pizza");
        System.out.println(foodList);
        System.out.println(foodList.get(3));
        System.out.println(foodList.get(1));

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);
        numbers.add(1);
        System.out.println(numbers);
        numbers.add(1, 2);
        numbers.add(2, 3);
        numbers.add(3, 6);
        numbers.add(4, 10);
        numbers.add(5, -1);
        System.out.println(numbers);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        numbers.add(3, -10);
        System.out.println(numbers);
        System.out.println(numbers.get(numbers.size() - 1));
        numbers.add(numbers.size() - 1, -50);
        System.out.println(numbers);
        numbers.add(numbers.size() , -60);
       System.out.println(numbers);
       numbers.add(numbers.size() - 3, 70);
       System.out.println(numbers);
       numbers.remove(3);
       System.out.println(numbers);

    }


}
