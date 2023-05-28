import javax.swing.*;  
//using the  jframe using the inheritance
public class Jframe1 extends JFrame{//inheriting JFrame  
JFrame f;  
Jframe1(){  
JButton b=new JButton("click");//create button  
b.setBounds(130,100,100, 40);  
          
add(b);//adding button on frame  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
}
//main class
public class Java62_swing2{
public static void main(String[] args) {  
new Jframe1 ();  
}  
}