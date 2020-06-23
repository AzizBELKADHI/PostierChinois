package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import Services.AlgoEuler;

public class Euler extends JPanel {

	/**
	 * Create the panel.
	 */
	public Euler() {
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 672, 460);

		
		DrawingEulerB drawingEulerB = new DrawingEulerB();

		add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 672, 460);
		panel_1.add(scrollPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.GREEN);
		scrollPane.setViewportView(tabbedPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.control);
		tabbedPane.addTab("Première Ville ", null, panel_2, null);
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
		DrawingEuler drawingEuler = new DrawingEuler();
		JButton btnNewButton = new JButton("Simuler");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				AlgoEuler algoEuler = new AlgoEuler();
				List<String> li = algoEuler.cycleEuler(String.valueOf(comboBox.getSelectedItem()),
						drawingEuler.listAdj(), drawingEuler.nbArete(drawingEuler.listAdj()));
				for (int i = 0; i < li.size(); i++)
					s += li.get(i) + "->";
				String s2 = s.substring(0, s.length() - 2);
				lblNewLabel_2.setText(s2);
				System.out.println("Algo " + li);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(507, 8, 90, 28);
		panel_4.add(btnNewButton);

		panel_5.add(drawingEuler);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Deuxième Ville", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(204, 204, 255));
		panel_7.setBounds(0, 0, 666, 65);
		panel_3.add(panel_7);
		panel_7.setLayout(null);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		panel_8.setBounds(0, 65, 411, 359);
		panel_3.add(panel_8);
		panel_8.setLayout(new CardLayout());

		final String[] name2 = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M" };
		JComboBox comboBox2 = new JComboBox(name2);
		comboBox2.setBounds(313, 8, 63, 26);
		panel_7.add(comboBox2);

		JLabel lblNewLabel_4 = new JLabel("Veuillez s\u00E9lectionner le point de d\u00E9part");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_4.setBounds(50, 11, 251, 21);
		panel_7.add(lblNewLabel_4);

		JSeparator separator2 = new JSeparator();
		separator2.setBounds(50, 31, 241, 9);
		panel_7.add(separator2);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(411, 65, 255, 359);
		panel_3.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(6, 44, 243, 46);
		panel_9.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Voici le chemin travers\u00E9 par le postier\r\n");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_6.setBounds(6, 16, 243, 16);
		panel_9.add(lblNewLabel_6);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(6, 33, 243, 2);
		panel_9.add(separator_2);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(6, 101, 243, 46);
		panel_9.add(lblNewLabel);

		JButton btnNewButton2 = new JButton("Simuler");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				AlgoEuler algoEuler = new AlgoEuler();
				List<String> li = algoEuler.cycleEuler(String.valueOf(comboBox2.getSelectedItem()),
						drawingEulerB.listAdj(), drawingEulerB.nbArete(drawingEulerB.listAdj()));
				for (int i = 0; i < li.size()/2; i++)
					s += li.get(i) + "->";
				String s2 = s.substring(0, s.length());
				lblNewLabel_5.setText(s2);
				s="";
				for (int i = li.size()/2; i < li.size(); i++)
					s += li.get(i) + "->";
				s2 = s.substring(0, s.length()-2);
				lblNewLabel.setText(s2);
				System.out.println("Algo " + li);
			}
		});
		btnNewButton2.setForeground(new Color(255, 255, 255));
		btnNewButton2.setBackground(new Color(0, 100, 0));
		btnNewButton2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton2.setBounds(507, 8, 90, 28);
		panel_7.add(btnNewButton2);

		panel_8.add(drawingEulerB);

	}
}
