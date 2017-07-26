package de.wuffitv.gapj.editor.blocks;

import java.awt.Color;

import javax.swing.BorderFactory;

import de.wuffitv.gapj.editor.Block;
import de.wuffitv.gapj.editor.item.ItemInputField;
import de.wuffitv.gapj.editor.item.ItemSwitch;
import de.wuffitv.gapj.editor.item.ItemText;

public class BlockOutput extends Block {

	private static final long serialVersionUID = 2169014093140398918L;

	private ItemInputField item_pin;
	private ItemText item_text;
	private ItemSwitch item_switch;

	public BlockOutput() {
//		setBounds(0, 0, 300, 60);
		setColor(Color.decode("#AA0000"));
		setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLACK));
		
		item_text = new ItemText("pinWrite", 20, 20, 100, 20);
		item_pin = new ItemInputField(120, 20, 20, 20);
		item_switch = new ItemSwitch(144, 20, 50, 20);
		add(item_text);
		add(item_pin);
		add(item_switch);
	}
	
}
