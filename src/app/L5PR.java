package app;

import app.phonebook.PhoneDirectory;
import app.phonebook.Record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L5PR {
    public static void main(String[] args) {

        List<String> petsList = List.of(
                "Cat", "Dog", "Bird", "Hamster", "Lizard",
                "Rabbit", "Rat", "Dog", "Fish", "Bird");

        System.out.println(petsList);
        String strDog = "Dog";
        System.out.println(countOccurrences(petsList, strDog));

        int[] array = {1, 2, 3};
        System.out.println("Array" + Arrays.toString(array));
        System.out.println("List" + toList(array));

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4, 5, 2, 4, 2);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println(uniqueNumbers);

        System.out.println();
        calcOccurence(petsList);

        System.out.println();
        List<String> occurrences = findOccurance(petsList);
        occurrences.forEach(System.out::println);

        System.out.println();
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add(new Record("Mary Sue" , "198-345-6782"));
        phoneDirectory.add(new Record("Mary Sue" , "198-345-6783"));
        phoneDirectory.add(new Record("John Smith" , "198-790-9484"));

        Record foundRecord = phoneDirectory.find("Mary Sue");
        System.out.println("Found record: " + foundRecord);

        List<Record> records = phoneDirectory.findAll("Mary Sue");
        System.out.println("Found records " + records);

        Record notFound = phoneDirectory.find("Andy Moe");
        System.out.println("Not found record: " + notFound);




    }

    public static int countOccurrences(List<String> petsList, String strDog) {
        int count = 0;
        for (int i = 0; i < petsList.size(); i++) {
            if (petsList.get(i).equals(strDog)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    public static void calcOccurence(List<String> petsList) {
        List<String> proceedWords = new ArrayList<>();

        for(String pet : petsList) {
            if(!proceedWords.contains(pet)) {
                int count = 0;
                for(String word : petsList) {
                    if(word.equals(pet)) {
                        count++;
                    }
                }
                System.out.println(pet + ": " + count);
                proceedWords.add(pet);
            }
        }
    }

    public static List<String> findOccurance(List<String> petsList) {
       List<String> proceedWords = new ArrayList<>();
       List<String> result = new ArrayList<>();

       for(String pet : petsList) {
           if(!proceedWords.contains(pet)) {
               int count = 0;
               for(String word : petsList) {
                   if(word.equals(pet)) {
                       count++;
                   }
               }
               result.add("{name: \"" + pet + "\", occurrence: " + count + "}");
               proceedWords.add(pet);
           }
       }
       return result;
    }

    }
