package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    private Map<String, Integer> wordCountMap;


    public WordCounter(String... strings) {
        wordCountMap = new HashMap<>();
        for(String str : strings){
            wordCountMap.merge(str, 1, Integer::sum);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return wordCountMap;
    }
}
