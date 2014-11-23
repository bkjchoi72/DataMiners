/*
 * Team: DataMiners
 * Authors: Brian Choi
 * Date: 11/22/14
 * File: CustomFond.java
 * Description: create objects from this class to use custom fonts for JPanels. Refer to the website
 * 				below to get the list of URLs for fonts
 * 
 * 				http://www.webpagepublicity.com/free-fonts.html
 */

package GUI;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.net.URL;

public class CustomFont {
	
	// URL address of the font
	private URL url;
	private Font font;
	GraphicsEnvironment ge;
	
	// default constructor sets the font to "RESPUBLICA"
	public CustomFont() throws Exception {
		url = new URL("http://www.webpagepublicity.com/free-fonts/r/ResPublica.ttf");
		font = Font.createFont(Font.TRUETYPE_FONT, url.openStream());
		font = font.deriveFont(Font.PLAIN, 20);
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(font);
	}
	
	// constructor with argumented URL	
	public CustomFont(String url) throws Exception {
		this.url = new URL(url);
		font = Font.createFont(Font.TRUETYPE_FONT, this.url.openStream());
		font = font.deriveFont(Font.PLAIN, 20);
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(font);
	}
	
	// getter for font
	public Font getFont() {
		return font;
	}

}
