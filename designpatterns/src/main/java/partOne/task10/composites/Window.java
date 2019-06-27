package partOne.task10.composites;

import partOne.task10.Component;
import partOne.task10.composites.Composite;

public class Window extends Composite {
    @Override
    public void printMe() {
        System.out.println("I am window and those are my children");
        children.forEach(Component::printMe);
    }
}
