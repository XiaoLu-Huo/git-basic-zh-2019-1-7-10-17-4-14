package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {

    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        object.get("value").forEach(s -> {
            extracted(collectionA, s);
        });
        return collectionA;
    }

    private void extracted(Map<String, Integer> collectionA, String s) {
        Integer value = collectionA.get(s);
        if(collectionA.containsKey(s) && value >= 3) {
            collectionA.put(s, value - value / 3);
        }
    }
}
