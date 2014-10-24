import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.imageio.*;
import java.io.*;
import javax.swing.border.*;

public class P3 extends JPanel{

    public static void main(String[] args){

	JMenuBar menuBar;
	JMenu menu;
	JMenu helpMenu;
	JMenuItem menuItem1;
	JMenuItem menuItem2;
	JMenuItem menuItem3;
	JMenuItem getStartedItem;
	JMenuItem aboutItem;
	JLabel iconLabel;
	Image iconImage;
	ImageIcon icon;

	JFrame frame = new JFrame("Pixelator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setPreferredSize(new Dimension(500, 400));
	frame.getContentPane().setBackground(Color.gray);
	frame.setLayout(new GridLayout(2,1));

	// Creating the menuBar

	menuBar = new JMenuBar();

	// Creating the File menu and submenus on menu bar

	menu = new JMenu("File");
	menuBar.add(menu);

	menuItem1 = new JMenuItem("Choose an Image File...");
	menu.add(menuItem1);

	menuItem2 = new JMenuItem("Save this Image...");
	menu.add(menuItem2);

	menuItem3 = new JMenuItem("Quit");
	menu.add(menuItem3);

	// Creating the Help menu and submenus
	
	helpMenu = new JMenu("Help");
	menuBar.add(helpMenu);

	getStartedItem = new JMenuItem("Get Started");
	aboutItem = new JMenuItem("About");

	// Create first panel

	JPanel panel1 = new JPanel();
	panel1.setLayout(new BoxLayout(panel1, BoxLayout.PAGE_AXIS));
	panel1.setBackground(Color.gray);
	panel1.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));


	JLabel label1 = new JLabel("Select a file: ");
	JButton b1 = new JButton("Open");
	
	b1.setAlignmentX(Component.CENTER_ALIGNMENT);
	label1.setAlignmentX(Component.CENTER_ALIGNMENT);

	// Second panel

	JPanel panel2 = new JPanel();
	panel2.setBackground(Color.gray);
	panel2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
	panel2.setLayout(new BoxLayout(panel2, BoxLayout.PAGE_AXIS));

	// Panel3 is the top panel of panel2

	JPanel panel3 = new JPanel(new FlowLayout());
	panel3.setBackground(Color.gray);

	JRadioButton normalButton = new JRadioButton("Normal");
	JRadioButton grayScaleButton = new JRadioButton("Grayscale");
	JRadioButton eightBitButton = new JRadioButton("8-Bit");

	normalButton.setAlignmentY(Component.CENTER_ALIGNMENT);
	grayScaleButton.setAlignmentY(Component.CENTER_ALIGNMENT);
	normalButton.setSelected(true);


	ButtonGroup group = new ButtonGroup();
	group.add(normalButton);
	group.add(grayScaleButton);
	group.add(eightBitButton);

	panel3.add(normalButton);
	panel3.add(grayScaleButton);
	panel3.add(eightBitButton);

	// Panel4 is the center panel of panel2

	JPanel panel4 = new JPanel();
	JLabel chosenFileLabel = new JLabel("Image to be Altered: None");
	panel4.add(chosenFileLabel);
	panel4.setBackground(Color.gray);
	// Panel5 is the bottom panel of panel2

	JPanel panel5 = new JPanel();
	panel5.setBackground(Color.gray);
	
	JButton pixelateButton = new JButton("Pixelate");
	JButton resetButton = new JButton("Reset");

	panel5.add(pixelateButton);
	panel5.add(resetButton);

	frame.getContentPane().add(panel1);
	frame.getContentPane().add(panel2);
	panel2.add(panel3);
	panel2.add(panel4);
	panel2.add(panel5);

	// Hard coding in an image icon for aesthetic purposes

	try{	
	    iconImage = ImageIO.read(new File("smallRalph.jpg"));
	    icon = new ImageIcon(iconImage);
	    iconLabel = new JLabel(icon);
	    iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	    panel1.add(iconLabel);
	}
	catch(IOException e){
	    System.out.println("File not found");
	    System.exit(0);
	}


	panel1.add(label1);
	panel1.add(b1);



	
	
	
	frame.setJMenuBar(menuBar);
	frame.pack();
	frame.setVisible(true);

    }



}


