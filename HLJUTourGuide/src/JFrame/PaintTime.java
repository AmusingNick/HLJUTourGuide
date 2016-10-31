package JFrame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Time;
import java.util.Date;

import javax.swing.JFrame;

public class PaintTime extends JFrame{
	int x;
	int y;
	public PaintTime(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		super.paint(g2d);
		g2d.setColor(Color.gray);
		g2d.setStroke(new BasicStroke(4f));
		
		Date d = new Date();
		String[] date = d.toString().split(" ");
		for(int i=0;i<date.length;++i){
			System.out.println(date[i]);
		}
		for(int i=0;i<month.length;i++){
			if(date[1].equals(month[i][0])){
				g2d.drawString(date[5]+"年"+month[i][1]+date[2]+"日", x, y+20);
				break;
			}
		}
		g2d.drawString(date[3], x, y);
	}
	
	private String [][]month = new String[][]{{"Jan","一月"},
			{"Feb","二月"},
			{"Mar","三月"},
			{"Apr","四月"},
			{"May","五月"},
			{"Jun","六月"},
			{"Jul","七月"},
			{"Aug","八月"},
			{"Sep","九月"},
			{"Oct","十月"},
			{"Nov","十一月"},
			{"Dec","十二月"},
			};
}
