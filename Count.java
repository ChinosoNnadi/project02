package Project2;

/*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.*/

public class Count {
    public static void main(String[] args) {

            // initializing a string
            String input = "Hello, world!";
            // initial count of the words
            int count = 1;
            // for loop to count the number of words
            for (int i = 0; i < input.length(); i++) {
                // checking if current character is space or not
                if ((input.charAt(i) == ' ') && (input.charAt(i+1) != ' ')) {
                    count++; // incrementing the word count
                }
            }
            // printing the result
            System.out.println("Number of words in the given string: " +  count);
        }
}
