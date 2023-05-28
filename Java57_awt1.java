
//by using aggregation
import java.awt.*;

class Frame1 extends Frame {
    Frame1() {
    	Frame obj =new Frame();
        // Creating a button
        Button obj1 = new Button();
        // Setting the button position
        obj1.setBounds(20, 30, 40, 50);
        // Adding button into frame
        obj.add(obj1);
        // Setting the title of the frame
        setTitle("This is the first AWT program");
        // Set layout
        setLayout(null);
        // Set the visibility of the frame
        setVisible(true);
    }
}

public class Java57_awt1 {
    public static void main(String[] args) {
        // Creating an instance of the Frame1 class
        Frame1 obj2 = new Frame1();
    }
}
