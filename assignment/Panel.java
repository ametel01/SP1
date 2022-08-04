public class Panel extends Component {
    final int LENGTH = 100;
    private LayoutManager layoutManager;
    private Component[] components = new Component[LENGTH];

    public Panel(LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public void addComponent(Component component) {
        components[components.length] = component;
    }

    public Component[] getComponents() {
        int componentsActualLength = 0;
        for (int i = 0; i < components.length; i++) {
            if (components[i] != null) { componentsActualLength++; }
        }
        Component[] newComponents = new Component[componentsActualLength];
        int idx = 0;
        for (int i = 0; i < components.length; i++) {
            if (components[i] != null) { 
                newComponents[idx] = components[i];
                idx++;
            }
        }
        return newComponents;
    }

    public void layout() {
        layoutManager.layout(this);
    }

    public int getPreferredWidth() {
        return layoutManager.getPreferredWidth(this);
    }

    public int getPreferredHeight() {
        return layoutManager.getPreferredHeight(this);
    }

    public String toString() {
        return "Panel " + super.toString();
    }
}
