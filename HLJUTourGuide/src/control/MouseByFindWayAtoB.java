package control;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.JOptionPane;

import persist.BFS;
import persist.GetAtoBWeight;
import JFrame.BlockDemo;
import JFrame.MouseByImage;
import JFrame.PaintLinePause;
import JFrame.TellUserPosition;

public class MouseByFindWayAtoB implements ActionListener{
	private BlockDemo bd;
	public MouseByFindWayAtoB(BlockDemo bd){
		this.bd = bd;
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Graphics g = bd.getJpDown().getComponent(0).getGraphics();
		PaintLinePause pl;
		Point p1;
		Point p2;
		JOptionPane jop;
		if(bd.getAcImage() instanceof MouseByImage){
			//将图中各个东西转换成各个数据
			MouseByImage mbi = (MouseByImage)bd.getAcImage();
			BFS test = mbi.getBfs();
			if((mbi.getpOne()!=null)&&(mbi.getpTwo()!=null)){
				String getOne = TellUserPosition.IfWhere(mbi.getpOne());
				String getTwo = TellUserPosition.IfWhere(mbi.getpTwo());
				
				//在控制台显示各项数据
				System.out.println("getOne:"+getOne+"  "+"getTwo:"+getTwo);
				test.ShowAllPath((test).GetBFS(bd.getAmg(), getOne));
				Stack<String> AtoBPath = (test).GetPath((test).GetBFS(bd.getAmg(), getOne), getOne, getTwo);
				for(String ab:AtoBPath){
					System.out.println(ab);
				}
				
				//将经过的点,进行相连
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
				jop = new JOptionPane();
				jop.showMessageDialog(null, countWeight+"米远");
			}else{
				jop = new JOptionPane();
				jop.showMessageDialog(null, "请选择起始点,终止点");
			}
		}
	}

}
