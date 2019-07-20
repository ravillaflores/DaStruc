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

public class Display extends JFrame {
	
	Scene mainMenu;
	
	public Display(int width, int height) {
		this.setPreferredSize(new Dimension(width, height));
		this.setSize(new Dimension(width, height));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void loadMainMenu() {
		mainMenu = new Scene("Main Menu", 1, this.getWidth(), this.getHeight());
		UI_Button btnStart = new UI_Button("Start", mainMenu, 1);
		UI_Button btnOption = new UI_Button("Options", mainMenu, 2);
		mainMenu.addToLayeredPane(btnStart, 1);
		mainMenu.addToLayeredPane(btnOption, 1);
		mainMenu.loadScene();
		mainMenu.setOpaque(true);
		this.setContentPane(mainMenu);
	}
	
	public void loadDisplay() {
		this.pack();
		this.setVisible(true);
	}
	
}
