package funciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Vistas.Envio;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JLabel lblNewLabel;
	private JTextField textNota1;
	private JLabel lblNewLabel_1;
	private JTextField textNota2;
	private JLabel lblNewLabel_2;
	private JTextField textNota3;
	private JButton btnNewButton;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel txtNombre;
	private JLabel txtNota1;
	private JLabel txtNota2;
	private JLabel txtNota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
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
	public VentanaCalculaMedia() {
		setTitle("Calcular media MF0227");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow]", "[][][][][][]"));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 1 0,alignx trailing");
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(textNombre, "cell 2 0,growx");
		textNombre.setColumns(10);
		
		lblNewLabel = new JLabel("UF2404");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 1 1,alignx trailing");
		
		textNota1 = new JTextField();
		contentPane.add(textNota1, "flowx,cell 2 1,alignx left");
		textNota1.setColumns(10);
		
		lblNewLabel_1 = new JLabel("UF2405");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 2 1");
		
		textNota2 = new JTextField();
		contentPane.add(textNota2, "cell 2 1");
		textNota2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("UF2406");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "cell 2 1");
		
		textNota3 = new JTextField();
		contentPane.add(textNota3, "cell 2 1");
		textNota3.setColumns(10);
		
		btnNewButton = new JButton("Calcular nota");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, "cell 2 3,alignx center");
		
		lblNewLabel_3 = new JLabel("Nota Media:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "cell 1 4,aligny baseline");
		
		lblNewLabel_4 = new JLabel("0.0");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4, "cell 2 4");
		
		lblNewLabel_5 = new JLabel("Resultado:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_5, "cell 1 5");
		
		lblNewLabel_6 = new JLabel("No calculado aún");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_6, "cell 2 5");
		
		
		
		
		String nombre=txtNombre.getText();
		double nota1= txtNota1.getText();
		double nota2=txtNota2.getText();
		double nota3=txtNota3.getText();
		
		
		
		
	}

}
