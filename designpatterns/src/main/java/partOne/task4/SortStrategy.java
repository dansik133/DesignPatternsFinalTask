package partOne.task4;

import java.util.List;
import java.util.stream.Collectors;

public class SortStrategy implements Strategy {
    @Override
    public List<Integer> changeList(List<Integer> currentList) {
        return currentList.stream().sorted().collect(Collectors.toList());
    }
}
