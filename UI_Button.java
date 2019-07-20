package meow;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UI_Button extends JComponent implements MouseListener {

	String label = "";
	JPanel panel = null;
	
	int x_pos, y_pos;
	int button_index;
	
	public UI_Button(String text, JPanel panel, int index) {
		label = text;
		button_index = index;
		this.panel = panel;
		this.setName(text);
		
		this.setPreferredSize(new Dimension(100,100));
		this.setSize(new Dimension(100,100));
		
		int width = this.getWidth();
		int p_width = panel.getWidth();
		int p_height = panel.getHeight();
		
		x_pos = (p_width / 2) - (width / 2);
		y_pos = (p_height / 5) * (button_index + 1);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(label, x_pos, y_pos);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		switch (button_index) {
		case 1: 
			System.out.println("Start Game!");
		case 2:
			System.out.println("Open Options");
		case 3:
			System.exit(1);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
