package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import op.Operaciones;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel miPanel;
	JTextField txtNota1;
	JTextField txtNota2;
	JTextField txtNota3;
	JLabel lblResultadoR,lblNotaFinalR;
	JButton btnCalcular;
	Operaciones miOperacion;

	
	public Ventana() {
		miOperacion = new Operaciones();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		miPanel = new JPanel();
		miPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(21, 27, 93, 26);
		miPanel.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(163, 27, 101, 26);
		miPanel.add(txtNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(305, 27, 96, 26);
		miPanel.add(txtNota3);
		
		JLabel lblNota1 = new JLabel("Nota1");
		lblNota1.setBounds(51, 6, 61, 16);
		miPanel.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota2");
		lblNota2.setBounds(202, 6, 61, 16);
		miPanel.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota3");
		lblNota3.setBounds(340, 6, 61, 16);
		miPanel.add(lblNota3);
		
		JLabel lblNotaFinal = new JLabel("NotaFinal");
		lblNotaFinal.setBounds(187, 114, 61, 16);
		miPanel.add(lblNotaFinal);
		
		lblNotaFinalR = new JLabel("");
		lblNotaFinalR.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotaFinalR.setBounds(21, 140, 414, 16);
		miPanel.add(lblNotaFinalR);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(187, 168, 93, 16);
		miPanel.add(lblResultado);
		
		lblResultadoR = new JLabel("");
		lblResultadoR.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoR.setBounds(6, 196, 414, 16);
		miPanel.add(lblResultadoR);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(147, 224, 117, 29);
		btnCalcular.addActionListener(this);
		miPanel.add(btnCalcular);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==btnCalcular) {
				double nota1,nota2,nota3;
				
				nota1 = Double.parseDouble(txtNota1.getText());
				nota2 = Double.parseDouble(txtNota2.getText());
				nota3 = Double.parseDouble(txtNota3.getText());
				
				double resultado = miOperacion.calcularPromedio(nota1,nota2,nota3);
				lblNotaFinalR.setText(resultado+"");
				if(resultado<5) {
					lblResultadoR.setText("SUSPENSO");
					lblResultadoR.setForeground(Color.red);
					lblNotaFinalR.setForeground(Color.red);
				}else if(resultado>=5) {
					lblResultadoR.setText("APROBADO");
					lblResultadoR.setForeground(Color.black);
					lblNotaFinalR.setForeground(Color.black);
				}
			}
			
		} catch (Exception e2) {
			lblResultadoR.setText("Ingrese por favor todos los datos");
			lblResultadoR.setForeground(Color.red);
		}
	}
}
