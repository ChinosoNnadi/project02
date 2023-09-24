package Project2;
/*
* You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
* */
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ToLowerCase {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        str.add("Augusta");
        str.add("Jessica");
        str.add("Ursula");
        str.add("Adam");
        str.add("Aaron");

        for (int i = 0; i < str.size(); i++) {
            String str1 = str.get(i);
            if (!str1.startsWith("A")){
                System.out.println(str);
            }
        }

        //str.removeIf(n->n.contains("A")||);
        System.out.println(str);
    }
}
