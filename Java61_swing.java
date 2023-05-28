import javax.swing.*;

//Java swing Example	
public class Java61_swing {

	public static void main(String[] args) {
		//creating the instance of the frame
		JFrame j = new JFrame();
		//creating the Jbutton
		JButton b = new JButton("click me");
		//setting the places
		b.setBounds(130,100,100,40);
		//adding the button to Jframe
		j.add(b);
		//setting the size 
		j.setSize(400,500);
		//set layout
		j.setLayout(null);
		//make frame visible
		j.setVisible(true);
		

	}

}
