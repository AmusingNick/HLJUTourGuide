package JFrame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;


public class PaintLineNoPause extends JFrame implements Runnable{
	//Point[0]为起始点,Point[1]为终止点
	public ArrayList<Point> ps = new ArrayList<Point>();
	public Graphics g;
	public int arcWeight=0;
	public PaintLineNoPause(){}
	public PaintLineNoPause(Point p1,Point p2,int arcWeight,Graphics g){
		ps.add(p1);
		ps.add(p2);
		this.arcWeight = arcWeight;
		this.g = g;
	}
	public PaintLineNoPause(Point p1,Point p2,Graphics g){
		ps.add(p1);
		ps.add(p2);
		this.g = g;
	}
	public PaintLineNoPause(MouseByImage mbi){
		ps.add(mbi.getpOne());
		ps.add(mbi.getpTwo());
	}
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		super.paint(g2d);
		g2d.setColor(Color.orange);
		g2d.setStroke(new BasicStroke(4.5f));
		this.run();
	}
	public void run() {
		// TODO Auto-generated method stub
		int x1 = (int)ps.get(0).getX();
		int y1 = (int)ps.get(0).getY();
		int x2 = (int)ps.get(1).getX();
		int y2 = (int)ps.get(1).getY();
		System.out.println("x1:"+x1);
		System.out.println("y1:"+y1);
		System.out.println("x2:"+x2);
		System.out.println("y2:"+y2);
		try {
			if(x1==42&&y1==309&&x2==76&&y2==81){//v26->v1
				int i=308;
				while(i>82){
					 
					g.drawLine(29,i--,29,308);
				}
				i = 32;
				while(i<40){
					 
					g.drawLine(29,81,i++,81);
				}
			}
			if(x2==42&&y2==309&&x1==76&&y1==81){//v1->v26
				int i=40;
				while(i>32){
					 
					g.drawLine(i--,81,29,81);
				}
				i=82;
				while(i<308){
					 
					g.drawLine(29,i++,29,82);
				}
			}
			
			if(x1==76&&y1==81&&x2==82&&y2==152){
				int i=81;
				while(i<142){
					 
					g.drawLine(36,81,36,i++);
				}
				
				System.out.println("1-2");//向下
			}
			if(x2==76&&y2==81&&x1==82&&y1==152){
				int i=142;
				while(i>81){
					 
					g.drawLine(36,142,36,i--);
				}
				System.out.println("2-1");//向上.
			}
			
			if(x1==82&&y1==152&&x2==82&&y2==214){
				int i=142;
				while(i<180){
					 
					g.drawLine(36,142,36,i++);
				}//36 142->	36 180 向下
				i = 36;
				while(i<124){
					 
					g.drawLine(36,184,i++,184);
				}//36 180->  124 180 向右
				
				//124 180 -> 124 250
				i = 180;
				while(i<250){
					 
					g.drawLine(126,180,126,i++);
				}
				
				i = 124;
				while(i>54){
					 
					g.drawLine(124,254,i--,254);
				}
				System.out.println("2-3");
			}
			if(x2==82&&y2==152&&x1==82&&y1==214){
				//向右,向上
				int i = 54;
				while(i<124){
					 
					g.drawLine(54,254,i++,254);
				}			
				i =250;
				while(i>180){
					 
					g.drawLine(126,250,126,i--);
				}
				i = 124;
				while(i>36){
					 
					g.drawLine(124,180,i--,180);
				}  //向左
				i=180;
				while(i>142){
					 
					g.drawLine(36,180,36,i--);
				}//向上
			}
			if(x1==42&&y1==309&&x2==82&&y2==214){
				int i=32;
				while(i<54){
					 
					g.drawLine(32,306,i++,306);
				}  
				i=306;
				while(i>254){
					 
					g.drawLine(54,306,54,i--);
				}
			} 
			if(x2==42&&y2==309&&x1==82&&y1==214){
				int i=254;
				while(i<306){
					 
					g.drawLine(54,254,54,i++);
				}
				i = 54;
				while(i>32){
					 
					g.drawLine(54,306,i--,306);
				} 
			} 
			if(x1==82&&y1==152&&x2==42&&y2==309){
				int i=148;
				while(i<306){
					 
					g.drawLine(36,148,36,i++);
				}
			} 
			if(x2==82&&y2==152&&x1==42&&y1==309){
				int i=306;
				while(i>148){
					 
					g.drawLine(36,306,36,i--);
				}
			} 
			if(x1==128&&y1==309&&x2==42&&y2==309){
				int i = 83;
				while(i>36){
					 
					g.drawLine(83,306,i--,306);
				} 
			} 
			if(x2==128&&y2==309&&x1==42&&y1==309){
				int i = 36;
				while(i<83){
					 
					g.drawLine(36,306,i++,306);
				}
				System.out.println("26-4");
			} 
			if(x1==111&&y1==406&&x2==42&&y2==309){
				int i = 108;
				while(i>54){
					 
					g.drawLine(108,363,i--,363);
				}
				
				i=363;
				while(i>306){
					 
					g.drawLine(54,363,54,i--);
				}  
				i = 54;
				while(i>32){
					 
					g.drawLine(54,306,i--,306);
				}       
			} 
			if(x2==111&&y2==406&&x1==42&&y1==309){
				int i=32;
				while(i<54){
					 
					g.drawLine(32,306,i++,306);
				} 
				i=306;
				while(i<363){
					 
					g.drawLine(54,306,54,i++);
				}
				i = 54;
				while(i<108){
					 
					g.drawLine(54,363,i++,363);
				}
			} 
			if(x1==82&&y1==214&&x2==128&&y2==309){
				int i = 54;
				while(i<87){
					 
					g.drawLine(54,253,i++,253);
				}
				i=253;
				while(i<311){
					 
					g.drawLine(87,253,87,i++);
				}
			} 
			if(x2==82&&y2==214&&x1==128&&y1==309){
				int i=311;
				while(i>253){
					 
					g.drawLine(87,311,87,i--);
				}
				i = 87;
				while(i>54){
					 
					g.drawLine(87,253,i--,253);
				}
				System.out.println("4-3");
			} 
			if(x1==82&&y1==214&&x2==206&&y2==223){
				int i = 54;
				while(i<208){
					 
					g.drawLine(54,253,i++,253);
				}
				System.out.println("3-6");
			} 
			if(x2==82&&y2==214&&x1==206&&y1==223){
				int i = 208;
				while(i>54){
					 
					g.drawLine(208,253,i--,253);
				}
				System.out.println("6-3");
			} 
			if(x1==128&&y1==309&&x2==206&&y2==223){
				int i=311;
				while(i>253){
					 
					g.drawLine(87,311,87,i--);
				}
				i = 87;
				while(i<208){
					 
					g.drawLine(87,253,i++,253);
				}
			} 
			if(x2==128&&y2==309&&x1==206&&y1==223){
				int i = 208;
				while(i>87){
					 
					g.drawLine(208,253,i--,253);
				}
				i=253;
				while(i<311){
					 
					g.drawLine(87,253,87,i++);
				}
				System.out.println("6-4");
			} 
			if(x1==128&&y1==309&&x2==205&&y2==305){
				int i=311;
				while(i>253){
					 
					g.drawLine(87,311,87,i--);
				}
				i = 87;
				while(i<171){
					 
					g.drawLine(87,253,i++,253);
				}
				i=253;
				while(i<305){
					 
					g.drawLine(171,253,171,i++);
				}
				System.out.println("4-7");
			} 
			if(x2==128&&y2==309&&x1==205&&y1==305){
				int i=305;
				while(i>253){
					 
					g.drawLine(171,305,171,i--);
				}
				i = 171;
				while(i>87){
					 
					g.drawLine(171,253,i--,253);
				}
				i=253;
				while(i<311){
					 
					g.drawLine(87,253,87,i++);
				}
				System.out.println("7-4");
			} 
			if(x1==128&&y1==309&&x2==111&&y2==406){
				int i=311;
				while(i<363){
					 
					g.drawLine(87,311,87,i++);
				}
				i = 87;
				while(i<108){
					 
					g.drawLine(87,363,i++,363);
				}
				System.out.println("4-5");
			} 
			if(x2==128&&y2==309&&x1==111&&y1==406){

				int i = 108;
				while(i>87){
					 
					g.drawLine(87,363,i--,363);
				}
				i=363;
				while(i>311){
					 
					g.drawLine(87,311,87,i--);
				}
				System.out.println("5-4");
			} 
			if(x1==111&&y1==406&&x2==202&&y2==396){
				int i = 87;
				while(i<207){
					 
					g.drawLine(87,363,i++,363);
				}
				System.out.println("5-8");
			} 
			if(x2==111&&y2==406&&x1==202&&y1==396){
				int i = 207;
				while(i>87){
					 
					g.drawLine(207,363,i--,363);
				}
				System.out.println("8-5");
			} 
			if(x1==111&&y1==406&&x2==207&&y2==487){
				
				int i = 87;
				while(i<170){
					 
					g.drawLine(87,363,i++,363);
				}
				i =364;
				while(i<470){
					 
					g.drawLine(170,364,170,i++);
				}
				System.out.println("5-9");
			} 
			if(x2==111&&y2==406&&x1==207&&y1==487){
				/*170,364,170,470 shang
				 * 
				87,363,170,363  you*/
				int i=470;
				while(i>363){
					 
					g.drawLine(170,470,170,i--);
				}
				i = 170;
				while(i>87){
					 
					g.drawLine(170,363,i--,363);
				}
				System.out.println("9-5");
			} 
		//	pp1v5 p1:java.awt.Point[x=111,y=406]
		//			pp2v9 p2:java.awt.Point[x=207,y=487]
			if(x1==206&&y1==223&&x2==205&&y2==305){
				int i = 208;
				while(i>171){
					 
					g.drawLine(208,253,i--,253);
				}		
				i=253;
				while(i<305){
					 
					g.drawLine(171,253,171,i++);
				}
				System.out.println("6-7");
			} 
			if(x2==206&&y2==223&&x1==205&&y1==305){
				int i=311;
				while(i>253){
					 
					g.drawLine(171,305,171,i--);
				}
				i = 171;
				while(i<208){
					 
					g.drawLine(171,253,i++,253);
				}
				System.out.println("7-6");
			} 
		//	pp1v6 p1:java.awt.Point[x=206,y=223]
		//			pp2v7 p2:java.awt.Point[x=205,y=305]
			if(x1==206&&y1==223&&x2==277&&y2==223){
				/*x:208  y:253 ->x:251y:252 向右*/
				Right(g,208,253,251,252);
				Up(g,251,252,251,218);
			} 
			if(x2==206&&y2==223&&x1==277&&y1==223){
				Down(g,251,218,252,251);
				Left(g,251,252,208,253);
			} 
			if(x1==205&&y1==305&&x2==278&&y2==277){
				 Up(g,171,305,172,254);
				 Right(g,172,254,244,252);
				 Down(g,244,252,245,283);
				System.out.println("7-11");
			} 
			if(x2==205&&y2==305&&x1==278&&y1==277){
				 Up(g,245,283,244,252);
				 Left(g,244,252,172,254);
				 Down(g,172,254,171,305);
				System.out.println("11-7");
			} 
		//	pp1v7 p1:java.awt.Point[x=205,y=305]
		//			pp2v11 p2:java.awt.Point[x=278,y=277]
			if(x1==205&&y1==305&&x2==202&&y2==396){
				Down(g,171,305,170,362);
				Right(g,170,362,207,362);
				System.out.println("7-8");
			} 
			if(x2==205&&y2==305&&x1==202&&y1==396){
				Left(g,207,362,170,362);
				Up(g,170,362,171,305);
				System.out.println("8-7");
			} 
		//	pp1v8 p1:java.awt.Point[x=202,y=396]
		//			pp2v7 p2:java.awt.Point[x=205,y=305]
			if(x1==202&&y1==396&&x2==280&&y2==340){
				Right(g,207,362,244,362);
				Up(g,244,362,245,329);
				Right(g,245,329,258,329);
				System.out.println("8-12");
			} 
			if(x2==202&&y2==396&&x1==280&&y1==340){
				Left(g,258,329,245,329);
				Down(g,245,329,244,362);
				Left(g,244,362,207,362);
				System.out.println("12-8");
			} 
		//	pp1v12 p1:java.awt.Point[x=280,y=340]
		//			pp2v8 p2:java.awt.Point[x=202,y=396]
			if(x1==202&&y1==396&&x2==315&&y2==397){
				Right(g,207,362,317,362);
				System.out.println("8-13");
			} 
			if(x2==202&&y2==396&&x1==315&&y1==397){
				Left(g,317,362,207,362);
				System.out.println("13-8");
			} 
		//	pp1v8 p1:java.awt.Point[x=202,y=396]
		//			pp2v13 p2:java.awt.Point[x=315,y=397]
			if(x1==202&&y1==396&&x2==207&&y2==487){
				Left(g,207,362,171,364);
				Down(g,171,364,169,470);
				System.out.println("8-9");
			} 
			if(x2==202&&y2==396&&x1==207&&y1==487){
				Up(g,169,470,171,364);
				Right(g,171,364,207,362);
				System.out.println("9-8");
			} 
		//	pp1v8 p1:java.awt.Point[x=202,y=396]
		//			pp2v9 p2:java.awt.Point[x=207,y=487]
			if(x1==207&&y1==487&&x2==301&&y2==488){
				Up(g,169,470,170,434);
				Right(g,170,434,292,433);
				System.out.println("9-14");
			} 
			if(x2==207&&y2==487&&x1==301&&y1==488){
				Left(g,292,433,170,434);
				Down(g,170,434,169,470);
				System.out.println("14-9");
			} 
		//	pp1v9 p1:java.awt.Point[x=207,y=487]
		//			pp2v14 p2:java.awt.Point[x=301,y=488]
			if(x1==277&&y1==223&&x2==278&&y2==277){
				/*10  x:251  y:218->x:252 y:252 下
				x:252 y:252-> x:245 y:253右
				x:245 y:253->x:245 y:283 下*/
				Down(g,251,218,252,252);
				Right(g,252,252,245,253);
				Down(g,245,253,245,283);
				System.out.println("10-11");
			} 
			if(x2==277&&y2==223&&x1==278&&y1==277){
				Up(g,245,283,245,253);
				Left(g,245,253,252,252);
				Up(g,252,252,251,218);
				System.out.println("11-10");
			} 

			if(x1==277&&y1==223&&x2==342&&y2==292){
				Down(g,251,218,252,246);
				Right(g,252,246,306,244);
				System.out.println("10-15");
			} 
			if(x2==277&&y2==223&&x1==342&&y1==292){
				Left(g,306,244,252,246);
				Up(g,252,246,251,218);
				System.out.println("15-10");
			} 
	
			if(x1==278&&y1==277&&x2==280&&y2==340){
				Down(g,245,283,245,330);
				Right(g,245,330,258,329);
				System.out.println("11-12");
			} 
			if(x2==278&&y2==277&&x1==280&&y1==340){
				Left(g,258,329,245,330);
				Up(g,245,330,245,283);
				System.out.println("12-11");
			} 
		//	pp1v11 p1:java.awt.Point[x=278,y=277]
		//			pp2v12 p2:java.awt.Point[x=280,y=340]
			if(x1==278&&y1==277&&x2==342&&y2==292){
				Down(g,245,283,245,317);
				Right(g,245,317,306,314);
				System.out.println("11-15");
			} 
			if(x2==278&&y2==277&&x1==342&&y1==292){
				Left(g,306,314,245,317);
				Up(g,245,317,245,283);
				System.out.println("15-11");
			} 
		//	pp1v11 p1:java.awt.Point[x=278,y=277]
		//			pp2v15 p2:java.awt.Point[x=342,y=292]
			
			
			
			
			if(x1==280&&y1==340&&x2==315&&y2==397){
				/*258 329->x:245 y:329  向左
				x:245 y:329->x:244 y:363  向下
				x:244 y:363->:x:317 y:362 向右*/ 
				Left(g,258,329,245,329);
				Down(g,245,329,244,363);
				Right(g,244,363,317,362);
				System.out.println("12-13");
			} 
			if(x2==280&&y2==340&&x1==315&&y1==397){
				Left(g,317,362,244,363);
				Up(g,244,363,245,329);
				Right(g,245,329,258,329);
				System.out.println("13-12");
			} 
		//	pp1v12 p1:java.awt.Point[x=280,y=340]
		//			pp2v13 p2:java.awt.Point[x=315,y=397]
			if(x1==315&&y1==397&&x2==342&&y2==292){
				/*:x:317 y:362->x:319 y:339 向上*/
				Up(g,317,362,319,339);
				System.out.println("13-15");
			} 
			if(x2==315&&y2==397&&x1==342&&y1==292){
				Down(g,319,339,317,362);
				System.out.println("15-13");
			} 
	
			if(x1==315&&y1==397&&x2==395&&y2==451){
				/*x:317 y:362->x:339 y:363  向右
				x:339 y:363->x:337 y:434 向下
				x:337 y:434->x:365 y:435 向右*/
				Right(g,317,362,339,363);
				Down(g,339,363,337,434);
				Right(g,337,434,365,435);
				System.out.println("13-17");
			} 
			if(x2==315&&y2==397&&x1==395&&y1==451){
				Left(g,365,435,337,434);
				Up(g,337,434,339,363);
				Left(g,339,363,317,362);
				System.out.println("17-13");
			} 
		//	pp1v13 p1:java.awt.Point[x=315,y=397]
		//			pp2v17 p2:java.awt.Point[x=395,y=451]
			if(x1==315&&y1==397&&x2==301&&y2==488){
				Left(g,317,362,292,363);
				Down(g,292,363,292,431);
				System.out.println("13-14");
			} 
			if(x2==315&&y2==397&&x1==301&&y1==488){
				Up(g,292,431,292,363);
				Right(g,292,363,317,362);
				System.out.println("14-13");
			} 
		//	pp1v14 p1:java.awt.Point[x=301,y=488]
		//			pp2v13 p2:java.awt.Point[x=315,y=397]
			if(x1==301&&y1==488&&x2==395&&y2==451){
				/*14->x:365 y:433  向左*/
				Right(g,292,433,365,433);
				System.out.println("14-17");
			} 
			if(x2==301&&y2==488&&x1==395&&y1==451){
				Left(g,365,433,292,431);
				System.out.println("17-14");
			} 
		//	pp1v14 p1:java.awt.Point[x=301,y=488]
		//			pp2v17 p2:java.awt.Point[x=395,y=451]
			if(x1==342&&y1==292&&x2==410&&y2==284){
				Right(g,385,333,449,333);
				Up(g,449,333,450,288);
				System.out.println("15-16");
			} 
			if(x2==342&&y2==292&&x1==410&&y1==284){
				/*x:450 y:288->x:449 y:337  xiangxia
				x:449 y:337->x:366 y:346          xiangzuo*/
				Down(g,450,288,449,333);
				Left(g,449,333,385,333);
				System.out.println("16-15");
			} 
		//	pp1v15 p1:java.awt.Point[x=342,y=292]
		//			pp2v16 p2:java.awt.Point[x=410,y=284]
			if(x1==410&&y1==284&&x2==525&&y2==194){
				
				Right(g,450,288,482,288);
				Up(g,482,288,482,197);
				Right(g,482,197,492,195);
				System.out.println("16-20");
			} 
			if(x2==410&&y2==284&&x1==525&&y1==194){
				Left(g,492,195,482,197);
				Down(g,482,197,482,288);
				Left(g,482,288,450,288);
				System.out.println("20-16");
			} 
		//	pp1v16 p1:java.awt.Point[x=410,y=284]
		//			pp2v20 p2:java.awt.Point[x=525,y=194]
			if(x1==548&&y1==90&&x2==525&&y2==194){
				Left(g,553,123,492,123);
				Down(g,492,123,494,196);
				System.out.println("19-20");
			} 
			if(x2==548&&y2==90&&x1==525&&y1==194){
				Up(g,494,196,492,123);
				Right(g,492,123,553,123);
				System.out.println("20-19");
			} 
		//	pp1v20 p1:java.awt.Point[x=525,y=194]
			//		pp2v19 p2:java.awt.Point[x=548,y=90]
			if(x1==410&&y1==284&&x2==450&&y2==446){
				Right(g,450,288,479,288);
				Down(g,479,288,479,427);
				System.out.println("16-18");
			} 
			if(x2==410&&y2==284&&x1==450&&y1==446){
				Up(g,479,427,479,288);
				Left(g,479,288,450,288);
				System.out.println("18-16");
			} 
		//	pp1v16 p1:java.awt.Point[x=410,y=284]
			//		pp2v18 p2:java.awt.Point[x=450,y=446]
			if(x1==395&&y1==451&&x2==450&&y2==446){
				/*x:365 y:433->x:477 y:427  向右*/
				Right(g,365,424,477,424);
				System.out.println("17-18");} 
			if(x2==395&&y2==451&&x1==450&&y1==446){
				Left(g,477,424,365,424);
				System.out.println("18-17");} 
		//	pp1v17 p1:java.awt.Point[x=395,y=451]
		//			pp2v18 p2:java.awt.Point[x=450,y=446]
			if(x1==450&&y1==446&&x2==543&&y2==413){
				Up(g,477,427,477,398);
				Right(g,477,398,543,398);
				System.out.println("18-21");
			} 
			if(x2==450&&y2==446&&x1==543&&y1==413){
				Left(g,543,398,477,398);
				Down(g,477,398,477,427);
				System.out.println("21-18");
			} 
		//	pp1v18 p1:java.awt.Point[x=450,y=446]
		//			pp2v21 p2:java.awt.Point[x=543,y=413]
			if(x1==450&&y1==446&&x2==514&&y2==477){
				Right(g,477,434,555,434);
				Down(g,555,434,553,466);
				System.out.println("18-22");
			} 
			if(x2==450&&y2==446&&x1==514&&y1==477){
				Up(g,555,466,553,434);
				Left(g,555,434,477,434);
				System.out.println("22-18");
			} 
		//	pp1v18 p1:java.awt.Point[x=450,y=446]
		//			pp2v22 p2:java.awt.Point[x=514,y=477]
			if(x1==543&&y1==413&&x2==514&&y2==477){
				Down(g,555,434,553,466);
				System.out.println("21-22");
			} 
			if(x2==543&&y2==413&&x1==514&&y1==477){
				Up(g,555,466,553,434);
				System.out.println("22-21");
			} 
		//	pp1v21 p1:java.awt.Point[x=543,y=413]
			//		pp2v22 p2:java.awt.Point[x=514,y=477]
			if(x1==543&&y1==413&&x2==641&&y2==461){
				Right(g,540,399,598,399);
				Down(g,598,399,598,450);
				System.out.println("21-23");
			} 
			if(x2==543&&y2==413&&x1==641&&y1==461){
				Up(g,598,450,598,399);
				Left(g,598,399,540,399);
				System.out.println("23-21");
			} 
		//	pp1v21 p1:java.awt.Point[x=543,y=413]
		//			pp2v23 p2:java.awt.Point[x=641,y=461]
			if(x1==514&&y1==477&&x2==641&&y2==461){
				Up(g,555,466,553,440);
				Right(g,553,440,598,440);
				System.out.println("22-23");
			} 
			if(x2==514&&y2==477&&x1==641&&y1==461){
				Left(g,598,440,553,440);
				Down(g,555,440,553,466);
				System.out.println("23-22");
			} 
		//	pp1v22 p1:java.awt.Point[x=514,y=477]
		//			pp2v23 p2:java.awt.Point[x=641,y=461]
			if(x1==641&&y1==461&&x2==736&&y2==452){
				Right(g,598,440,677,440);
				System.out.println("23-24");
				} 
			if(x2==641&&y2==461&&x1==736&&y1==452){
				Left(g,677,440,598,440);
				System.out.println("24-23");
			} 
		//	pp1v23 p1:java.awt.Point[x=641,y=461]
			//		pp2v24 p2:java.awt.Point[x=736,y=452]
			if(x1==736&&y1==452&&x2==839&&y2==380){
				Right(g,784,411,808,411);
				Up(g,808,411,809,363);
				Right(g,809,363,816,362);
				System.out.println("24-25");
			} 
			if(x2==736&&y2==452&&x1==839&&y1==380){
				Left(g,816,362,809,363);
				Down(g,809,363,808,411);
				Left(g,808,411,784,411);
				System.out.println("25-24");
			} 
			//pp1v24 p1:java.awt.Point[x=736,y=452]
			//		pp2v25 p2:java.awt.Point[x=839,y=380]	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//向右
	private static void Right(Graphics g,int thisX,int thisY,int goX,int goY) throws InterruptedException{
		int i = thisX;
		while(i<goX){
			 
			g.drawLine(thisX,thisY,i++,goY);
		}
	}
	//向左
	private static void Left(Graphics g,int thisX,int thisY,int goX,int goY) throws InterruptedException{
		int i = thisX;
		while(i>goX){
			 
			g.drawLine(thisX,thisY,i--,goY);
		}
	}
	//向上
	private static void Up(Graphics g,int thisX,int thisY,int goX,int goY) throws InterruptedException{
		int i=thisY;
		while(i>goY){
			 
			g.drawLine(thisX,thisY,goX,i--);
		}
	}
	//向下
	private static void Down(Graphics g,int thisX,int thisY,int goX,int goY) throws InterruptedException{
		int i=thisY;
		while(i<goY){
			 
			g.drawLine(thisX,thisY,goX,i++);
		}
	}
}


