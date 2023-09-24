package Project2;

import java.util.List;
import java.util.stream.Collectors;

public class ListString {

        public static void main(String[] args) {
            List<String> strings= List.of("Apple", "Watermelon", "Steak","Apricot", "Mashed potatoes");
            List<String> filter=strings.stream().filter(x->x.startsWith("A")).map(String::toLowerCase)
                    .collect(Collectors.toList());
            System.out.println(filter);

        }

    }

