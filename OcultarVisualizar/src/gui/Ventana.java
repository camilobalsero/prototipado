package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textCiudad;
	private JButton btnOcultarNombre;
	private JButton btnVisualizarNombre;
	private JButton btnOcultarCiudad;
	private JButton btnVisualizarCiudad;


	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNombre.setBounds(80, 67, 59, 14);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(149, 65, 176, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCiudad.setBounds(80, 110, 53, 14);
		contentPane.add(lblCiudad);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(149, 108, 176, 20);
		contentPane.add(textCiudad);
		textCiudad.setColumns(10);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(55, 151, 141, 23);
		contentPane.add(btnOcultarNombre);
		btnOcultarNombre.addActionListener(this);
		
		btnVisualizarNombre = new JButton("Visualizar Nombre");
		btnVisualizarNombre.setBounds(55, 204, 141, 23);
		contentPane.add(btnVisualizarNombre);
		btnVisualizarNombre.addActionListener(this);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(281, 151, 130, 23);
		contentPane.add(btnOcultarCiudad);
		btnOcultarCiudad.addActionListener(this);
		
		btnVisualizarCiudad = new JButton("VisualizarCiudad");
		btnVisualizarCiudad.setBounds(281, 204, 130, 23);
		contentPane.add(btnVisualizarCiudad);
		btnVisualizarCiudad.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOcultarNombre) {
			textNombre.setVisible(false);
		}else if(e.getSource() == btnVisualizarNombre) {
			textNombre.setVisible(true);
		}else if(e.getSource() == btnOcultarCiudad) {
			textCiudad.setVisible(false);
		}else if(e.getSource() == btnVisualizarCiudad) {
			textCiudad.setVisible(true);
		}
		
	}
}
