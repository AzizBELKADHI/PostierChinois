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
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

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

		Euler euler = new Euler();
		euler.setBounds(0, 99, 175, -99);
		NonEuler nonEuler = new NonEuler();
		
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(0, 0, 232, 460);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(231, 0, 672, 462);
		panel_1.add(euler);
		panel_1.add(nonEuler);
		contentPane.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		euler.setVisible(true);
		nonEuler.setVisible(false);
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 232, 84);

		ImageIcon im = new ImageIcon(
				new ImageIcon("img\\Logo.png").getImage().getScaledInstance(232, 84, Image.SCALE_SMOOTH));
		lblNewLabel.setIcon(im);
		panel.add(lblNewLabel);

		contentPane.add(panel);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 153, 153));
		panel_7.setBounds(0, 173, 232, 47);
		panel.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("          Ville eulerienne");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	
				euler.setVisible(true);
				nonEuler.setVisible(false);
			}
		});
		ImageIcon imEuler = new ImageIcon(
				new ImageIcon("img\\Euler.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));

		lblNewLabel_4.setIcon(imEuler);
		lblNewLabel_4.setBounds(16, 6, 210, 35);
		panel_7.add(lblNewLabel_4);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 153, 153));
		panel_8.setBounds(0, 224, 232, 47);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("     Ville non eulerienne");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				euler.setVisible(false);
				nonEuler.setVisible(true);
			}
		});
		ImageIcon imNonEuler = new ImageIcon(
				new ImageIcon("img\\NonEuler.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
		lblNewLabel_5.setIcon(imNonEuler);
		lblNewLabel_5.setBounds(0, 6, 226, 35);
		panel_8.add(lblNewLabel_5);
		
		

		

	}
}
