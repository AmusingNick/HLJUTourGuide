package control;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import JFrame.BlockDemo;
import JFrame.PaintTime;

public class MousePaintTime implements ActionListener{
	private BlockDemo bd;
	public MousePaintTime(BlockDemo bd){
		this.bd = bd;
	}
	public void actionPerformed(ActionEvent e) {
		Graphics g = bd.getJpDown().getComponent(0).getGraphics();
		PaintTime pt = new PaintTime(700,100);
		pt.paint(g);
	}
}
