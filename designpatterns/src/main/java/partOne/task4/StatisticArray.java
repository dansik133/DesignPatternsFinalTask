package partOne.task4;

import java.util.LinkedList;
import java.util.List;

public class StatisticArray implements StatisticIterator<Integer>, StatisticIterable {
    int currentPosition = 0;
    List<Integer> integerList = new LinkedList<>();

    int size = 0;
    int positiveNumbers = 0;
    int negativeNumbers = 0;
    int average = 0;

    public StatisticArray(Strategy strategy) {
        this.strategy = strategy;
    }

    Strategy strategy;

    public void add(Integer statisticInteger) {
        integerList.add(statisticInteger);

        int value = statisticInteger;

        if(value >= 0)
            positiveNumbers += 1;
        else
            negativeNumbers += 1;

        average = ((average * size) + value) / (size + 1);

        size += 1;

    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handleStrategy() {
        integerList = strategy.changeList(integerList);
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }

    @Override
    public Integer next() {
        Integer currentInt = integerList.get(currentPosition);
        currentPosition ++;

        if(currentInt == null)
            return null;

        return currentInt;
    }

    @Override
    public boolean hasNext() {
        return size > currentPosition;
    }

    @Override
    public StatisticIterator iterator() {
        return this;
    }
}
