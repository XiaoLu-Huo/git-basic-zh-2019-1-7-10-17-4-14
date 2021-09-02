package cn.school.thoughtworks.section1;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        Set<String> set = new LinkedHashSet<>();
        collection1.forEach(s -> {
            collection2.keySet().forEach(res->{
                List<String> collect = collection2.get(res)
                        .stream()
                        .filter(ans -> ans.contains(s))
                        .collect(Collectors.toList());
                set.addAll(collect);
            });
        });
//        collection2.keySet().forEach(s -> {
//            List<String> collect = collection1.stream().filter(collection2.get(s)::contains)
//                    .collect(Collectors.toList());
//            set.addAll(collect);
//        });
        return new ArrayList<>(set);
    }
}
