public class Button extends Component {
    private String text;

    public Button(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPreferredHeight() {
        return 1;
    }

    public int getPreferredWidth() {
        return text.length() + 2;
    }

    public String toString() {
        return "Button " + super.toString();
    }
}
