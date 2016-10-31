package JFrame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class PaintRect extends JFrame{
	int X;
	int Y;    //ÆðÊ¼µãX,Y
	int weight; 
	int height;
	int xCenter;
	int yCenter;
	String ifHasRect;
	public PaintRect(String ifHasRect,int x,int y,int weight,int height){
		this.ifHasRect =  ifHasRect;
		this.X = x;
		this.Y = y;
		this.weight = weight;
		this.height = height;
	}
	public PaintRect(String ifHasRect,int xCenter,int yCenter){
		this.ifHasRect =  ifHasRect;
		this.xCenter = xCenter;
		this.yCenter = yCenter;
	}
	public PaintRect(){
		
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		super.paint(g2d);
		g2d.setColor(Color.red);
		g2d.setStroke(new BasicStroke(2f));
		File f = new File("src/Image/th.jpg");
		try {
			BufferedImage bImage = ImageIO.read(f);
			int positionX = X+weight/2 - bImage.getWidth()/2;
			int positionY = Y+height/2 - bImage.getHeight()/2;
			g.drawImage(bImage,positionX,positionY,null);
			if(xCenter!=0&&yCenter!=0){
				g.drawImage(bImage,xCenter,yCenter,null);
				g.drawRect(xCenter,yCenter, 18, 18);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Point GetOnePoint(){
		File f = new File("src/Image/th.jpg");
		try {
			BufferedImage bImage = ImageIO.read(f);
			int positionX = X+weight/2 - bImage.getWidth()/2;
			int positionY = Y+height/2 - bImage.getHeight()/2;
			Point p = new Point(positionX,positionY);
			return p;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}

