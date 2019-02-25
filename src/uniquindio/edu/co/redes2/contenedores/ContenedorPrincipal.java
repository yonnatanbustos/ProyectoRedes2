package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import uniquindio.edu.co.redes2.gui.ChatUI;

import java.awt.Color;

public class ContenedorPrincipal extends JPanel {
	
	private static final String RUTA_ICONO_USUARIO = "uniquindio/edu/co/redes2/resources/iconos/icon-usuario.png";
	
	private static final String RUTA_ICONO_AMIGOS = "uniquindio/edu/co/redes2/resources/iconos/icon-amigos.png";

	private JLabel lblAmigos, lblUsuario;
	
	private JPanel panel;
	
	private ChatUI chatUI;

	/**
	 * Create the panel.
	 */
	public ContenedorPrincipal(ChatUI chatUI) {
		this.chatUI = chatUI;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		setBackground(Color.WHITE);
		
		lblUsuario = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblUsuario, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblUsuario, 10, SpringLayout.WEST, this);
		add(lblUsuario);
		
		lblAmigos = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblAmigos, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblAmigos, -10, SpringLayout.EAST, this);
		lblUsuario.addMouseListener(new MouseListener() {
			
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
				chatUI.cargarContenedorPerfil();
				System.out.println("Contenedor cargado de perfil");
			}
		});
		add(lblAmigos);
		
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 60, SpringLayout.NORTH, lblUsuario);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, -10, SpringLayout.EAST, this);
		add(panel);
		
		
		cargarIconos();

	}
	
	
	
	private void cargarIconos(){
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_ICONO_USUARIO);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblUsuario.setIcon(imageIcon);
		
		url = cl.getResource(RUTA_ICONO_AMIGOS);
		imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblAmigos.setIcon(imageIcon);
	}

}
