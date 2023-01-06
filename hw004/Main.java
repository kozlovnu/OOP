package Homework.hw004;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        

        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i < 15; i++){
            numbers.add(new Random().nextInt(-100,100));
        }
        List<String> string = new ArrayList<>();
        string.add("January");
        string.add("February");
        string.add("March");
        string.add("April");
        string.add("May");
        string.add("June");
        string.add("July");
        string.add("August");
        string.add("September");
        string.add("October");
        string.add("November");
        string.add("December");

        System.out.println("Even numbers =>");
        IsGood<Integer> isEven = new IsEven<>();
        System.out.println(filter(numbers,isEven));

        System.out.println("Positive numbers =>");
        IsGood<Integer> isPositive = new IsPositive();
        System.out.println(filter(numbers,isPositive));

        System.out.println("Begins with A =>");
        IsGood<String> beginsWithA = new BeginsWithA();
        System.out.println(filter(string,beginsWithA));

        System.out.println("Begins with =>");
        IsGood<String> beginsWith = new BeginsWith("Ju");
        System.out.println(filter(string,beginsWith));

    }

    public static <T> Iterable<T> filter(Iterable<T> inputArray, IsGood<T> filter) {
        List<T> filteredArray = new ArrayList<>();
         
        for (T item : inputArray){
            if (filter.isGood(item)){
                filteredArray.add(item);
            }
        }
        return filteredArray;
    }
}
