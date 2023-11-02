package gui;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Ventana extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiPal1;
	private JLabel etiPal2;
	private JLabel etiPal3;
	private JLabel etiPal4;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel("New label");
		etiPal1.setBounds(54, 68, 100, 23);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("New label");
		etiPal2.setBounds(54, 119, 100, 23);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("New label");
		etiPal3.setBounds(54, 171, 100, 23);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("New label");
		etiPal4.setBounds(54, 224, 100, 23);
		contentPane.add(etiPal4);
		
		JLabel etiOcultar = new JLabel("Ocultar");
		etiOcultar.setBounds(54, 291, 100, 23);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
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
		etiPal1.setVisible(false);
		etiPal2.setVisible(false);
		etiPal3.setVisible(false);
		etiPal4.setVisible(false);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		etiPal1.setVisible(true);
		etiPal2.setVisible(true);
		etiPal3.setVisible(true);
		etiPal4.setVisible(true);
	}
	
	
}
