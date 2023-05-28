import java.awt.event.*;
import java.awt.*;

//java awt example
public class Java60_awt4 extends Frame implements ActionListener {
TextField tf;

public Java60_awt4() {
	//creting the textfield
	
	//creating the component
	tf = new TextField();
	tf.setBounds(60,50,170,20);
	Button b = new Button("click me");
		b.setBounds(100,120,80,30);
	
		//registering the listner
		b.addActionListener(this);
		//add a component size
		 
		add(tf);
		add(b);
		setSize(300,400);
		setLayout(null);
		setVisible(true);
		
}
//we have to override this
public void actionPerformed(ActionEvent e) {
	tf.setText("Username");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Java60_awt4();
	}

}
