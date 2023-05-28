// importing Java AWT class
import java.awt.*;

// class AWTExample2 directly creates an instance of Frame class
class Java58_awt2 {

   // initializing using the constructor
   Java58_awt2() {

      // creating a Frame
      Frame f = new Frame();

      // creating a Label
      Label l = new Label("Employee id:");

      // creating a Button
      Button b = new Button("Submit");

      // creating a TextField
      TextField t = new TextField();

      // setting position of above components in the frame
      l.setBounds(20, 80, 80, 30);
      t.setBounds(20, 100, 80, 30);
      b.setBounds(100, 100, 80, 30);

      // adding components into frame
      f.add(b);
      f.add(l);
      f.add(t);

      // setting the size of the frame
      f.setSize(400, 300);

      // setting the title of the frame
      f.setTitle("Employee info");

      // setting layout to null
      f.setLayout(null);

      // setting visibility of the frame
      f.setVisible(true);
   }

   public static void main(String[] args) {
      // creating an instance of AWTExample2 class
	   Java58_awt2 example = new Java58_awt2();
   }
}
