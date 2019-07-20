package meow;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Scene extends JPanel {
	
	String scene_title = "";
	int scene_index;
	JLayeredPane layeredPane;
	
	public Scene(String title, int index, int width, int height) {
		scene_title = title;
		scene_index = index;
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		layeredPane = new JLayeredPane();
		layeredPane.setPreferredSize(new Dimension(width, height));
		layeredPane.setSize(new Dimension(width, height));
		layeredPane.setBorder(BorderFactory.createLineBorder(Color.RED));
	}
	
	public void addToLayeredPane(JComponent comp, int layer) {
		layeredPane.add(comp, layer);
		System.out.println("Added: " + comp.getName());
	}
	
	public void loadScene() {	
		try {
			for(int i = 0; i  < layeredPane.getComponentCount(); i++) {
				Component comp = layeredPane.getComponents()[i];
				System.out.println("Displaying: " + comp.getName());
				comp.setVisible(true);
				comp.repaint();
			}
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
		} finally {
			this.setOpaque(true);
		}
	}
	
	
}
