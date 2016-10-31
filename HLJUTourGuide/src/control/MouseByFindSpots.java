package control;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import JFrame.BlockDemo;
import JFrame.PaintRect;
import JFrame.TellUserPosition;

public class MouseByFindSpots implements ActionListener{
	private BlockDemo bd;
	public final String[] possibleValues = {"学府书店",
			"软件大厦",
			"体育馆",
			"主楼",
			"网球场",
			"篮球场/游泳馆",
			"运动场1",
			"水房/浴池",
			"文化广场",
			"音乐厅",
			"图书馆",
			"1号教学楼",
			"实验楼",
			"格致园餐厅",
			"运动场2",
			"汇文楼",
			"学生工作中心",
			"综合楼",
			"印刷厂",
			"生态园",
			"4号教学楼",
			"3号教学楼",
			"丽泽园游泳馆",
			"晨曦广场",
			"c17南117",
			"正门"};
	public MouseByFindSpots(BlockDemo bd){
		this.bd = bd;
	}
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		Object selectedValue = JOptionPane.showInputDialog(null, null, "", 1, null,  possibleValues, null);
		//System.out.println(selectedValue.toString());
		if(selectedValue!=null){
			Graphics g = bd.getJpDown().getComponent(0).getGraphics();
			TellUserPosition tup = new TellUserPosition();
			int i=0;
			for(i=0;i<tup.posi.length;i++){
				if((selectedValue.toString()).equals(tup.posi[i][3])){
					System.out.println("找到");
					PaintRect p = new PaintRect("has",Integer.parseInt(tup.posi[i][1]),Integer.parseInt(tup.posi[i][2]));
					p.paint(g);
					break;
				}
			}
			if(i==26){(new JOptionPane()).showMessageDialog(null, "无此景点");}
		}
	}

}
