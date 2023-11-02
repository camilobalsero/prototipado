package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame implements MouseListener,  ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField etiNombre;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiNombre = new JTextField();
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBackground(Color.BLUE);
		etiNombre.setText("Camilo");
		etiNombre.setBounds(218, 24, 58, 23);
		contentPane.add(etiNombre);
		etiNombre.setColumns(10);
		
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(22, 376, 89, 23);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(143, 376, 89, 23);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(274, 376, 89, 23);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(393, 376, 89, 23);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		contentPane.add(btnAchicar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnEsquina) {
			etiNombre.setLocation(0, 0);
		}else if(e.getSource() == btnCentro) {
			etiNombre.setLocation(235, 170);
		}else if(e.getSource() == btnAgrandar) {
			etiNombre.setSize(150, 150);
		}else if(e.getSource() == btnAchicar) {
			etiNombre.setSize(20, 20);
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == btnEsquina) {
			btnEsquina.setSize(92, 29);
		}else if (e.getSource() == btnCentro) {
			btnCentro.setSize(92, 29);
		} else if(e.getSource() == btnAgrandar){
			btnAgrandar.setSize(92, 29);
		} else if(e.getSource() == btnAchicar){
			btnAchicar.setSize(92, 29);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(89, 23);
		}else if(e.getSource() == btnCentro){
			btnCentro.setSize(89, 23);
		}else if(e.getSource() == btnAgrandar){
			btnAgrandar.setSize(89, 23);
		}else if(e.getSource() == btnAchicar){
			btnAchicar.setSize(89, 23);
		}
		
		
	}

}
