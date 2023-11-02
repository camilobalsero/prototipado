package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JButton btnTraspasa1;
	private JButton btnTraspasa2;
	private JLabel etiTexto1;
	private String tomarTxt;
	private JLabel etiTexto2;


	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(102, 63, 294, 41);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel lblTitle = new JLabel("Escribe Aqui");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 13));
		lblTitle.setBounds(196, 38, 92, 14);
		contentPane.add(lblTitle);
		
		JLabel lbltext1 = new JLabel("Campo Texto 1");
		lbltext1.setFont(new Font("Arial", Font.PLAIN, 11));
		lbltext1.setHorizontalAlignment(SwingConstants.CENTER);
		lbltext1.setBounds(83, 172, 83, 14);
		contentPane.add(lbltext1);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setVerticalAlignment(SwingConstants.TOP);
		etiTexto1.setFont(new Font("Arial", Font.PLAIN, 10));
		etiTexto1.setHorizontalAlignment(SwingConstants.LEFT);
		etiTexto1.setBounds(22, 197, 158, 121);
		contentPane.add(etiTexto1);
		
		btnTraspasa1 = new JButton("Traspasar a Campo 1");
		btnTraspasa1.setBounds(39, 126, 163, 23);
		contentPane.add(btnTraspasa1);
		btnTraspasa1.addActionListener(this);
		
		JLabel lbltext2 = new JLabel("Campo Texto 2");
		lbltext2.setFont(new Font("Arial", Font.PLAIN, 11));
		lbltext2.setBounds(331, 172, 83, 14);
		contentPane.add(lbltext2);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setFont(new Font("Arial", Font.PLAIN, 10));
		etiTexto2.setVerticalAlignment(SwingConstants.TOP);
		etiTexto2.setHorizontalAlignment(SwingConstants.LEFT);
		etiTexto2.setBounds(313, 199, 158, 134);
		contentPane.add(etiTexto2);
		
		btnTraspasa2 = new JButton("Traspasar a Campo 2");
		btnTraspasa2.setBounds(287, 126, 163, 23);
		contentPane.add(btnTraspasa2);
		btnTraspasa2.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnTraspasa1) {
			tomarTxt = txtTexto.getText();
			etiTexto1.setText(tomarTxt);
		} else if (e.getSource()== btnTraspasa2){
			tomarTxt = txtTexto.getText();
			etiTexto2.setText(tomarTxt);
		}
		
	}

}
