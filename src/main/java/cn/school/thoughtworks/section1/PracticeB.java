package cn.school.thoughtworks.section1;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        Set<String> set = new LinkedHashSet<>();
//        采用下面的这种方式，会出现乱序
//        collection2.forEach(s -> {
//            List<String> list = collection1.stream()
//                    .filter(s::contains)
//                    .collect(Collectors.toList());
//            set.addAll(list);
//        });
        collection1.forEach(s -> {
            collection2.forEach(res -> {
                List<String> collect = res.stream()
                        .filter(ans -> ans.contains(s))
                        .collect(Collectors.toList());
                set.addAll(collect);
            });
        });
        return new ArrayList<>(set);
    }
}
