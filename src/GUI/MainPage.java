package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;











import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.JTextField;
//import javax.script.*;
import javax.swing.JTable;
import javax.swing.ScrollPaneLayout;




public class MainPage {

	// constant variables for the whole frame
	private final int JFRAME_HEIGHT = 200;
	private final int JFRAME_WIDTH = 2000;
	// attributes
	private JFrame frame;	// top level container
	private JPanel panel;	// subcontainer that keeps all the components togethe
	private CustomFont font;  // custom font



	public MainPage() throws Exception {
		
		// initialize the JFrame container
		frame = new JFrame("TWWF Admin");	// this will set the background of the page
		frame.setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImagePanel imagePane = new ImagePanel("resources/wwf-logo.png");
		// initialize the JPanel container
		   panel = new JPanel();
		   panel.setLayout(new BorderLayout());
		   
      // initialize Table data
            String[] columnNames = {"First Name",
                        "Last Name",
                        "Event",
                        "Number of People",
                        "Application Completion"};
      Object[][] data = {
      {"Kathy", "Smith",
        "Scavenger Hunt", new Integer(156), new Boolean(false)},
      {"John", "Doe",
        "Sensory Exploration", new Integer(205), new Boolean(true)},
      {"Sue", "Bleu",
        "Human Cameras", new Integer(263), new Boolean(false)},
      {"Jane", "Plane",
        "Brown Bag Botany", new Integer(210), new Boolean(true)},
      {"Joe", "Bro",
        "Homes for Seeds", new Integer(106), new Boolean(false)},
      {"Kat", "Sy",
        "Recycling with Worms", new Integer(120), new Boolean(false)},
      {"Aragorn", "Elessar",
        "Farm Insects: Friend and Foe", new Integer(310), new Boolean(true)},
      {"Legolas", "Leggomyego",
        "Soil and Water: Beyond Mud!", new Integer(268), new Boolean(false)},
      {"Gandalf", "White",
        "Goldilocks Priniciple", new Integer(209), new Boolean(true)},
      {"Smaug", "Smug",
        "Tinker Toys of Gardening", new Integer(190), new Boolean(false)},
      {"Cathelyn", "Stark",
        "Plan a Farm", new Integer(420), new Boolean(false)},
      {"John", "Snow",
        "Brown Bag Botany", new Integer(207), new Boolean(true)},
      {"Ned", "Stark",
        "Homes for Seeds", new Integer(233), new Boolean(false)},
      {"Joffery", "Baratheon",
        "Recycling with Worms", new Integer(333), new Boolean(false)},
      {"Margaery", "Tyrell",
        "Farm Insects: Friend and Foe", new Integer(290), new Boolean(true)},
      {"Tyrion", "Lannister",
        "Soil and Water: Beyond Mud!", new Integer(222), new Boolean(false)},
      {"Brienne", "Tarth",
        "Goldilocks Priniciple", new Integer(270), new Boolean(true)},
      {"Sansa", "Stark",
        "Tinker Toys of Gardening", new Integer(156), new Boolean(false)},
      {"Petyr", "Baelish",
         "Plan a Farm", new Integer(145), new Boolean(false)},
      {"Gregor", "Clegane",
         "Tinker Toys of Gardening", new Integer(190), new Boolean(false)},
      {"Daario", "Naharis",
         "Plan a Farm", new Integer(420), new Boolean(false)},
      {"Oberyn", "Martell",
         "Brown Bag Botany", new Integer(207), new Boolean(true)},
      {"Hodor", "Hodor",
         "Homes for Seeds", new Integer(233), new Boolean(false)},
      {"Jojen", "Reed",
         "Recycling with Worms", new Integer(333), new Boolean(false)},
      {"Podrick", "Payne",
         "Farm Insects: Friend and Foe", new Integer(290), new Boolean(true)},
      {"Rickon", "Stark",
         "Soil and Water: Beyond Mud!", new Integer(277), new Boolean(false)},
      {"Tywin", "Lannister",
         "Goldilocks Priniciple", new Integer(270), new Boolean(true)},
      {"Daenerys", "Targaryen",
         "Tinker Toys of Gardening", new Integer(156), new Boolean(false)},
      {"Arya", "Stark",
         "Plan a Farm", new Integer(145), new Boolean(false)}

          

      };
      
      
      // create table object
      JTable table = new JTable(data, columnNames);
 
		frame.add(panel);
		//JScrollPane 
        JScrollPane tableContainer = new JScrollPane(table);
        tableContainer.setPreferredSize(new Dimension(650, 400));
        	//tableContainer.setAlignmentX(LEFT_ALIGNMENT);


        // Layout of panel
        panel.setLayout(new BoxLayout (panel,BoxLayout.PAGE_AXIS) );
        
        //set Label of table
        JLabel label = new JLabel("Saved Data");
		font = new CustomFont();	// set the font
		label.setFont(font.getFont());
		label.setBounds(70, 170, 
				100, 25);
		
		// add parts to panel
        panel.add(label);
        
        // add formating to panel
        panel.add(Box.createRigidArea(new Dimension(0,5)));
        
        // add table to panel
        panel.add(tableContainer);
        // set border
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        	// JPanel background = new JPanel();
        	// background.setBackground (Color.green);
        	// frame.getContentPane().add(background);
        frame.getContentPane().add(panel);

        frame.pack();
			
		
		// make it resizeable
		frame.setResizable(true);

		// enables the visibility of the page
		frame.setVisible(true);

	}// End of ctor


		

	

}
