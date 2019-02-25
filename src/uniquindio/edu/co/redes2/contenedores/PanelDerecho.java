package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PanelDerecho extends JPanel {
	
	private JPanel panelChat, panelMensajes;
	
	private ContenedorContacto contenedorContacto;

	/**
	 * Create the panel.
	 */
	public PanelDerecho() {
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		contenedorContacto = new ContenedorContacto();
		springLayout.putConstraint(SpringLayout.NORTH, contenedorContacto, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, contenedorContacto, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, contenedorContacto, 0, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, contenedorContacto, 130, SpringLayout.NORTH, this);
		add(contenedorContacto);
		
		panelMensajes = new JPanel();
		panelMensajes.setBorder(new LineBorder(new Color(0, 0, 0)));
		springLayout.putConstraint(SpringLayout.NORTH, panelMensajes, 0, SpringLayout.SOUTH, contenedorContacto);
		springLayout.putConstraint(SpringLayout.WEST, panelMensajes, -1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, panelMensajes, 1, SpringLayout.EAST, this);
		

		
		panelChat = new JPanel();
		panelChat.setBorder(new LineBorder(new Color(0, 0, 0)));
		springLayout.putConstraint(SpringLayout.NORTH, panelChat, 0, SpringLayout.SOUTH, panelMensajes);
		springLayout.putConstraint(SpringLayout.WEST, panelChat, -1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, panelChat, 0, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, panelChat, 1, SpringLayout.EAST, this);
		add(panelChat);
		
		springLayout.putConstraint(SpringLayout.SOUTH, panelMensajes, 550, SpringLayout.SOUTH, contenedorContacto);
		add(panelMensajes);

		esconderElementos();

	}
	
	
	private void esconderElementos(){
		contenedorContacto.getBtnAgregar().setVisible(false);
	}

}
