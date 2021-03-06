package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import uniquindio.edu.co.redes2.clases.CircleBorder;
import uniquindio.edu.co.redes2.gui.ChatUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.UIManager;

public class ContenedorPerfil extends JPanel {

	private static final Color COLOR_FONDO_OPCIONES = new Color(153, 153, 153, 100);

	private static final Color COLOR_FONDO_TITULO = new Color(0, 136, 176, 61);

	private static final String RUTA_ICONO_VOLVER = "uniquindio/edu/co/redes2/resources/iconos/icon-atras.png";

	private static final String RUTA_FOTO_DEFECTO = "uniquindio/edu/co/redes2/resources/iconos/icon-usuario.png";
	
	private static final String RUTA_FOTO_DEFECTO1 = "uniquindio/edu/co/redes2/resources/iconos/falcao.jpg";


	private JLabel lblFoto;

	private JLabel lblNombreUsuario;

	private JLabel lblCerrarSesion, lblAgregarContactoNuevo, lblTitulo, lblIcono;

	private LineBorder border = new LineBorder(new Color(0, 0, 0));
	
	private CircleBorder circleBorder = new CircleBorder(Color.BLACK, 1);
	
	private ChatUI chatUI;

	/**
	 * Create the panel.
	 */
	public ContenedorPerfil(ChatUI chatUI) {
		this.chatUI = chatUI;
		setBackground(Color.WHITE);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		

		lblTitulo = new JLabel("Perfil");
		springLayout.putConstraint(SpringLayout.NORTH, lblTitulo, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblTitulo, 0, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTitulo, 110, SpringLayout.NORTH, this);
		lblTitulo.setFont(new Font("Georgia", Font.PLAIN, 72));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBackground(COLOR_FONDO_TITULO);
		lblTitulo.setOpaque(true);
		add(lblTitulo);

		lblFoto = new JLabel();
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblFoto, 0, SpringLayout.SOUTH, lblTitulo);
		springLayout.putConstraint(SpringLayout.WEST, lblFoto, 115, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFoto, -420, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblFoto, -115, SpringLayout.EAST, this);
		lblFoto.setBorder(circleBorder);
		add(lblFoto);
		
		lblNombreUsuario = new JLabel("   Nombre del usuario");
		springLayout.putConstraint(SpringLayout.NORTH, lblNombreUsuario, 6, SpringLayout.SOUTH, lblFoto);
		springLayout.putConstraint(SpringLayout.WEST, lblNombreUsuario, -1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNombreUsuario, 116, SpringLayout.SOUTH, lblFoto);
		springLayout.putConstraint(SpringLayout.EAST, lblNombreUsuario, 1, SpringLayout.EAST, this);
		lblNombreUsuario.setFont(new Font("Georgia", Font.PLAIN, 40));
		lblNombreUsuario.setBorder(border);
		lblNombreUsuario.setBackground(COLOR_FONDO_OPCIONES);
		lblNombreUsuario.setOpaque(true);
		add(lblNombreUsuario);
		
		JLabel lblNewLabel = new JLabel("   T\u00FA nombre");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, lblNombreUsuario);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 30, SpringLayout.NORTH, lblNombreUsuario);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.EAST, this);
		lblNewLabel.setFont(new Font("Georgia", Font.PLAIN, 20));
		add(lblNewLabel);
		
		
		
		lblAgregarContactoNuevo = new JLabel("   Agregar contacto nuevo");
		springLayout.putConstraint(SpringLayout.NORTH, lblAgregarContactoNuevo, 6, SpringLayout.SOUTH, lblNombreUsuario);
		springLayout.putConstraint(SpringLayout.WEST, lblAgregarContactoNuevo, -1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblAgregarContactoNuevo, 116, SpringLayout.SOUTH, lblNombreUsuario);
		springLayout.putConstraint(SpringLayout.EAST, lblAgregarContactoNuevo, 1, SpringLayout.EAST, this);
		lblAgregarContactoNuevo.setFont(new Font("Georgia", Font.PLAIN, 40));
		lblAgregarContactoNuevo.setBorder(border);
		lblAgregarContactoNuevo.setBackground(COLOR_FONDO_OPCIONES);
		lblAgregarContactoNuevo.setOpaque(true);
		lblAgregarContactoNuevo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAgregarContactoNuevo.addMouseListener(new MouseListener() {
			
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
				chatUI.getContenedorPerfil().setVisible(false);
				chatUI.getContenedorAgregarContacto().setVisible(true);
			}
		});
		add(lblAgregarContactoNuevo);
		
		lblCerrarSesion = new JLabel("   Cerrar sesi\u00F3n");
		springLayout.putConstraint(SpringLayout.NORTH, lblCerrarSesion, 6, SpringLayout.SOUTH, lblAgregarContactoNuevo);
		springLayout.putConstraint(SpringLayout.WEST, lblCerrarSesion, -1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblCerrarSesion, 116, SpringLayout.SOUTH, lblAgregarContactoNuevo);
		springLayout.putConstraint(SpringLayout.EAST, lblCerrarSesion, 1, SpringLayout.EAST, this);
		lblCerrarSesion.setFont(new Font("Georgia", Font.PLAIN, 40));
		lblCerrarSesion.setBorder(border);
		lblCerrarSesion.setBackground(COLOR_FONDO_OPCIONES);
		lblCerrarSesion.setOpaque(true);
		lblCerrarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblCerrarSesion.addMouseListener(new MouseListener() {
			
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
				cerrarSesion();
			}
		});
		add(lblCerrarSesion);
		
		lblIcono = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblIcono, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblIcono, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblIcono, 0, SpringLayout.NORTH, lblFoto);
		springLayout.putConstraint(SpringLayout.WEST, lblTitulo, 0, SpringLayout.EAST, lblIcono);
		lblIcono.setBackground(COLOR_FONDO_TITULO);
		lblIcono.setOpaque(true);
		lblIcono.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblIcono.addMouseListener(new MouseListener() {
			
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
				chatUI.getContenedorPerfil().setVisible(false);
				chatUI.getContenedorPrincipal().setVisible(true);
				
			}
		});
		add(lblIcono);


		cargarIconos();
		cargarFoto();
	}

	private void cargarIconos() {
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_ICONO_VOLVER);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblIcono.setIcon(imageIcon);

	}
	
	private void cerrarSesion(){
		int respuesta = JOptionPane.showConfirmDialog(null, "�Desea cerrar sesi�n?", "Cerrar sesi�n", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);
		if( respuesta == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	
	private void cargarFoto(){
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_FOTO_DEFECTO1);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		ImageIcon foto = new ImageIcon(imageIcon.getImage().getScaledInstance(lblFoto.getWidth()+220, lblFoto.getHeight()+220, Image.SCALE_DEFAULT));
		lblFoto.setIcon(foto);
	}
	
}
