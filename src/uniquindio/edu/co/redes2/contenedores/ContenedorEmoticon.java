package uniquindio.edu.co.redes2.contenedores;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import rsscalelabel.RSScaleLabel;
import uniquindio.edu.co.redes2.logica.Emoticon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.net.URI;
import java.net.URL;
import rsscalelabel.*;

public class ContenedorEmoticon extends JPanel {
	
	private JLabel[][] emoticons;
	private static final int CANTIDAD_EMOTICONS=40;
	private static final String RUTA="uniquindio/edu/co/redes2/resources/emoticons/";
	private Emoticon emoticon;

	/**
	 * Create the panel.
	 */
	public ContenedorEmoticon() {
		setLayout(new GridLayout(3, 20));
		emoticon = new Emoticon();
		setBorder(new LineBorder(new Color(221, 238, 214)));
		setBackground(new Color(221, 238, 214));
		inicializarMatriz();
//		
		

	}
	
	
	private void inicializarMatriz(){
		ClassLoader cl = getClass().getClassLoader();
		for(int i=0; i<emoticon.getNombresEmoticons().length;i++){
			URL url = cl.getResource(RUTA+emoticon.getNombresEmoticons()[i]+".png");
			ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(url));
			int n=i;
			JLabel label= new JLabel(imageIcon);
			label.setSize(30, 30);
			rsscalelabel.RSScaleLabel.setScaleLabel(label, url.getPath());
			label.addMouseListener(new MouseListener() {
				
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
					JOptionPane.showMessageDialog(null, emoticon.getNombresEmoticons()[n]+ "");
					Texfiel field = new Texfiel(RUTA, imageIcon);
					field.setVisible(true);

				}
			});
			add(label);
		}
	
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		
		
	}

}
