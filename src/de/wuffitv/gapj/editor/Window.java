package de.wuffitv.gapj.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import de.wuffitv.gapj.editor.blocks.BlockDelay;
import de.wuffitv.gapj.editor.blocks.BlockOutput;

public class Window {

	public static JFrame frame;

	public Window() {
		frame = new JFrame("GAPJ");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(null);

		GraphicUserInterface(frame);
		
		frame.setVisible(true);
	}

	public void GraphicUserInterface(JFrame frame) {
		JButton button = new JButton("Exit");
		button.setBounds(500, 50, 100, 50);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button.setFocusable(false);
		frame.add(button);
		
		JButton button_add = new JButton("Add");
		button_add.setBounds(400, 50, 100, 50);
		button_add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				BlockManager.addBlock(BlockType.BLOCK_OUTPUT);
			}
		});
		frame.add(button_add);
		
//		Block block = new Block();
//		block.setBounds(0, 50, 200, 100);
//		frame.add(block);
		
		BlockOutput pinMode = new BlockOutput();
		pinMode.setBounds(20, 20, 300, 60);
		frame.add(pinMode);
		
		BlockDelay blockDelay = new BlockDelay();
		blockDelay.setBounds(0, 0, 300, 60);
		frame.add(blockDelay);
		
	}
	
	public static void refreshWindow() {
		Window.frame.pack();
		Window.frame.setSize(800, 600);
	}
	
}
