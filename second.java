package git.flexisaf;
package weekTwo;

import java.util.*;


public class second {
    public static void main(String[] args) {
        List <String> words = new ArrayList<>(Arrays.asList("apple" , "pineapple" , "mangoe", "banana"));
       
        Iterator<String> iterator = words.iterator();
       

        String removeWord = "apple";

        while(iterator.hasNext()){
            String word = iterator.next();
            if (word.equals(removeWord)) {
                iterator.remove();
            }

        }

        System.out.println(words);
        System.out.println("hello");
    }
    
}