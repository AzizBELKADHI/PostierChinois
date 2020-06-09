package service;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class drawingComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		Rectangle rect = new Rectangle(5,5,500,350);
		g2.draw(rect);
	}
}
