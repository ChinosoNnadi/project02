package Project2;

/*
Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
*/

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

         if (str.equals(sb.reverse())) {
             System.out.println(sb.reverse() +" is a Polindrome");
           } else {
               System.out.println(sb.reverse() +" is Not a Polindrome");
           }
    }
}
