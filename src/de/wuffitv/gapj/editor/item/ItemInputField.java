package de.wuffitv.gapj.editor.item;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class ItemInputField extends JTextField {

	private static final long serialVersionUID = -6428217031444041042L;

	public ItemInputField(int x, int y, int width, int height) {
		setBounds(x, y, width, height);
		
		setBorder(null);
		setHorizontalAlignment(CENTER);
		
		setFont(new Font("Calibri", Font.BOLD, 24));
		setForeground(Color.BLACK);
	}
	
	public static double getValue() {
		return Double.valueOf(ItemInputField.getValue());
	}

	
}
