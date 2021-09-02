package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {

    private String key;

    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        collection1.forEach(s ->{
            if(s.contains("-")){
                key = s.split("-")[0];
                map.put(s.split("-")[0], map.getOrDefault(key, 0) + Integer.parseInt(s.split("-")[1]));
            } else {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        });
        return map;
    }
}
