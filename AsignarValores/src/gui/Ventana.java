package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Ventana extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel miPanel;
	private JButton btnBorrar;
	JLabel lblCero,lblUno,lblDos,lblTres,lblCuatro,lblCinco,lblSeis,lblSiete,lblOcho,lblNueve;
	JTextArea txtResultado;
	String txt;
	
	

	
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		miPanel = new JPanel();
		miPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		lblCero = new JLabel("0");
		lblCero.setBounds(156, 61, 16, 16);
		lblCero.addMouseListener(this);
		miPanel.add(lblCero);
		
		lblUno = new JLabel("1");
		lblUno.setBounds(185, 61, 16, 16);
		lblUno.addMouseListener(this);
		miPanel.add(lblUno);
		
		lblDos = new JLabel("2");
		lblDos.setBounds(213, 61, 16, 16);
		lblDos.addMouseListener(this);
		miPanel.add(lblDos);
		
		lblTres = new JLabel("3");
		lblTres.setBounds(156, 89, 16, 16);
		lblTres.addMouseListener(this);
		miPanel.add(lblTres);
		
		lblCuatro = new JLabel("4");
		lblCuatro.setBounds(185, 89, 16, 16);
		lblCuatro.addMouseListener(this);
		miPanel.add(lblCuatro);
		
		lblCinco = new JLabel("5");
		lblCinco.setBounds(213, 89, 16, 16);
		lblCinco.addMouseListener(this);
		miPanel.add(lblCinco);
		
		lblSeis = new JLabel("6");
		lblSeis.setBounds(156, 113, 16, 16);
		lblSeis.addMouseListener(this);
		miPanel.add(lblSeis);
		
		lblSiete = new JLabel("7");
		lblSiete.setBounds(185, 113, 16, 16);
		lblSiete.addMouseListener(this);
		miPanel.add(lblSiete);
		
		lblOcho = new JLabel("8");
		lblOcho.setBounds(213, 113, 16, 16);
		lblOcho.addMouseListener(this);
		miPanel.add(lblOcho);
		
		lblNueve = new JLabel("9");
		lblNueve.setBounds(185, 131, 16, 16);
		lblNueve.addMouseListener(this);
		miPanel.add(lblNueve);
		
		txtResultado = new JTextArea();
		txtResultado.setBounds(46, 159, 360, 95);
		miPanel.add(txtResultado);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(289, 76, 117, 29);
		btnBorrar.addMouseListener(this);
		miPanel.add(btnBorrar);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()== btnBorrar) {
			
			txtResultado.setText("");
		}
		
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
		if(e.getSource()==lblCero) {
			txt = lblCero.getText();
			txtResultado.setText(txtResultado.getText()+txt);

			
		}else if(e.getSource()==lblUno) {
			txt = lblUno.getText();
			txtResultado.setText(txtResultado.getText()+txt);
			
		}else if(e.getSource()==lblDos) {
			txt = lblDos.getText();
			txtResultado.setText(txtResultado.getText()+txt);

		}else if(e.getSource()==lblTres) {
			txt = lblTres.getText();
			txtResultado.setText(txtResultado.getText()+txt);

		}else if(e.getSource()==lblCuatro) {
			txt = lblCuatro.getText();
			txtResultado.setText(txtResultado.getText()+txt);

		}else if(e.getSource()==lblCinco) {
			txt = lblCinco.getText();
			txtResultado.setText(txtResultado.getText()+txt);

		}else if(e.getSource()==lblSeis) {
			txt = lblSeis.getText();
			txtResultado.setText(txtResultado.getText()+txt);

		}else if(e.getSource()==lblSiete) {
			txt = lblSiete.getText();
			txtResultado.setText(txtResultado.getText()+txt);

		}else if(e.getSource()==lblOcho) {
			txt = lblOcho.getText();
			txtResultado.setText(txtResultado.getText()+txt);
		}else if(e.getSource()==lblNueve) {
			txt = lblNueve.getText();
			txtResultado.setText(txtResultado.getText()+txt);

		}
		
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}