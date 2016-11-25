import java.awt.*;
import javax.swing.*;

public class GUIExp2
{
	public static void main(String [] args)
	{
		JFrame jf1 = new JFrame("NEW FRAME");
		int windowWidth = 400;
		int windowHeight = 400;
		Toolkit tk = jf1.getToolkit();
		Dimension d1 = tk.getScreenSize();
		
		jf1.setBounds(50,50,windowWidth,windowHeight);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BorderLayout border = new BorderLayout();
		Container content = jf1.getContentPane();
		content.setLayout(border); 
		jf1.setLayout(border);
		
		//JPanel leftpanel = new JPanel();
		JCheckBox chk1 = new JCheckBox("EAST");
		//panel1.setLayout(new BorderLayout);
		jf1.add(chk1,border.EAST);
		JCheckBox chk2 = new JCheckBox("WEST");
		
		jf1.add(chk2,border.WEST);
		JButton btn1 = new JButton("BLUE");  
		Dimension size = new Dimension(80,20);
		//leftpanel.add(btn1 =  new JButton("BLUE"));

		btn1.setPreferredSize(size);
		
		JButton btn2 = new JButton("GREEN");
		JButton btn3 = new JButton("RED");
		JButton btn4 = new JButton("ORANGE");
		JButton btn5 = new JButton("PINK");
		
		jf1.add(btn1,border.CENTER);
		//btn1.setBounds(10,20,30,40);
		jf1.add(btn2,border.CENTER);
		jf1.add(btn3,border.CENTER);
		jf1.add(btn4,border.CENTER);
		jf1.add(btn5,border.CENTER);
		
		
		JCheckBox chk3 = new JCheckBox("NORTH");
		jf1.add(chk3,border.NORTH);
		
		JCheckBox chk4 = new JCheckBox("SOUTH");
		jf1.add(chk4,border.SOUTH);
		
		
		jf1.setVisible(true);
	}
	
}