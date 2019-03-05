package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import uniquindio.edu.co.redes2.gui.ChatUI;
import uniquindio.edu.co.redes2.gui.IniciarSesionGUI;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;
import java.awt.TextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import uniquindio.edu.co.redes2.clases.*;

public class ContenedorIniciarSesion extends JPanel {
	private JTextField txtCorreoElectronico;
	private JTextField txtContrasena;
	private JButton btnIngresar;
	private JLabel lblRegistrar;
	private Color fondoBoton;
	private Color fondo, bordeTexto, colorTxt;
		
	
	/**
	 * Varaibles para guadar los diferente valores de la fuente en la pantalla.
	 * Fuente de titulo: nombre="Georgia"
	 * 					Tipo=Plain
	 * 					Tamano=72
	 * Fuente de texto: ombre="Georgia"
	 * 					Tipo=Plain
	 * 					Tamano=40
	 * Fuente de boton: ombre="Georgia"
	 * 					Tipo=Bold
	 * 					Tamano=48
	 */
	private Font fuenteTitulo, fuenteTexto, fuenteBoton;

	/**
	 * Create the panel.
	 */
	public ContenedorIniciarSesion(IniciarSesionGUI iniciarSesionGUI) {
		fondo = new Color(0, 136, 176,100);
		fondoBoton= new Color(146, 201, 124);
		bordeTexto = new Color(204, 204, 204, 100);
		colorTxt = new Color(153, 153, 153, 100);
		fuenteTitulo = new Font("Georgia", Font.PLAIN, 72);
		fuenteTexto = new Font("Georgia", Font.PLAIN, 40);
		fuenteBoton = new Font("Georgia", Font.BOLD, 48);
		this.setBackground(fondo);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		springLayout.putConstraint(SpringLayout.NORTH, separator, 185, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, separator, 30, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, separator, -30, SpringLayout.EAST, this);
		add(separator);
		
		txtCorreoElectronico = new JTextField("Ingresar correo electr\u00F3nico");
		txtCorreoElectronico.setForeground(colorTxt);
		springLayout.putConstraint(SpringLayout.EAST, txtCorreoElectronico, -105, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, txtCorreoElectronico, 280, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtCorreoElectronico, 105, SpringLayout.WEST, this);
		txtCorreoElectronico.setBorder(new LineBorder(bordeTexto));
		txtCorreoElectronico.setFont(fuenteTexto);
		txtCorreoElectronico.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtCorreoElectronico.getText().isEmpty()){
					txtCorreoElectronico.setForeground(colorTxt);
					txtCorreoElectronico.setText("Ingresar correo electr\u00F3nico");
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(txtCorreoElectronico.getText().equals("Ingresar correo electr\u00F3nico")){
					txtCorreoElectronico.setText("");
					txtCorreoElectronico.setForeground(Color.BLACK);
				}
				
			}
		});
		add(txtCorreoElectronico);
		txtCorreoElectronico.setColumns(10);
		
		JLabel lblCorreoElectronico = new JLabel("Correo  electr\u00F3nico");
		lblCorreoElectronico.setFont(fuenteTexto);
		springLayout.putConstraint(SpringLayout.NORTH, lblCorreoElectronico, 225, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblCorreoElectronico, 105, SpringLayout.WEST, this);
		add(lblCorreoElectronico);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(fuenteTexto);
		springLayout.putConstraint(SpringLayout.NORTH, lblContrasena, 390, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblContrasena, 105, SpringLayout.WEST, this);
		add(lblContrasena);
		
		txtContrasena = new JTextField( "Ingresar contrase\u00F1a");
		txtContrasena.setForeground(colorTxt);
		txtContrasena.setBackground(Color.WHITE);
		springLayout.putConstraint(SpringLayout.EAST, txtContrasena, -105, SpringLayout.EAST, this);
		txtContrasena.setBorder(null);
		txtContrasena.setFont(fuenteTexto);
		springLayout.putConstraint(SpringLayout.NORTH, txtContrasena, 445, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtContrasena, 105, SpringLayout.WEST, this);
		txtContrasena.setColumns(10);
		txtContrasena.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtContrasena.getText().isEmpty()){
					txtContrasena.setForeground(colorTxt);
					txtContrasena.setText( "Ingresar contrase\u00F1a");
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				if(txtContrasena.getText().equals( "Ingresar contrase\u00F1a")){
					txtContrasena.setText("");
					txtContrasena.setForeground(Color.BLACK);
				}
				
			}
		});
		add(txtContrasena);

		
		JLabel lblBienvenido = new JLabel("Bienvenido(a)");
		lblBienvenido.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBienvenido.setFont(fuenteTitulo);
		springLayout.putConstraint(SpringLayout.NORTH, lblBienvenido, 28, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblBienvenido, 290, SpringLayout.WEST, this);
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblBienvenido);
		
		
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ChatUI chatUI= new ChatUI();
				chatUI.setVisible(true);
			}
		});
		btnIngresar.setToolTipText("");
		btnIngresar.setForeground(Color.WHITE);
		btnIngresar.setFont(fuenteBoton);
		btnIngresar.setBackground(fondoBoton);
		btnIngresar.setOpaque(true);
		springLayout.putConstraint(SpringLayout.NORTH, btnIngresar, 550, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnIngresar, 335, SpringLayout.WEST, this);
		add(btnIngresar);
		
		JSeparator separator1 = new JSeparator();
		separator1.setBackground(Color.BLACK);
		springLayout.putConstraint(SpringLayout.SOUTH, separator1, -80, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, separator1, 30, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, separator1, -30, SpringLayout.EAST, this);
		add(separator1);
		
		JLabel lbljlabel = new JLabel("¿No tiene cuenta?");
		lbljlabel.setFont(new Font("Georgia", Font.PLAIN, 20));
		springLayout.putConstraint(SpringLayout.SOUTH, lbljlabel, -30, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lbljlabel, 335, SpringLayout.WEST, this);
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		add(lbljlabel);
		
		lblRegistrar = new JLabel("Registrese aqui");
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		springLayout.putConstraint(SpringLayout.SOUTH, lblRegistrar, -30, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblRegistrar, 5, SpringLayout.EAST, lbljlabel);
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		//Esta parte del codigo permite agregar una linea debajo de la etiquete, con una apariencia de link.
		Font font = lblRegistrar.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblRegistrar.setFont(font.deriveFont(attributes));
		lblRegistrar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
					
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//iniciarSesionGUI.getContenedorRegistro().setVisible(true);
				iniciarSesionGUI.cargarContenedorRegistro();


			}
		});
		add(lblRegistrar);

	}
}
