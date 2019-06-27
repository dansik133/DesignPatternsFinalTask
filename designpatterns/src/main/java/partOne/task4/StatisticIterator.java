package partOne.task4;

public interface StatisticIterator<T> {
    void reset();
    T next();
    boolean hasNext();
}
