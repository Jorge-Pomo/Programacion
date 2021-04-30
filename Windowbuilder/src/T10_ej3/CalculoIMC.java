package T10_ej3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculoIMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtMasa;
	private JTextField txtEstatura;
	private JLabel lblResu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculoIMC frame = new CalculoIMC();
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
	public CalculoIMC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblMasa = new JLabel("Masa (kg)");
		
		txtMasa = new JTextField();
		txtMasa.setColumns(10);
		
		JLabel lblestatura = new JLabel("Estatura (cm)");
		
		txtEstatura = new JTextField();
		txtEstatura.setColumns(10);
		
		lblResu = new JLabel();
		JButton btnIMC = new JButton("IMC");
		btnIMC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double kg = Double.parseDouble(txtMasa.getText());
				double cm = Double.parseDouble(txtEstatura.getText());
				
				double m = cm / 100;
				
				//Calculo del IMC
				double imc = kg/Math.pow(m, 2);
				
				String comentario = "";
				if(imc < 18.5) {
					comentario = " Peso isuficiente";
				}else {
					if(imc >= 18.5 && imc < 24.9) {
						comentario = " Peso normal";
					}else {
						if(imc >= 24.9 && imc < 26.9) {
							comentario = " Sobrepeso grado I";
						}else {
							if(imc >= 26.9 && imc < 29.9) {
								comentario = "Sobrepeso grado II";
							}else {
								comentario = "Obesidad";
							}
						}
					}
				}
				
				lblResu.setText("IMC calculado = " + imc + comentario);
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblResu, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMasa)
						.addComponent(lblestatura)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtEstatura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(66)
							.addComponent(btnIMC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtMasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblMasa)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtMasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addComponent(lblestatura)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEstatura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnIMC, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(lblResu, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
