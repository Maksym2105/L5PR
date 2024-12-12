package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L5PR {
    public static void main(String[] args) {

        List<String> list = List.of(
                "Cat" , "Dog" ,"Bird" , "Hamster" , "Lizard" ,
                "Rabbit" , "Rat" , "Dog" , "Fish" , "Bird" );

        System.out.println(list);

        String strDog = "Dog";
        System.out.println(countOccurrences(list , strDog));

        int[] numbers = {1, 2, 3};

        System.out.println("Array" + Arrays.toString(numbers));
        System.out.println("List" + toList(numbers));


        }
        public static int countOccurrences(List<String> list, String str) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                count++;
            }
        }
        return count;
        }

        public static List<Integer> toList(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        return list;
        }


    }
