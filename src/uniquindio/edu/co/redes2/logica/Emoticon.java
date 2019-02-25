package uniquindio.edu.co.redes2.logica;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Emoticon extends JLabel {

	private String nombre;
	private ImageIcon imageIcon;
	private String[] nombresEmoticons = { "calm", "confused", "cool", "cool-1", "crying-1", "devil", "girl", "happy",
			"happy-1", "happy-2", "happy-3", "happy-4", "happy-5", "happy-6", "happy-7", "happy-8", "happy-9",
			"happy-10", "happy-11", "happy-12", "kiss", "kiss-1", "laughing", "moustache", "muted", "muted-1",
			"muted-2", "nervous", "nervous-1", "sad", "sad-1", "sad-2", "sad-3", "sad-4", "sad-5", "sad-6", "sad-7",
			"sad-8", "shouting", "sick", "surprised", "surprised-1", "surprised-2", "surprised-3", "surprised-4",
			"tongue", "tongue-1", "tongue-2", "wink" };

	public Emoticon(String nombre, ImageIcon imageIcon) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.imageIcon = imageIcon;
	}

	public Emoticon() {
		// TODO Auto-generated constructor stub
	}

	public String[] getNombresEmoticons() {
		return nombresEmoticons;
	}

	public String getNombre() {
		return nombre;
	}

	public ImageIcon getImageIcon() {
		return imageIcon;
	}

}
