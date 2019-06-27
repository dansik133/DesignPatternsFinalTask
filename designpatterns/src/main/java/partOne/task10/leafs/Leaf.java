package partOne.task10.leafs;

import partOne.task10.Component;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public abstract class Leaf extends Component {
    @Override
    public void addChild(Component c) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public void removeChild(Component c) throws OperationNotSupportedException {
        throw new OperationNotSupportedException();
    }

    @Override
    public List<Component> getChilds() {
        return null;
    }
}
