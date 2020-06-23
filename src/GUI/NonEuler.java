package GUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import Services.AlgoEuler;
import Services.Edge;
import Services.Graph;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTextArea;

public class NonEuler extends JPanel {

	/**
	 * Create the panel.
	 */
	public NonEuler() {
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 672, 460);

		
		DrawingNonEuler drawingNonEuler = new DrawingNonEuler();

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
		tabbedPane.addTab("Ville ", null, panel_2, null);
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

		JLabel lblNewLabel_1 = new JLabel("Nous considérons le point 0 comme étant le local de la poste");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(29, 30, 330, 21);
		panel_4.add(lblNewLabel_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(28, 56, 241, 9);
		panel_4.add(separator);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(411, 65, 255, 359);
		panel_2.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Voici le chemin travers\u00E9 par le postier\r\n");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(6, 16, 243, 16);
		panel_6.add(lblNewLabel_3);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 33, 243, 2);
		panel_6.add(separator_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 44, 243, 158);
		panel_6.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
	
		JButton btnNewButton = new JButton("Simuler");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edge[] edges = {
						new Edge(0 , 2 , 1),
						new Edge(0 , 3 , 4),
						new Edge(0 , 4 , 2),
						new Edge(0 , 1 , 3),
						new Edge(1 , 3 , 2),
						new Edge(1 , 4 , 3),
						new Edge(1 , 5 , 1),
						new Edge(2 , 4 , 1),
						new Edge(3 , 5 , 4),
						new Edge(4 , 5 , 2),
						new Edge(4 , 6 , 7),
						new Edge(4 , 7 , 2),
						new Edge(5 , 6 , 4),
						new Edge(6 , 7 , 5)		
				} ;
				
			Graph g = new Graph(edges);
			g.calculateShortestDistance();
			
			
			textArea.setText(g.printResult()); 
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(506, 26, 90, 28);
		panel_4.add(btnNewButton);

		panel_5.add(drawingNonEuler);

		

	}
}
