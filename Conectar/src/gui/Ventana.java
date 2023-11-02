package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel miPanel;
	JTextField txtTexto1;
	JTextField txtTexto2;
	JButton btnConcatenar;
	JLabel lblTextoFinal;
	
	

	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		miPanel = new JPanel();
		miPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		txtTexto1 = new JTextField();
		txtTexto1.setBounds(66, 36, 117, 26);
		miPanel.add(txtTexto1);
		txtTexto1.setColumns(10);
		
		txtTexto2 = new JTextField();
		txtTexto2.setColumns(10);
		txtTexto2.setBounds(263, 36, 117, 26);
		miPanel.add(txtTexto2);
		
		JLabel lblTexto1 = new JLabel("Texto 1");
		lblTexto1.setBounds(96, 10, 61, 16);
		miPanel.add(lblTexto1);
		
		JLabel lblTexto2 = new JLabel("Texto 2");
		lblTexto2.setBounds(301, 10, 61, 16);
		miPanel.add(lblTexto2);
		
		btnConcatenar = new JButton("Concatenar");
		btnConcatenar.setBounds(169, 81, 117, 29);
		btnConcatenar.addActionListener(this);
		miPanel.add(btnConcatenar);
		
		JLabel lblTitulo = new JLabel("Texto final");
		lblTitulo.setBounds(201, 120, 61, 16);
		miPanel.add(lblTitulo);
		
		lblTextoFinal = new JLabel("");
		lblTextoFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoFinal.setBounds(27, 172, 403, 81);
		miPanel.add(lblTextoFinal);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConcatenar) {
			String texto1,texto2;
			texto1 = txtTexto1.getText();
			texto2 = txtTexto2.getText();
			
			lblTextoFinal.setText(texto1+texto2);
			
		}
		
	}

}

