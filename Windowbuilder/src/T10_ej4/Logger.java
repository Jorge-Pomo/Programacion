package T10_ej4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JDesktopPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Logger extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logger frame = new Logger();
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
	public Logger() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				JOptionPane cerrarVentana = new JOptionPane();
				int opc = cerrarVentana.showConfirmDialog(null, "�Quieres cerrar la entana?", "Cerrar ventana",
						JOptionPane.YES_NO_CANCEL_OPTION);

				if (opc == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblUser = new JLabel("user:");

		JLabel lblPassword = new JLabel("password:");

		txtUser = new JTextField();
		txtUser.setColumns(10);

		passwordField = new JPasswordField();

		String contra = "admin";
		char[] correctPasswrd = contra.toCharArray();
		passwordField.setEchoChar('*');

		// Boton Login
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Conectar a BBDD
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					//Creamos conexion a una BBDD mysql, que esta en localhost, su nombre es 'b_login', usuario 'root' y contrase�a ""
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/b_login", "root", "");

					//Creamos la variable 'Statment' para diriguir las consultas a la bbdd con la que nos hemos conectado
					//Con 's.executeQuery' hacemos la consulta JQuery
					Statement s = conexion.createStatement();
					ResultSet rs = s.executeQuery("select * from log where usuario='"+txtUser.getText()+"' AND Contrase�a='"+passwordField.getPassword()+"';");
				
					//Si la consulta funciona, el valor del campo 'txtUser', se cambiara a 'SI'
					txtUser.setText("SI");
					
					rs.getArray("usuario");
					
					//Cerramos la 
					conexion.close();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				
				
				// if(txtUser.getText().equals("admin") &&
				// Arrays.equals(passwordField.getPassword(), correctPasswrd)) {
				// Ok ventana = new Ok();
				//
				// ventana.setVisible(true);
				// }else {
				// error ventanaE = new error();
				//
				// ventanaE.setVisible(true);
				// }

			}
		});

		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				passwordField.setEchoChar((char) 0);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				passwordField.setEchoChar('*');
			}
		});
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"pepe", "martinez", "30"},
				{"pepe", "martinez", "30"},
			},
			new String[] {
				"Nombre", "Apellidos", "Edad"
			}
		));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblPassword)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField, 130, 130, 130)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnMostrar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblUser)
							.addGap(39)
							.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(135, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(57)
					.addComponent(btnLogin)
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addGap(38))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUser)
						.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMostrar))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(51)
							.addComponent(btnLogin))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
