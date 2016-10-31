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
			"c17��117",
			"����"};
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
					System.out.println("�ҵ�");
					PaintRect p = new PaintRect("has",Integer.parseInt(tup.posi[i][1]),Integer.parseInt(tup.posi[i][2]));
					p.paint(g);
					break;
				}
			}
			if(i==26){(new JOptionPane()).showMessageDialog(null, "�޴˾���");}
		}
	}

}
