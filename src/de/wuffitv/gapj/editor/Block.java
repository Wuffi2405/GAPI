package de.wuffitv.gapj.editor;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class Block extends JComponent {

	private static final long serialVersionUID = -5715210003243521058L;

	private int mouse_x;
	private int mouse_y;
	
	private Color color;

	public Block() {
		color = Color.decode("#00AA00");
		/**
		 * add MouseListeners for movement
		 */
		motionSystem();
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		super.paint(g);
	}

	private void motionSystem() {
		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				mouse_x = e.getX();
				mouse_y = e.getY();
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				Block.this.setLocation(e.getXOnScreen() - mouse_x - Window.frame.getInsets().left,
						e.getYOnScreen() - mouse_y - Window.frame.getInsets().top);
			}
		});
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
