/*
 * Team: DataMiners
 * Conrtibutors: Brian Choi
 * Date: 11/22/14
 * File: Login.java
 * Description: This is the login page displayed once the user runs the application. It will create and initialize necessary containers and
 * 				buttons required to login.
 */

package GUI;

import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	
	// constant variables for the whole frame
	private final int JFRAME_HEIGHT = 400;
	private final int JFRAME_WIDTH = 400;
	
	// constant variables for the "username" label
	private final int USERNAME_LABEL_X = 70;
	private final int USERNAME_LABEL_Y = 170;
	private final int USERNAME_LABEL_WIDTH = 100;
	private final int USERNAME_LABEL_HEIGHT = 25;
	
	// constant variables for the "username" textbox
	private final int USERNAME_TEXT_X = 170;
	private final int USERNAME_TEXT_Y = 170;
	private final int USERNAME_TEXT_WIDTH = 160;
	private final int USERNAME_TEXT_HEIGHT = 25;
	
	// constant variables for the "Password" label
	private final int PASSWORD_LABEL_X = 70;
	private final int PASSWORD_LABEL_Y = 220;
	private final int PASSWORD_LABEL_WIDTH = 100;
	private final int PASSWORD_LABEL_HEIGHT = 25;
	
	// constant variables for the "Password" textbox
	private final int PASSWORD_TEXT_X = 170;
	private final int PASSWORD_TEXT_Y = 220;
	private final int PASSWORD_TEXT_WIDTH = 160;
	private final int PASSWORD_TEXT_HEIGHT = 25;
	
	// constant variables for "login" button
	private final int LOGIN_BUTTON_X = 90;
	private final int LOGIN_BUTTON_Y = 290;
	private final int LOGIN_BUTTON_WIDTH = 100;
	private final int LOGIN_BUTTON_HEIGHT = 25;
	
	// constant variables for "register" button. We implement this button last
	// when we have time
	private final int REGISTER_BUTTON_X = 210;
	private final int REGISTER_BUTTON_Y = 290;
	private final int REGISTER_BUTTON_WIDTH = 100;
	private final int REGISTER_BUTTON_HEIGHT = 25;
	
	// attributes
	private JFrame frame;	// top level container
	private JPanel panel;	// subcontainer that keeps all the components together
	private CustomFont font;  // custom font

	// default constructor
	public Login() throws Exception {
		
		// initialize the JFrame container
		frame = new JFrame("TWWF Admin Login");	// this will set the background of the login page
		frame.setSize(JFRAME_WIDTH, JFRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// initialize the JPanel container
		panel = new ImagePanel("resources/wwf-logo.png");
		frame.add(panel);
		placeComponents(panel);		
		
		// initialize font
		
		
		// make it not resizable
		frame.setResizable(false);

		// enables the visibility of the login page
		frame.setVisible(true);
	}

	// places all the components into the Jpanel
	private void placeComponents(JPanel panel) throws Exception {

		panel.setLayout(null);
		//font = new CustomFont();
		
		/* label for "Wild Willow Farm" title
		JLabel titleLabel1 = new JLabel("Wild Willow Farm");
		titleLabel1.setFont(font.getFont());
		titleLabel1.setBounds(TITLE1_LABEL_X, TITLE1_LABEL_Y, TITLE1_LABEL_WIDTH, 
				TITLE1_LABEL_HEIGHT);
		panel.add(titleLabel1);
		*/
		
		/* label for "Trip Manager" title
		JLabel titleLabel2 = new JLabel("Trip Manager");
		titleLabel2.setFont(font.getFont());
		titleLabel2.setBounds(TITLE2_LABEL_X, TITLE2_LABEL_Y, TITLE2_LABEL_WIDTH, 
				TITLE2_LABEL_HEIGHT);
		panel.add(titleLabel2);
		*/

		// label for "username"
		JLabel userLabel = new JLabel("Username");
		font = new CustomFont();	// set the font
		userLabel.setFont(font.getFont());
		userLabel.setBounds(USERNAME_LABEL_X, USERNAME_LABEL_Y, 
				USERNAME_LABEL_WIDTH, USERNAME_LABEL_HEIGHT);
		panel.add(userLabel);

		// textbox for "username"
		JTextField userText = new JTextField(20);
		userText.setBounds(USERNAME_TEXT_X, USERNAME_TEXT_Y, 
				USERNAME_TEXT_WIDTH, USERNAME_TEXT_HEIGHT);
		panel.add(userText);

		// label for "Password"
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(font.getFont());	// set font
		passwordLabel.setBounds(PASSWORD_LABEL_X, PASSWORD_LABEL_Y, 
				PASSWORD_LABEL_WIDTH, PASSWORD_LABEL_HEIGHT);
		panel.add(passwordLabel);

		// textbox for "Password"
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(PASSWORD_TEXT_X, PASSWORD_TEXT_Y, 
				PASSWORD_TEXT_WIDTH, PASSWORD_TEXT_HEIGHT);
		panel.add(passwordText);

		// button for "login"
		JButton loginButton = new JButton("login");
		loginButton.setFont(font.getFont());
		loginButton.setBounds(LOGIN_BUTTON_X, LOGIN_BUTTON_Y, 
				LOGIN_BUTTON_WIDTH, LOGIN_BUTTON_HEIGHT);
		panel.add(loginButton);
		
		// button for "register"
		JButton registerButton = new JButton("register");
		registerButton.setFont(font.getFont());
		registerButton.setBounds(REGISTER_BUTTON_X, REGISTER_BUTTON_Y, 
				REGISTER_BUTTON_WIDTH, REGISTER_BUTTON_HEIGHT);
		panel.add(registerButton);
	}

}