package partOne.task11;

import java.util.ArrayList;
import java.util.List;

public class BoardCareTaker {
    List<BoardMemento> allMementos = new ArrayList<>();

    public void AddMemento(BoardMemento memento) {
        allMementos.add(memento);
    }

    public BoardMemento getLast() {
        return allMementos.get(allMementos.size() - 1);
    }

    public BoardMemento getAndRemoveLast() {
        if(allMementos.size() == 0)
            return null;

        BoardMemento last = allMementos.remove(allMementos.size() - 1);
        return last;
    }

}
