package control;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import JFrame.BlockDemo;
import JFrame.PaintTime;
import JFrame.TellUserPosition;


public class MouseSpotInfo implements ActionListener{
	private BlockDemo bd;
	public MouseSpotInfo(BlockDemo bd){
		this.bd = bd;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("显示已选景点信息");
		if(bd.getSelectedSpotCount()==2){
			(new JOptionPane()).showMessageDialog(null, "必须只选中一个景点");
		}
		if(bd.getSelectedSpotCount()==1){
			TellUserPosition tup = new TellUserPosition(bd.getSelectedXCenter(), bd.getSelectedYCenter());
		}
	}
}

