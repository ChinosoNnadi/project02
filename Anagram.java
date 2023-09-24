package Project2;

/*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.*/

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (anagramCheck(str1,str2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }
    static boolean anagramCheck(String str1, String str2){
        //checking length
        if (str1.length() == str2.length()){
            return true;
        }
        //transforms to arrays
        char [] string1 = str1.toCharArray();
        char [] string2 = str2.toCharArray();
        //sorting
        Arrays.sort(string1);
        Arrays.sort(string2);

        for (int i = 0; i < str1.length(); i++) {
            if (string1[i] != string2[i]){
                return false;
            }
        }return true;
    }
}
