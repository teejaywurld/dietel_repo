package CohortNineTest;

import java.util.HashMap;
import java.util.Map;

public class HashmapNumberCount {
    public static void main(String[] args) {
        System.out.println();

        String statement = "Cohort nine consists of men and ladies";

        Map <String, Integer> hashMap = new HashMap<>();

        String [] words = statement.split(" ");

        for (String word : words){
            Integer integer = hashMap.get(word);

            if (integer == null)
                hashMap.put (word, 1);

            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
