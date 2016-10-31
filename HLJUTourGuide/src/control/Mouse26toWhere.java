package control;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JOptionPane;

import persist.BFS;
import persist.GetAtoBWeight;
import JFrame.BlockDemo;
import JFrame.MouseByImage;
import JFrame.PaintLinePause;
import JFrame.PaintTime;
import JFrame.TellUserPosition;


public class Mouse26toWhere implements ActionListener{
	private BlockDemo bd;
	public Mouse26toWhere(BlockDemo bd){
		this.bd = bd;
	}
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
			"c17南117",};
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				Graphics g = bd.getJpDown().getComponent(0).getGraphics();
				PaintLinePause pl;
				Point p1;
				Point p2;
				JOptionPane jop;
				Object selectedValue = JOptionPane.showInputDialog(null, null, "", 1, null,  possibleValues, null);

			//将图中各个东西转换成各个数据		
			BFS test = new BFS();
			String getOne = "v26";
			String getTwo = "";
			for(int i=0;i<TellUserPosition.posi.length;i++){
				if(TellUserPosition.posi[i][3].equals(String.valueOf(selectedValue))){
					getTwo = TellUserPosition.posi[i][0];
					break;
				}
			}
			//将经过的点,进行相连
			Stack<String> AtoBPath = (test).GetPath((test).GetBFS(bd.getAmg(), getOne), getOne, getTwo);
			GetAtoBWeight getabWeight = new GetAtoBWeight();
			int countWeight = 0;
			while(!AtoBPath.empty()){
				p1 = TellUserPosition.IfWhere(AtoBPath.pop());
				if(!AtoBPath.empty())
					p2 = TellUserPosition.IfWhere(AtoBPath.peek());
				else
					p2 = TellUserPosition.IfWhere(getTwo);//末尾點
				String pp1 = TellUserPosition.IfWhere(p1);
				String pp2 = TellUserPosition.IfWhere(p2);
				countWeight+=getabWeight.get(pp1, pp2, bd.getAmg());
				System.out.println("pp1"+pp1+" "+"p1:"+p1);
				System.out.println("pp2"+pp2+" "+"p2:"+p2);
				pl = new PaintLinePause(p1,p2,getabWeight.get(pp1, pp2, bd.getAmg()),g);
				pl.paint(g);
			}
	}
}

