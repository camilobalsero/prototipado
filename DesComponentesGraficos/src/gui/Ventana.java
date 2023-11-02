package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCiudad;
	private JButton btnAceptar;
	private JButton btnActivar;
	private JButton btnDesactivar;
	String msj;
	private JLabel lblFrase;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Arial", Font.PLAIN, 11));
		textNombre.setBounds(173, 34, 143, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(93, 36, 70, 14);
		contentPane.add(lblNombre);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(173, 75, 143, 20);
		contentPane.add(textCiudad);
		textCiudad.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ciudad:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(100, 77, 57, 14);
		contentPane.add(lblNewLabel);
		
		lblFrase = new JLabel("");
		lblFrase.setBounds(124, 182, 243, 111);
		contentPane.add(lblFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(198, 138, 89, 23);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setBounds(100, 315, 105, 23);
		btnActivar.addActionListener(this);
		contentPane.add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(293, 315, 105, 23);
		btnDesactivar.addActionListener(this);
		contentPane.add(btnDesactivar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			msj = "Usted se llama " + textNombre.getText() + " y vive en " + textCiudad.getText();
			lblFrase.setText(msj);
		} else if(e.getSource() == btnActivar){
			textNombre.setEnabled(true);
			textCiudad.setEnabled(true);
		}else if(e.getSource() == btnDesactivar) {
			textNombre.setEnabled(false);
			textCiudad.setEnabled(false);
		}
		
	}

}
