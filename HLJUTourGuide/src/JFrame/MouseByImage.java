package JFrame;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import persist.BFS;
import persist.RealPath;

public class MouseByImage implements MouseListener{

	private BlockDemo bd;
	private int tempX;
	private int tempY;
	private int clickedImage = 0;
	private Point pOne ;
	private Point pTwo ;
	private BFS bfs;
	private RealPath rp;
	public RealPath getRp() {
		return rp;
	}
	public void setRp(RealPath rp) {
		this.rp = rp;
	}
	//private Stack<String> AtoBPath = new Stack();
	public MouseByImage(BlockDemo bd){
		this.bd = bd;
	}
	public MouseByImage(){}
	
	public BFS getBfs() {
		return bfs;
	}
	public void setBfs(BFS bfs) {
		this.bfs = bfs;
	}
	public Point getpOne() {
		return pOne;
	}
	public void setpOne(Point pOne) {
		this.pOne = pOne;
	}
	public Point getpTwo() {
		return pTwo;
	}
	public void setpTwo(Point pTwo) {
		this.pTwo = pTwo;
	}
	public void mouseClicked(MouseEvent e) {
		/*System.out.println("e.getX():"+);
		System.out.println("e.getY():"+e.getY());*/
		if(TellUserPosition.IfWhere(e.getX(),e.getY())!=null){
			System.out.println("选中节点:");
			System.out.println(TellUserPosition.IfWhere(e.getX(), e.getY())[5]+":"+e.getX()+" "+e.getY());
		}else{
			System.out.println("x:"+e.getX()+" "+"y:"+e.getY());
		}
		if(e.getClickCount()==1){
			Graphics g = bd.getJpDown().getComponent(0).getGraphics();
			if(e.getModifiers()==16&&(clickedImage<2)){
				if(TellUserPosition.IfWhere(e.getX(),e.getY())!=null){
					String[] position = TellUserPosition.IfWhere(e.getX(),e.getY());
					PaintRect p = new PaintRect("NoHas",Integer.parseInt(position[3]),Integer.parseInt(position[4]),Integer.parseInt(position[1]),Integer.parseInt(position[2]));
					p.paint(g);
					clickedImage++;
					bd.setSelectedSpotCount(clickedImage);   //显示景点介绍那边的
					if(clickedImage==1){
						pOne = p.GetOnePoint();
						//BFS路径.
						bfs = new BFS();
						rp = new RealPath();
						bd.setSelectedXCenter((int)pOne.getX());
						bd.setSelectedYCenter((int)pOne.getY());
					}
					if(clickedImage==2){
						pTwo = p.GetOnePoint();
					}
				}
			}
			if((e.getModifiers()==4&&(clickedImage<=2))){
				bd.getJpDown().getComponent(0).update(g);
				clickedImage= 0;
			}
		}
		if(e.getClickCount()==2){
			TellUserPosition tup = new TellUserPosition(e.getX(), e.getY());
		}
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
