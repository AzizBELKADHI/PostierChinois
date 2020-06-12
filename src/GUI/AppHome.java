package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.Window.Type;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;

public class AppHome extends JFrame {
	private static final long serialVersionUID = -2914512782319038258L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 * @throws UnsupportedLookAndFeelException
	 */
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppHome frame = new AppHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppHome() {

		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(0, 0, 232, 460);

		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 232, 84);

		ImageIcon im = new ImageIcon(
				new ImageIcon("img\\Logo.png").getImage().getScaledInstance(232, 84, Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(im);
		panel.add(lblNewLabel);

		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(231, 0, 672, 460);

		DrawingEuler drawingEuler = new DrawingEuler();

		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 672, 460);
		panel_1.add(scrollPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane.setViewportView(tabbedPane);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Ville eulerienne", null, panel_2, null);
		panel_2.setLayout(new CardLayout(0, 0));
		panel_2.add(drawingEuler);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Ville non eulerienne", null, panel_3, null);

	}
}
