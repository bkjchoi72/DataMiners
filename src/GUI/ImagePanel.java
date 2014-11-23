/*
 * Team: DataMiners
 * Authors: Brian Choi
 * Date: 11/22/14
 * File: ImagePanel.java
 * Description: used to set the background of a Jpanel 
 */

package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	
	private Image image;
	
	// constructor with the Image object
	public ImagePanel(Image img) {
		image = img;
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setSize(size);
		setLayout(null);
	}
	
	// constructor with the path to the image argument as string
	public ImagePanel(String path) {
		this(new ImageIcon(path).getImage());
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}

}
