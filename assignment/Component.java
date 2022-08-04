public class Component {
    private int x, y;
    private int w, h;

    public void setBounds(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getPreferredWidth() {
        return 0;
    }

    public int getPreferredHeight() {
        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return w;
    }

    public int getHeight() {
        return h;
    }

    public void layout() {
    }

    public String toString() {
        return "component at " + getX() + ", " + getY() + " of size " + getWidth() + ", " + getHeight();
    }
}
