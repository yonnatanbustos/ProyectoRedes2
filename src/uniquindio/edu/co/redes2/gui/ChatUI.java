package uniquindio.edu.co.redes2.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import javax.swing.plaf.PanelUI;

import uniquindio.edu.co.redes2.contenedores.ContenedorAdjuntar;
import uniquindio.edu.co.redes2.contenedores.ContenedorAgregarContacto;
import uniquindio.edu.co.redes2.contenedores.ContenedorContacto;
import uniquindio.edu.co.redes2.contenedores.ContenedorEmoticon;
import uniquindio.edu.co.redes2.contenedores.ContenedorPerfil;
import uniquindio.edu.co.redes2.contenedores.ContenedorPrincipal;
import uniquindio.edu.co.redes2.contenedores.ContenedorSolicitudAmistad;
import uniquindio.edu.co.redes2.contenedores.ContenedoreSolicitudes;
import uniquindio.edu.co.redes2.contenedores.PanelDerecho;

import java.awt.Color;

public class ChatUI extends JFrame {
	
	private static final Color COLOR_FONDO= new Color(0, 136, 176, 30);

	private JPanel contentPane;
	
	private JPanel panelIzquierdo;
		
	private ContenedorAgregarContacto contenedorAgregarContacto;
		
	private ContenedorEmoticon contenedorEmoticon;
	
	private ContenedorPerfil contenedorPerfil;
		
	private ContenedorPrincipal contenedorPrincipal;
	
	private ContenedoreSolicitudes contenedoreSolicitudes;
	
	private PanelDerecho panelDerecho2;
	
	private ContenedorAdjuntar contenedorAdjuntar;
	
	private SpringLayout layoutIzquierdo;


	/**
	 * Create the frame.
	 */
	public ChatUI() {
		this.setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);
		getContentPane().setBackground(COLOR_FONDO);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		layoutIzquierdo = new SpringLayout();
		getContentPane().setLayout(springLayout);
					
		
		panelIzquierdo = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panelIzquierdo, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panelIzquierdo, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panelIzquierdo, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panelIzquierdo, -900, SpringLayout.EAST, getContentPane());
		panelIzquierdo.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(panelIzquierdo);
		
		panelDerecho2 = new PanelDerecho(this);
		springLayout.putConstraint(SpringLayout.NORTH, panelDerecho2, 10, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panelDerecho2, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panelDerecho2, -10, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panelDerecho2, 10, SpringLayout.EAST, panelIzquierdo);
		panelDerecho2.setBorder(new LineBorder(new Color(0, 0, 0)));		
		getContentPane().add(panelDerecho2);
		
		panelIzquierdo.setLayout(layoutIzquierdo);
		
		cargarContenedorPrincipal();
		cargarContenedorEmoticones();
		cargarContenedorAdjuntar();
		cargarContenedorPerfil();
		cargarContenedorAgregarContacto();
		cargarContendorSolicitudes();
		
	}
	
	
	public void cargarContenedorPrincipal(){
		contenedorPrincipal = new ContenedorPrincipal(this);
		layoutIzquierdo.putConstraint(SpringLayout.NORTH, contenedorPrincipal, 0, SpringLayout.NORTH, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.WEST, contenedorPrincipal, 0, SpringLayout.WEST, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.EAST, contenedorPrincipal, 0, SpringLayout.EAST, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.SOUTH, contenedorPrincipal, 0, SpringLayout.SOUTH, panelIzquierdo);
		panelIzquierdo.updateUI();
		panelIzquierdo.add(contenedorPrincipal);
	}
	
	public void cargarContenedorPerfil(){
		contenedorPerfil = new ContenedorPerfil(this);
		layoutIzquierdo.putConstraint(SpringLayout.NORTH, contenedorPerfil, 0, SpringLayout.NORTH, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.WEST, contenedorPerfil, 0, SpringLayout.WEST, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.EAST, contenedorPerfil, 0, SpringLayout.EAST, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.SOUTH, contenedorPerfil, 0, SpringLayout.SOUTH, panelIzquierdo);
		panelIzquierdo.add(contenedorPerfil);
		panelIzquierdo.updateUI();
		contenedorPerfil.setVisible(false);
	}
	
	public void cargarContenedorAgregarContacto(){
		contenedorAgregarContacto = new ContenedorAgregarContacto(this);
		layoutIzquierdo.putConstraint(SpringLayout.NORTH, contenedorAgregarContacto, 0, SpringLayout.NORTH, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.WEST, contenedorAgregarContacto, 0, SpringLayout.WEST, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.EAST, contenedorAgregarContacto, 0, SpringLayout.EAST, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.SOUTH, contenedorAgregarContacto, 0, SpringLayout.SOUTH, panelIzquierdo);
		panelIzquierdo.add(contenedorAgregarContacto);
		panelIzquierdo.updateUI();
		contenedorAgregarContacto.setVisible(false);
	}
	
	public void cargarContenedorEmoticones(){
		contenedorEmoticon = new ContenedorEmoticon();
		panelDerecho2.getSpringLayoutMensajes().putConstraint(SpringLayout.SOUTH, contenedorEmoticon, -5, SpringLayout.SOUTH, panelDerecho2.getPanelMensajes());
		panelDerecho2.getSpringLayoutMensajes().putConstraint(SpringLayout.WEST, contenedorEmoticon, 20, SpringLayout.WEST, panelDerecho2.getPanelMensajes());
		panelDerecho2.getSpringLayoutMensajes().putConstraint(SpringLayout.EAST, contenedorEmoticon, -20, SpringLayout.EAST, panelDerecho2.getPanelMensajes());
		panelDerecho2.getSpringLayoutMensajes().putConstraint(SpringLayout.NORTH, contenedorEmoticon, 350, SpringLayout.NORTH, panelDerecho2.getPanelMensajes());
		panelDerecho2.getPanelMensajes().add(contenedorEmoticon);
		panelDerecho2.updateUI();
		contenedorEmoticon.setVisible(false);
		
	}
	
	public void cargarContenedorAdjuntar(){
		contenedorAdjuntar = new ContenedorAdjuntar(this);
		panelDerecho2.getSpringLayoutMensajes().putConstraint(SpringLayout.SOUTH, contenedorAdjuntar, -5, SpringLayout.SOUTH, panelDerecho2.getPanelMensajes());
		panelDerecho2.getSpringLayoutMensajes().putConstraint(SpringLayout.WEST, contenedorAdjuntar, 650, SpringLayout.WEST, panelDerecho2.getPanelMensajes());
		panelDerecho2.getSpringLayoutMensajes().putConstraint(SpringLayout.EAST, contenedorAdjuntar, -20, SpringLayout.EAST, panelDerecho2.getPanelMensajes());
		panelDerecho2.getSpringLayoutMensajes().putConstraint(SpringLayout.NORTH, contenedorAdjuntar, 480, SpringLayout.NORTH, panelDerecho2.getPanelMensajes());
		panelDerecho2.getPanelMensajes().add(contenedorAdjuntar);
		panelDerecho2.updateUI();
		contenedorAdjuntar.setVisible(false);
	}
	
	public void cargarContendorSolicitudes(){
		contenedoreSolicitudes = new ContenedoreSolicitudes(this);
		layoutIzquierdo.putConstraint(SpringLayout.NORTH, contenedoreSolicitudes, 0, SpringLayout.NORTH, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.WEST, contenedoreSolicitudes, 0, SpringLayout.WEST, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.EAST, contenedoreSolicitudes, 0, SpringLayout.EAST, panelIzquierdo);
		layoutIzquierdo.putConstraint(SpringLayout.SOUTH, contenedoreSolicitudes, 0, SpringLayout.SOUTH, panelIzquierdo);
		panelIzquierdo.add(contenedoreSolicitudes);
		panelIzquierdo.updateUI();
		contenedoreSolicitudes.setVisible(false);
	}
	

	
	public ContenedorEmoticon getContenedorEmoticon() {
		return contenedorEmoticon;
	}
	
	
	public ContenedorAdjuntar getContenedorAdjuntar() {
		return contenedorAdjuntar;
	}
	
	public ContenedorAgregarContacto getContenedorAgregarContacto() {
		return contenedorAgregarContacto;
	}
	
	public ContenedoreSolicitudes getContenedoreSolicitudes() {
		return contenedoreSolicitudes;
	}
	
	public ContenedorPrincipal getContenedorPrincipal() {
		return contenedorPrincipal;
	}
	
	public ContenedorPerfil getContenedorPerfil() {
		return contenedorPerfil;
	}
	
}
