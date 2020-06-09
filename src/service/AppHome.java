package service;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AppHome extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();   
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 913, 491);
		
		frame.setVisible(true);
		drawingComponent drawingComponent = new drawingComponent();
		frame.add(drawingComponent);
		
	}

}
