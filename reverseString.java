package Project2;
/*
* Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
* */

public class reverseString {
    public static void main(String[] args) {

        String str = "Hello";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());
    }
}
