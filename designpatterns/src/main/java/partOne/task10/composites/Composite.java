package partOne.task10.composites;

import partOne.task10.Component;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Component {
    List<Component> children = new ArrayList<Component>();

    @Override
    public void addChild(Component c) {
        children.add(c);
    }

    @Override
    public void removeChild(Component c) {
        children.remove(c);
    }

    @Override
    public List<Component> getChilds() {
        return children;
    }
}
