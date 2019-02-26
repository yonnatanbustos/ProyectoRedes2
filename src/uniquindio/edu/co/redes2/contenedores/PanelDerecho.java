package uniquindio.edu.co.redes2.contenedores;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;

import uniquindio.edu.co.redes2.gui.ChatUI;

import java.awt.Color;

public class PanelDerecho extends JPanel {
	
	private JPanel panelMensajes;
	
	private ContenedorContacto contenedorContacto;
	
	private ContenedorEscribir contenedorEscribir;
	
	private SpringLayout springLayout, springLayoutMensajes;

	/**
	 * Create the panel.
	 */
	public PanelDerecho(ChatUI chatUI) {
		springLayout = new SpringLayout();
		springLayoutMensajes = new SpringLayout();
		setLayout(springLayout);
		
		contenedorContacto = new ContenedorContacto();
		springLayout.putConstraint(SpringLayout.NORTH, contenedorContacto, 0, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, contenedorContacto, 0, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, contenedorContacto, 0, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, contenedorContacto, 130, SpringLayout.NORTH, this);
		add(contenedorContacto);
		
		panelMensajes = new JPanel();
		panelMensajes.setBackground(Color.WHITE);
		panelMensajes.setLayout(springLayoutMensajes);
		panelMensajes.setBorder(new LineBorder(new Color(0, 0, 0)));
		springLayout.putConstraint(SpringLayout.NORTH, panelMensajes, 0, SpringLayout.SOUTH, contenedorContacto);
		springLayout.putConstraint(SpringLayout.WEST, panelMensajes, -1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, panelMensajes, 1, SpringLayout.EAST, this);
		
		contenedorEscribir = new ContenedorEscribir(chatUI);
		contenedorEscribir.setBorder(new LineBorder(new Color(0, 0, 0)));
		springLayout.putConstraint(SpringLayout.NORTH, contenedorEscribir, -1, SpringLayout.SOUTH, panelMensajes);
		springLayout.putConstraint(SpringLayout.WEST, contenedorEscribir, -1, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.SOUTH, contenedorEscribir, 1, SpringLayout.SOUTH, this);
		springLayout.putConstraint(SpringLayout.EAST, contenedorEscribir, 1, SpringLayout.EAST, this);
		add(contenedorEscribir);
		
		springLayout.putConstraint(SpringLayout.SOUTH, panelMensajes, 550, SpringLayout.SOUTH, contenedorContacto);
		add(panelMensajes);

		esconderElementos();

	}
	
	
	private void esconderElementos(){
		contenedorContacto.getBtnAgregar().setVisible(false);
	}
	
	public SpringLayout getSpringLayout() {
		return springLayout;
	}
	
	public ContenedorEscribir getContenedorEscribir() {
		return contenedorEscribir;
	}
	
	public JPanel getPanelMensajes() {
		return panelMensajes;
	}
	
	public SpringLayout getSpringLayoutMensajes() {
		return springLayoutMensajes;
	}

}
