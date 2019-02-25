package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ContenedorSolicitudAmistad extends JPanel {
	
	private JLabel lblFoto;
	
	private JButton btnConfirmar;

	private JButton btnRechazar;
	
	private JLabel lblNombreDelContacto;
	
	private static final String RUTA_FOTO_DEFECTO="uniquindio/edu/co/redes2/resources/iconos/icon-usuario.png";
	
	private static final String RUTA_ICON_ACEPTAR="uniquindio/edu/co/redes2/resources/iconos/icon-aceptar.png";
	
	private static final String RUTA_ICON_RECHAZAR="uniquindio/edu/co/redes2/resources/iconos/icon-eliminar.png";
	
	private static final Color COLOR_FONDO = new Color(153, 153, 153, 100);
	
	/**
	 * Create the panel.
	 */
	public ContenedorSolicitudAmistad() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		setBackground(COLOR_FONDO);
		
		lblNombreDelContacto = new JLabel("Nombre del contacto");
		lblNombreDelContacto.setFont(new Font("Georgia", Font.PLAIN, 30));
		add(lblNombreDelContacto);
		
		lblFoto = new JLabel();
		springLayout.putConstraint(SpringLayout.SOUTH, lblFoto, -30, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblNombreDelContacto, 0, SpringLayout.NORTH, lblFoto);
		springLayout.putConstraint(SpringLayout.WEST, lblNombreDelContacto, 26, SpringLayout.EAST, lblFoto);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNombreDelContacto, 0, SpringLayout.SOUTH, lblFoto);
		springLayout.putConstraint(SpringLayout.NORTH, lblNombreDelContacto, 0, SpringLayout.NORTH, lblFoto);
		springLayout.putConstraint(SpringLayout.NORTH, lblFoto, 30, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblFoto, 30, SpringLayout.WEST, this);
		add(lblFoto);
		
		btnConfirmar = new JButton();
		springLayout.putConstraint(SpringLayout.NORTH, btnConfirmar, 0, SpringLayout.NORTH, lblNombreDelContacto);
		springLayout.putConstraint(SpringLayout.WEST, btnConfirmar, 38, SpringLayout.EAST, lblNombreDelContacto);
		springLayout.putConstraint(SpringLayout.SOUTH, btnConfirmar, -2, SpringLayout.SOUTH, lblNombreDelContacto);
		springLayout.putConstraint(SpringLayout.EAST, btnConfirmar, 88, SpringLayout.EAST, lblNombreDelContacto);
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnConfirmar);
		
		btnRechazar = new JButton();
		springLayout.putConstraint(SpringLayout.NORTH, btnRechazar, 0, SpringLayout.NORTH, lblNombreDelContacto);
		springLayout.putConstraint(SpringLayout.WEST, btnRechazar, 28, SpringLayout.EAST, btnConfirmar);
		springLayout.putConstraint(SpringLayout.SOUTH, btnRechazar, 80, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.EAST, btnRechazar, -30, SpringLayout.EAST, this);
		add(btnRechazar);
		
		cargarIconos();
		cargarFoto();

	}
	
	/**
	 * Metodo para cargar la foto del usuario
	 */
	public void cargarFoto(){
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_FOTO_DEFECTO);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblFoto.setIcon(imageIcon);
		

	}
	
	private void cargarIconos(){
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_ICON_ACEPTAR);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		btnConfirmar.setIcon(imageIcon);
		
		url=cl.getResource(RUTA_ICON_RECHAZAR);
		imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		btnRechazar.setIcon(imageIcon);
	}
}
