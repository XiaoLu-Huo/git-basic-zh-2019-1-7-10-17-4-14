package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = new ArrayList<>(collection1);
        List<String> collection = new ArrayList<>();
        for (List<String> stringList : collection2) {
            collection.addAll(stringList);
        }
        result.retainAll(collection);
        return result;
    }
}
