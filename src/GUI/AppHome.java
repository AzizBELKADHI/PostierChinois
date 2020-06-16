package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import Services.AlgoEuler;

import java.awt.Window.Type;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
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
		tabbedPane.setBackground(Color.GREEN);
		scrollPane.setViewportView(tabbedPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		tabbedPane.addTab("Ville eulerienne", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 204, 255));
		panel_4.setBounds(0, 0, 666, 65);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.control);
		panel_5.setBounds(0, 65, 411, 359);
		panel_2.add(panel_5);
		panel_5.setLayout(new CardLayout());
		
		
		final String[] name = { "A", "B", "C", "D", "E", "F" };
		JComboBox comboBox = new JComboBox(name);
		comboBox.setBounds(313, 8, 63, 26);
		panel_4.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Veuillez s\u00E9lectionner le point de d\u00E9part");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(50, 11, 251, 21);
		panel_4.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 31, 241, 9);
		panel_4.add(separator);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(411, 65, 255, 359);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(6, 44, 243, 46);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Voici le chemin travers\u00E9 par le postier\r\n");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(6, 16, 243, 16);
		panel_6.add(lblNewLabel_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 33, 243, 2);
		panel_6.add(separator_1);
		
		JButton btnNewButton = new JButton("Simuler");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s ="";
				AlgoEuler algoEuler = new AlgoEuler();
				List<String> li = algoEuler.cycleEuler(String.valueOf(comboBox.getSelectedItem()), drawingEuler.listAdj());
				for(int i =0;i<li.size();i++)
					s+=li.get(i)+"->";
					String s2 =s.substring(0, s.length() - 2);
					lblNewLabel_2.setText(s2);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(507, 8, 90, 28);
		panel_4.add(btnNewButton);
		
		
	
		panel_5.add(drawingEuler);

	
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Ville non eulerienne", null, panel_3, null);
		panel_3.setLayout(new CardLayout(0, 0));
		
		DrawingNonEuler drawingNonEuler = new DrawingNonEuler();
		panel_3.add(drawingNonEuler);

		

	}
}
