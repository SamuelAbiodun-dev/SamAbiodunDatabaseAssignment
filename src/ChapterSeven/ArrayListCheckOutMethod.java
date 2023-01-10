package ChapterSeven;

import java.util.ArrayList;


class ArrayListCheckOutMethod {
    public static double getTotal(ArrayList<Double> totalList){
        int totalPrice = 0;
        for(double number : totalList){
            totalPrice += number;
        }
        return totalPrice;
    }
    public static void displayResult(ArrayList<String> itemList, ArrayList<Integer> quantityList, ArrayList<Double> priceList,
                                     ArrayList<Double> totalList, double totalPrice){
        System.out.printf("%n%s%15s%15s%15s%n", "Item", "Quantity", "Price", "Total");
        for(int index = 0; index < itemList.size(); index++){
            System.out.printf("%4s%15d%15.2f%15.2f%n", itemList.get(index), quantityList.get(index),
                    priceList.get(index), totalList.get(index));

            if(index == itemList.size()-1){
                System.out.printf("%34s%15.2f", "total price:", totalPrice);
            }
        }
    }

}