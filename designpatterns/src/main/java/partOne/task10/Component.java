package partOne.task10;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public abstract class Component {
    public abstract void addChild(Component c) throws OperationNotSupportedException;

    public abstract void removeChild(Component c) throws OperationNotSupportedException;

    public abstract List<Component> getChilds();

    public abstract void printMe();
}
