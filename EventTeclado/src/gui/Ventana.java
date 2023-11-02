package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Ventana extends JFrame implements ActionListener, KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textTexto;
	private JButton btnVaciar;
	private JLabel lblTexto;
	String tomarText;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textTexto = new JTextField();
		textTexto.setFont(new Font("Arial", Font.PLAIN, 11));
		textTexto.setBounds(123, 39, 262, 26);
		textTexto.addKeyListener(this);
		contentPane.add(textTexto);
		textTexto.setColumns(10);
		
		lblTexto = new JLabel("");
		lblTexto.setFont(new Font("Arial", Font.PLAIN, 11));
		lblTexto.setBounds(123, 92, 262, 136);
		contentPane.add(lblTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Arial", Font.PLAIN, 11));
		btnVaciar.setBounds(209, 250, 89, 23);
		btnVaciar.addActionListener(this);
		contentPane.add(btnVaciar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnVaciar) {
			textTexto.setText("");
			lblTexto.setText("");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		tomarText = textTexto.getText();
		lblTexto.setText(tomarText);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
