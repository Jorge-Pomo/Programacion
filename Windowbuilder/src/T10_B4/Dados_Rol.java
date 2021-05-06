package T10_B4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dados_Rol extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dados_Rol frame = new Dados_Rol();
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
	public Dados_Rol() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblResu = new JLabel("");
		lblResu.setHorizontalAlignment(SwingConstants.CENTER);
		lblResu.setFont(new Font("Tahoma", Font.PLAIN, 44));
		
		JButton btnSeis = new JButton("");
		btnSeis.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Prog\\programaci\u00F3\\Windowbuilder\\src\\T10_B4\\img\\6.jpg"));
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblResu.setText((int) (Math.random() * 7) + "");
			}
		});
		
		JButton btnOcho = new JButton("");
		btnOcho.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Prog\\programaci\u00F3\\Windowbuilder\\src\\T10_B4\\img\\8.jpg"));
		btnOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResu.setText((int) (Math.random() * 9) + "");
			}
		});
		
		JButton btnDiez = new JButton("");
		btnDiez.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Prog\\programaci\u00F3\\Windowbuilder\\src\\T10_B4\\img\\10.jpg"));
		btnDiez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResu.setText((int) (Math.random() * 11) + "");
			}
		});
		
		JButton btnDoze = new JButton("");
		btnDoze.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Prog\\programaci\u00F3\\Windowbuilder\\src\\T10_B4\\img\\12.jpg"));
		btnDoze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResu.setText((int) (Math.random() * 13) + "");
			}
		});
		
		JButton btnVeinte = new JButton("");
		btnVeinte.setIcon(new ImageIcon("C:\\Users\\DAM\\Desktop\\Prog\\programaci\u00F3\\Windowbuilder\\src\\T10_B4\\img\\20.jpg"));
		btnVeinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblResu.setText((int) (Math.random() * 21) + "");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnSeis, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(btnDoze, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addGap(37)
									.addComponent(btnVeinte, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnOcho, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
									.addGap(79))))
						.addComponent(lblResu, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnDiez, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addGap(30))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSeis, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDiez, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOcho, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDoze, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVeinte, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(lblResu, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
