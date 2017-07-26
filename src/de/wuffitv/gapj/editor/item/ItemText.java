package de.wuffitv.gapj.editor.item;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class ItemText extends JLabel {
	
	private static final long serialVersionUID = 6691693670987886462L;

	public ItemText(String text, int x, int y, int width, int height) {
		setText(text);
		setBounds(x, y, width, height);
		
		setFont(new Font("Calibri", Font.BOLD, 24));
		setForeground(Color.BLACK);
	}
	
}
