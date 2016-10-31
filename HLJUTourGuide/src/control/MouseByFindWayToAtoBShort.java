package control;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.LinkedBlockingQueue;

import javax.swing.JOptionPane;

import persist.GetAtoBWeight;
import persist.RealPath;
import sun.misc.Queue;
import JFrame.BlockDemo;
import JFrame.MouseByImage;
import JFrame.PaintLinePause;
import JFrame.TellUserPosition;

public class MouseByFindWayToAtoBShort implements ActionListener{
	private BlockDemo bd;
	public MouseByFindWayToAtoBShort(BlockDemo bd){
		this.bd = bd;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Graphics g = bd.getJpDown().getComponent(0).getGraphics();
				PaintLinePause pl;
				Point p1;
				Point p2;
				JOptionPane jop;
				if(bd.getAcImage() instanceof MouseByImage){
					//��ͼ�и�������ת���ɸ�������
					MouseByImage mbi = (MouseByImage)bd.getAcImage();
					RealPath rp = mbi.getRp();
					if((mbi.getpOne()!=null)&&(mbi.getpTwo()!=null)){
						String getOne = TellUserPosition.IfWhere(mbi.getpOne());
						String getTwo = TellUserPosition.IfWhere(mbi.getpTwo());
						
						//�ڿ���̨��ʾ��������
						Integer intOne = Integer.parseInt(getOne.split("v")[1]);
						Integer intTwo = Integer.parseInt(getTwo.split("v")[1]);
						rp.shortPath_DIJ(bd.getAmg(), intOne);
						java.util.Queue<String> AtoBPath = new LinkedBlockingQueue();
						AtoBPath = rp.GetStringAtoB(rp.GetAtoB(rp.getPath(),intOne,intTwo));
				
						GetAtoBWeight getabWeight = new GetAtoBWeight();
						int countWeight = 0;
						//�������ĵ�,��������
						while(!AtoBPath.isEmpty()){
							p1 = TellUserPosition.IfWhere(AtoBPath.poll());
							if(!AtoBPath.isEmpty())
								p2 = TellUserPosition.IfWhere(AtoBPath.peek());
							else
								p2 = TellUserPosition.IfWhere(getTwo);//ĩβ�c
							String pp1 = TellUserPosition.IfWhere(p1);
							String pp2 = TellUserPosition.IfWhere(p2);
							countWeight+=getabWeight.get(pp1, pp2, bd.getAmg());
							pl = new PaintLinePause(p1,p2,getabWeight.get(pp1, pp2, bd.getAmg()),g);
							pl.paint(g);
						}
						jop = new JOptionPane();
						jop.showMessageDialog(null, countWeight+"��Զ");
					}else{
						jop = new JOptionPane();
						jop.showMessageDialog(null, "��ѡ����ʼ��,��ֹ��");
					}
				}
	}

}
