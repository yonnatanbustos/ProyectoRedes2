package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import uniquindio.edu.co.redes2.gui.ChatUI;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ContenedorAgregarContacto extends JPanel {

	private static final Color COLOR_FONDO_TITULO = new Color(0, 136, 176, 61);
	
	private static final String RUTA_ICONO_VOLVER = "uniquindio/edu/co/redes2/resources/iconos/icon-atras.png";
	
	private static final String RUTA_ICONO_BUSCAR = "uniquindio/edu/co/redes2/resources/iconos/icon-busqueda.png";



	private JLabel lblTitulo, lblIcono;
	private JTextField txtNombreContacto;
	
	private JButton btnBuscar;
	
	private JPanel panel;
	
	private ChatUI chatUI;

	/**
	 * Create the panel.
	 */
	public ContenedorAgregarContacto(ChatUI chatUI) {
		this.chatUI = chatUI;
		setBackground(Color.WHITE);
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);

		lblTitulo = new JLabel("Agregar");
		springLayout.putConstraint(SpringLayout.NORTH, lblTitulo, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, lblTitulo, 0, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblTitulo, 110, SpringLayout.NORTH, this);
		lblTitulo.setFont(new Font("Georgia", Font.PLAIN, 72));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBackground(COLOR_FONDO_TITULO);
		lblTitulo.setOpaque(true);
		add(lblTitulo);

		JLabel lblNombreDelContacto = new JLabel("Nombre del contacto");
		lblNombreDelContacto.setFont(new Font("Georgia", Font.PLAIN, 20));
		springLayout.putConstraint(SpringLayout.NORTH, lblNombreDelContacto, 31, SpringLayout.SOUTH, lblTitulo);
		springLayout.putConstraint(SpringLayout.WEST, lblNombreDelContacto, 10, SpringLayout.WEST, this);
		add(lblNombreDelContacto);

		txtNombreContacto = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtNombreContacto, 5, SpringLayout.SOUTH, lblNombreDelContacto);
		springLayout.putConstraint(SpringLayout.WEST, txtNombreContacto, 0, SpringLayout.WEST, lblNombreDelContacto);
		txtNombreContacto.setFont(new Font("Georgia", Font.PLAIN, 30));
		add(txtNombreContacto);
		txtNombreContacto.setColumns(10);

		btnBuscar = new JButton();
		springLayout.putConstraint(SpringLayout.EAST, btnBuscar, -20, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.EAST, txtNombreContacto, -5, SpringLayout.WEST, btnBuscar);
		springLayout.putConstraint(SpringLayout.NORTH, btnBuscar, 0, SpringLayout.NORTH, txtNombreContacto);
		btnBuscar.setBackground(COLOR_FONDO_TITULO);
		btnBuscar.setForeground(COLOR_FONDO_TITULO);
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(btnBuscar);
		
		lblIcono = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblIcono, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblIcono, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblIcono, 110, SpringLayout.NORTH, this);
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
				chatUI.getContenedorAgregarContacto().setVisible(false);
				chatUI.getContenedorPerfil().setVisible(true);
				
			}
		});
		add(lblIcono);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.SOUTH, btnBuscar);
		springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -10, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, txtNombreContacto, -10, SpringLayout.NORTH, panel);

		add(panel);
		
		cargarIconos();

	}

	private void cargarIconos() {

		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_ICONO_VOLVER);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblIcono.setIcon(imageIcon);
		
		url = cl.getResource(RUTA_ICONO_BUSCAR);
		imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		btnBuscar.setIcon(imageIcon);
	}
}
