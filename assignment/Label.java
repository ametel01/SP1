public class Label extends Component {
   private String text;
   
   public Label(String text) {
       this.text = text;
   }
   public Label() {
       this.text = "";
   }
   public String getText() {
       return this.text;
   }
   public void setText(String newText) {
       this.text = newText;
   }
   public int getPreferredWidth() {
       return this.text.length();
   }
   public int getPreferredHeight() {
       return 1;
   }
   public String toString() {
        return "Label " + super.toString();
    }
}
