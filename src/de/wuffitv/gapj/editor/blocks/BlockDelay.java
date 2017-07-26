package de.wuffitv.gapj.editor.blocks;

import java.awt.Color;

import javax.swing.BorderFactory;

import de.wuffitv.gapj.editor.Block;
import de.wuffitv.gapj.editor.item.ItemInputField;
import de.wuffitv.gapj.editor.item.ItemText;

public class BlockDelay extends Block {
	
	private static final long serialVersionUID = 7836450291509339136L;

	public BlockDelay() {
		setColor(Color.decode("#AA0000"));
		setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
		
		ItemText itemText = new ItemText("Delay", 20, 20, 100, 20);
		ItemInputField itemTime = new ItemInputField(120, 20, 40, 20);
		add(itemText);
		add(itemTime);
	}
	
}
