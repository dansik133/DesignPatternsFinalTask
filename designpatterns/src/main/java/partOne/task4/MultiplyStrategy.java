package partOne.task4;

import java.util.List;
import java.util.stream.Collectors;

public class MultiplyStrategy implements Strategy {
    @Override
    public List<Integer> changeList(List<Integer> currentList) {
        return currentList.stream().map(num -> num * 2).collect(Collectors.toList());
    }
}
