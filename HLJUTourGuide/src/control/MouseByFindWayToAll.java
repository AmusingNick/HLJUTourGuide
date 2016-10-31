package control;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.JOptionPane;

import model.AMGraph;
import persist.BFS;
import JFrame.BlockDemo;
import JFrame.MouseByImage;
import JFrame.PaintLineNoPause;
import JFrame.PaintLinePause;
import JFrame.TellUserPosition;

public class MouseByFindWayToAll implements ActionListener{
	private BlockDemo bd;
	public MouseByFindWayToAll(BlockDemo bd){
		this.bd = bd;
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				Graphics g = bd.getJpDown().getComponent(0).getGraphics();
				PaintLineNoPause pl;
				Point p1;
				Point p2;
				System.out.println("shabi");
				if(bd.getAcImage() instanceof MouseByImage){
					//��ͼ�и�������ת���ɸ�������
					MouseByImage mbi = (MouseByImage)bd.getAcImage();
					BFS test = mbi.getBfs();
					String getOne = TellUserPosition.IfWhere(new Point(2,2));
					
					//�ڿ���̨��ʾ��������
					BFS bfs = new BFS();
					for(int i=0;i<bd.getAmg().getVexNum()-1;i++){
						System.out.println("��"+(i+1));
						Stack<String> AtoBPath = (bfs).GetPath((bfs).GetBFS(bd.getAmg(), "v26"), "v26", "v"+(i+1));
						//�������ĵ�,��������
						while(!AtoBPath.empty()){
							p1 = TellUserPosition.IfWhere(AtoBPath.pop());
							if(!AtoBPath.empty())
								p2 = TellUserPosition.IfWhere(AtoBPath.peek());
							else
								p2 = TellUserPosition.IfWhere("v"+(i+1));//ĩβ�c
							pl = new PaintLineNoPause(p1,p2,g);
							pl.paint(g);
						}
						bfs.AtoB.clear();
						System.out.println("--------------------");
					}
				}else{
					JOptionPane jop = new JOptionPane();
					jop.showMessageDialog(null, "��ѡ����ʼ��,��ֹ��");
				}
	}

}
