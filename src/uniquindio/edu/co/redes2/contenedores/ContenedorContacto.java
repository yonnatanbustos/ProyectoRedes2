package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContenedorContacto extends JPanel {
	
	
	private static final String RUTA_FOTO_DEFECTO="uniquindio/edu/co/redes2/resources/iconos/icon-usuario.png";

	
	//Etiqueta para mostrar el nombre del contacto.
	private JLabel lblNombreContacto;
	
	//Etiquete para mostrar el estado actual del contacto, es Conectado o Desconectado.
	private JLabel lblEstado;
	
	private JButton btnAgregar;
	
	private JLabel lblFoto;
	
	
	
	
	private static final Color COLOR_FONDO = new Color(153, 153, 153, 100);
	
	private static final Color COLOR_BOTON = new Color(0, 136, 176, 61);

	/**
	 * Create the panel.
	 */
	public ContenedorContacto() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		setBackground(COLOR_FONDO);
		
		
		lblFoto = new JLabel();
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.NORTH, lblFoto, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblFoto, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblFoto, -10, SpringLayout.SOUTH, this);
		add(lblFoto);
		
		lblNombreContacto = new JLabel("Nombre del contacto");
		springLayout.putConstraint(SpringLayout.NORTH, lblNombreContacto, 20, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblNombreContacto, 60, SpringLayout.WEST, lblFoto);
		lblNombreContacto.setFont(new Font("Georgia", Font.PLAIN, 40));
		add(lblNombreContacto);
				
		lblEstado = new JLabel("Estado");
		springLayout.putConstraint(SpringLayout.NORTH, lblEstado, 5, SpringLayout.SOUTH, lblNombreContacto);
		springLayout.putConstraint(SpringLayout.WEST, lblEstado, 60, SpringLayout.WEST, lblFoto);
		springLayout.putConstraint(SpringLayout.SOUTH, lblEstado, -30, SpringLayout.SOUTH, this);
		lblEstado.setFont(new Font("Georgia", Font.PLAIN, 25));
		add(lblEstado);
		
		btnAgregar = new JButton("Agregar");
		springLayout.putConstraint(SpringLayout.NORTH, btnAgregar, 40, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnAgregar, 50, SpringLayout.EAST, lblNombreContacto);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAgregar, -40, SpringLayout.SOUTH, this);
		btnAgregar.setBackground(COLOR_BOTON);
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAgregar.setFont(new Font("Georgia", Font.PLAIN, 25));
		add(btnAgregar);
		
		cargarFoto();

	}
	
	
	private void cargarFoto(){
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_FOTO_DEFECTO);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblFoto.setIcon(imageIcon);
	}
	
	public JLabel getLblEstado() {
		return lblEstado;
	}
	
	public JLabel getLblFoto() {
		return lblFoto;
	}
	
	public JLabel getLblNombreContacto() {
		return lblNombreContacto;
	}
	
	public JButton getBtnAgregar() {
		return btnAgregar;
	}
}
