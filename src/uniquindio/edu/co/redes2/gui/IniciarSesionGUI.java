package uniquindio.edu.co.redes2.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;

import uniquindio.edu.co.redes2.contenedores.ContenedorIniciarSesion;
import uniquindio.edu.co.redes2.contenedores.ContenedorRegistro;

import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JSeparator;

public class IniciarSesionGUI extends JFrame {

	
	private ContenedorIniciarSesion contenedorIniciarSesion;
	
	private ContenedorRegistro contenedorRegistro;
	
	private SpringLayout springLayoutPanel;
	
	private JPanel panel;
	/**
	 * Asignacion de colores con los valores: r=0, g=136, b=176, a=30,61
	 */
	
	private Color fondo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesionGUI frame = new IniciarSesionGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IniciarSesionGUI() {
		this.setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);
		fondo = new Color(0, 136, 176, 30);		
		springLayoutPanel = new SpringLayout();
		getContentPane().setLayout(springLayoutPanel);
		getContentPane().setBackground(fondo);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cargarContenedorIniciarSesion();
		
	}
	public void cargarContenedorRegistro(){
		
		contenedorRegistro = new ContenedorRegistro(this);
		springLayoutPanel.putConstraint(SpringLayout.NORTH, contenedorRegistro, 20, SpringLayout.NORTH, getContentPane());
		springLayoutPanel.putConstraint(SpringLayout.WEST, contenedorRegistro, 150, SpringLayout.WEST, getContentPane());
		springLayoutPanel.putConstraint(SpringLayout.SOUTH, contenedorRegistro, -20, SpringLayout.SOUTH, getContentPane());
		springLayoutPanel.putConstraint(SpringLayout.EAST, contenedorRegistro, -150, SpringLayout.EAST, getContentPane());		
		getContentPane().add(contenedorRegistro);		
		contenedorRegistro.setVisible(true);		
		contenedorIniciarSesion.setVisible(false);
		revalidate();
		repaint();
	}
	
	public ContenedorIniciarSesion getContenedorIniciarSesion() {
		return contenedorIniciarSesion;
	}
	
	public void cargarContenedorIniciarSesion(){
		contenedorIniciarSesion = new ContenedorIniciarSesion(this);
		springLayoutPanel.putConstraint(SpringLayout.NORTH, contenedorIniciarSesion, 20, SpringLayout.NORTH, getContentPane());
		springLayoutPanel.putConstraint(SpringLayout.WEST, contenedorIniciarSesion, 150, SpringLayout.WEST, getContentPane());
		springLayoutPanel.putConstraint(SpringLayout.SOUTH, contenedorIniciarSesion, -20, SpringLayout.SOUTH, getContentPane());
		springLayoutPanel.putConstraint(SpringLayout.EAST, contenedorIniciarSesion, -150, SpringLayout.EAST, getContentPane());
		getContentPane().add(contenedorIniciarSesion);
		contenedorIniciarSesion.setVisible(true);
		revalidate();
		repaint();
		//System.out.println(contenedorIniciarSesion.getSize());

	}
	
	public ContenedorRegistro getContenedorRegistro() {
		return contenedorRegistro;
	}
	
	public JPanel getPanel() {
		return panel;
	}
}
