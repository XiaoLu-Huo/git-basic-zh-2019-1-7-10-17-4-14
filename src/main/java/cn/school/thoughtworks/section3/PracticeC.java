package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collectionC = new HashMap<>();
        collectionA.forEach(s -> collectionC.put(s, collectionC.getOrDefault(s, 0) + 1));
        object.get("value").forEach(s -> {
            extracted(collectionC, s);
        });
        return collectionC;
    }

    private void extracted(Map<String, Integer> collectionA, String s) {
        Integer value = collectionA.get(s);
        if(collectionA.containsKey(s) && value >= 3) {
            collectionA.put(s, value - value / 3);
        }
    }
}
