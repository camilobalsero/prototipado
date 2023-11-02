package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTexto;
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnVerde;
	private JButton btnFondoAzul;
	private JButton btnFondoRojo;
	private JButton btnFondoVerde;
	private JButton btnOpaco;
	private JButton btnTransparente;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textTexto = new JTextField();
		textTexto.setBounds(167, 177, 179, 20);
		contentPane.add(textTexto);
		textTexto.setColumns(10);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(33, 112, 89, 23);
		btnAzul.addActionListener(this);
		contentPane.add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(210, 65, 89, 23);
		btnRojo.addActionListener(this);
		contentPane.add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(384, 112, 89, 23);
		btnVerde.addActionListener(this);
		contentPane.add(btnVerde);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setBounds(33, 208, 111, 23);
		btnFondoAzul.addActionListener(this);
		contentPane.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setBounds(210, 264, 111, 23);
		btnFondoRojo.addActionListener(this);
		contentPane.add(btnFondoRojo);
		
		btnFondoVerde = new JButton("Fondo Verde");
		btnFondoVerde.setBounds(384, 208, 113, 23);
		btnFondoVerde.addActionListener(this);
		contentPane.add(btnFondoVerde);
		
		btnOpaco = new JButton("Opaco");
		btnOpaco.setBounds(57, 306, 89, 23);
		btnOpaco.addActionListener(this);
		contentPane.add(btnOpaco);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(352, 306, 121, 23);
		btnTransparente.addActionListener(this);
		contentPane.add(btnTransparente);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource() == btnAzul) {
			 textTexto.setForeground(Color.BLUE);
		 }else if(e.getSource() == btnRojo) {
			 textTexto.setForeground(Color.RED);
		 }else if(e.getSource() == btnVerde) {
			 textTexto.setForeground(Color.GREEN);
		 }else if(e.getSource() == btnFondoAzul) {
			 textTexto.setBackground(Color.BLUE);
		 }else if(e.getSource() == btnFondoRojo) {
			 textTexto.setBackground(Color.RED);
		 }else if(e.getSource() == btnFondoVerde) {
			 textTexto.setBackground(Color.GREEN);
		 } 
		 
		 if(e.getSource() == btnOpaco) {
			 textTexto.setOpaque(true);
		 }else if(e.getSource() == btnTransparente) {
			 textTexto.setOpaque(false);
		 }
		
	}
}
