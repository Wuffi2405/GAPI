package de.wuffitv.gapj.editor;

import java.util.ArrayList;

import de.wuffitv.gapj.editor.blocks.BlockOutput;

public class BlockManager {
	
	public static ArrayList<Block> blocks = new ArrayList<>();
	
	public BlockManager() {
		
	}
	
	public static void addBlock(BlockType blockType) {
		switch(blockType) {
		case BLOCK_OUTPUT:{
			BlockOutput blockOutput = new BlockOutput();
			blockOutput.setBounds(20, 20, 300, 60);
			Window.frame.add(blockOutput);
			Window.refreshWindow();
			BlockManager.blocks.add(blockOutput);
			break;
		}
		default:
			break;
		}
//		blocks.add(block);
	}
	
}
