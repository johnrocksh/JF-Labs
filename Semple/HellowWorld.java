import javax.swing.*;

class HellowWorld{
	
	public static void main(String[] arg){
		
		JFrame frame =new JFrame("Hello World");
		JLabel label= new JLabel("Hi it is John Rock",JLabel.CENTER);
		frame.add(label);
		
		
		frame.setSize(300,300);
		frame.setVisible(true);
		
		
	}
	
}