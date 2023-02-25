package interview.coding;

import java.util.Arrays;

public class FindVowelInstaging {
    public static void main(String[] args) {
        //Define a string
        String str = "Hello world";

        //Define an array of vowels
        char[] vowel = {'a', 'e', 'o', 'u', 'i'};

        // Initialize a counter
        int countVowel = 0;
        // Loop through each character in the string and check if it is a vowel
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            // Check if the character is a vowel using binary search
            System.out.println(Arrays.binarySearch(vowel, ch));
            if(Arrays.binarySearch(vowel, ch) >= 0 ) {
                countVowel++;
            }
            // Second-way
            //  if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u') {
            //       countVowel++ }
        }

        System.out.println("The number of vowel in the string is: " + countVowel);

    }



}
