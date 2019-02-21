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

import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JSeparator;

public class IniciarSesionGUI extends JFrame {

	
	private ContenedorIniciarSesion contenedorIniciarSesion;
	/**
	 * Asignacion de colores con los valores: r=0, g=136, b=176, a=30,61
	 */
	
	private Color fondo;
	private Color fondoPanel;
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
		fondo = new Color(0, 136, 176, 30);
		fondoPanel = new Color(0, 136, 176, 61);
		contenedorIniciarSesion = new ContenedorIniciarSesion();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, contenedorIniciarSesion, 20, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, contenedorIniciarSesion, 150, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, contenedorIniciarSesion, -20, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, contenedorIniciarSesion, -150, SpringLayout.EAST, getContentPane());
		getContentPane().setLayout(springLayout);
		getContentPane().setBackground(fondo);
		getContentPane().add(contenedorIniciarSesion);
	}
	public Color getThisContentPaneBackground() {
		return getContentPane().getBackground();
	}
	public void setThisContentPaneBackground(Color background) {
		getContentPane().setBackground(background);
	}
}
