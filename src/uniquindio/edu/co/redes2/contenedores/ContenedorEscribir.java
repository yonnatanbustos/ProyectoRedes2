package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import uniquindio.edu.co.redes2.gui.ChatUI;

import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.Locale.Category;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ContenedorEscribir extends JPanel {

	private static final String RUTA_ICONO_EMOTICON = "uniquindio/edu/co/redes2/resources/iconos/icon-emoticon.png";

	private static final String RUTA_ICONO_ADJUNTAR = "uniquindio/edu/co/redes2/resources/iconos/icon-adjuntar.png";

	private static final String RUTA_ICONO_CERRAR = "uniquindio/edu/co/redes2/resources/iconos/icon-cerrar.png";

	private JTextField txtEscribir;

	private JLabel lblAdjuntar, lblEmoticon;

	private JButton btnEnviar;

	private ChatUI chatUI;

	private boolean estadoEmoticon, estadoAdjuntar;

	/**
	 * Create the panel.
	 */
	public ContenedorEscribir(ChatUI chatUI) {
		this.chatUI = chatUI;
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		estadoEmoticon = true;
		estadoAdjuntar = true;

		lblEmoticon = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblEmoticon, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblEmoticon, 5, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, lblEmoticon, -5, SpringLayout.SOUTH, this);
		lblEmoticon.setBorder(new LineBorder(Color.BLACK));
		lblEmoticon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEmoticon.addMouseListener(new MouseListener() {

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
					if(estadoEmoticon){
						estadoEmoticon = false;
						chatUI.getContenedorEmoticon().setVisible(true);
						cargarIconoX();
					}else{
						estadoEmoticon = true;
						chatUI.getContenedorEmoticon().setVisible(false);
						cargarIconos();
					
					}
				
				
					
			}
		});
		add(lblEmoticon);

		txtEscribir = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txtEscribir, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, txtEscribir, 10, SpringLayout.EAST, lblEmoticon);
		springLayout.putConstraint(SpringLayout.SOUTH, txtEscribir, -5, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, txtEscribir, -160, SpringLayout.EAST, this);
		add(txtEscribir);
		txtEscribir.setColumns(10);

		lblAdjuntar = new JLabel();
		springLayout.putConstraint(SpringLayout.NORTH, lblAdjuntar, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblAdjuntar, 10, SpringLayout.EAST, txtEscribir);
		springLayout.putConstraint(SpringLayout.SOUTH, lblAdjuntar, -5, SpringLayout.SOUTH, this);
		lblAdjuntar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblAdjuntar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(estadoAdjuntar){
					estadoAdjuntar = false;
					chatUI.getContenedorAdjuntar().setVisible(true);
				}else{
					estadoAdjuntar = true;
					chatUI.getContenedorAdjuntar().setVisible(false);
				}
			}
		});
		add(lblAdjuntar);

		btnEnviar = new JButton("ENVIAR");
		springLayout.putConstraint(SpringLayout.EAST, btnEnviar, -5, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, btnEnviar, 5, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, btnEnviar, -5, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.WEST, btnEnviar, 10, SpringLayout.EAST, lblAdjuntar);
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(btnEnviar);

		cargarIconos();

	}

	private void cargarIconos() {
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_ICONO_EMOTICON);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblEmoticon.setIcon(imageIcon);

		url = cl.getResource(RUTA_ICONO_ADJUNTAR);
		imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblAdjuntar.setIcon(imageIcon);

	}

	public JLabel getLblEmoticon() {
		return lblEmoticon;
	}

	/**
	 * Metodo que carga el icono de cerrar(X), cuando se presiona el icono de
	 * emoticon. Este icono que carga significa que es para cerrar el contenedor
	 * de los emoticones.
	 */
	public void cargarIconoX() {
		ClassLoader cl = getClass().getClassLoader();
		URL url = cl.getResource(RUTA_ICONO_CERRAR);
		ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
		lblEmoticon.setIcon(imageIcon);
	}

}
