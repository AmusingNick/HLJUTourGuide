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
	public final String[] possibleValues = {"ѧ�����",
			"�������",
			"������",
			"��¥",
			"����",
			"����/��Ӿ��",
			"�˶���1",
			"ˮ��/ԡ��",
			"�Ļ��㳡",
			"������",
			"ͼ���",
			"1�Ž�ѧ¥",
			"ʵ��¥",
			"����԰����",
			"�˶���2",
			"����¥",
			"ѧ����������",
			"�ۺ�¥",
			"ӡˢ��",
			"��̬԰",
			"4�Ž�ѧ¥",
			"3�Ž�ѧ¥",
			"����԰��Ӿ��",
			"���ع㳡",
			"c17��117",};
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				Graphics g = bd.getJpDown().getComponent(0).getGraphics();
				PaintLinePause pl;
				Point p1;
				Point p2;
				JOptionPane jop;
				Object selectedValue = JOptionPane.showInputDialog(null, null, "", 1, null,  possibleValues, null);

			//��ͼ�и�������ת���ɸ�������		
			BFS test = new BFS();
			String getOne = "v26";
			String getTwo = "";
			for(int i=0;i<TellUserPosition.posi.length;i++){
				if(TellUserPosition.posi[i][3].equals(String.valueOf(selectedValue))){
					getTwo = TellUserPosition.posi[i][0];
					break;
				}
			}
			//�������ĵ�,��������
			Stack<String> AtoBPath = (test).GetPath((test).GetBFS(bd.getAmg(), getOne), getOne, getTwo);
			GetAtoBWeight getabWeight = new GetAtoBWeight();
			int countWeight = 0;
			while(!AtoBPath.empty()){
				p1 = TellUserPosition.IfWhere(AtoBPath.pop());
				if(!AtoBPath.empty())
					p2 = TellUserPosition.IfWhere(AtoBPath.peek());
				else
					p2 = TellUserPosition.IfWhere(getTwo);//ĩβ�c
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

