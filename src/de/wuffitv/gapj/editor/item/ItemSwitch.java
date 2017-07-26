package de.wuffitv.gapj.editor.item;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class ItemSwitch extends JComponent{
	
	private static final long serialVersionUID = 3507601365824573172L;

	private boolean mode;
	
	public ItemSwitch(int x, int y, int width, int height) {
		setBounds(x, y, width, height);
		
		mouseInput();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		if(mode == true) {
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, this.getWidth()/2, this.getHeight());
		}else if(mode == false) {
			g.setColor(Color.RED);
			g.fillRect(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
		}else {
			System.err.println("[ItemSwitch] can't read mode");
		}
		super.paintComponent(g);
	}
	
	public void mouseInput() {
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(mode == true) {
					mode = false;
					repaint();
				}else if(mode == false) {
					mode = true;
					repaint();
				}else{
					System.err.println("[ItemSwitch] can't read mode");
				}
			}
		});
	}
	
}
