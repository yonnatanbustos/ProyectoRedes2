package uniquindio.edu.co.redes2.contenedores;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Texfiel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String ruta;
	JLabel label;
	ImageIcon imageIcon;
	JERoundTextField field;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Texfiel(String ruta, ImageIcon imageIcon) {
		this.ruta=ruta;
		this.imageIcon = imageIcon;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		textField = new JTextField();
		field = new JERoundTextField();
		field.setBounds(10, 10, 100, 50);
		field.setImage(imageIcon.getImage());
		contentPane.add(field);
		textField.checkImage(imageIcon.getImage(), 20, 20, null);
		//contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		
	}
	
	
	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		
		
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawImage(imageIcon.getImage(), 5, 2, textField.getHeight()-3, textField.getWidth()-3, null);
		System.out.println(g2+" Grafico");
		super.paintComponents(g);
	}

}
