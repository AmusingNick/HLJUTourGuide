package JFrame;

import java.awt.Point;

import javax.swing.JOptionPane;

public class TellUserPosition {
	private int X;
	private int Y;
	public TellUserPosition(int x,int y){
		this.ShowPosition(x,y);
	}
	public TellUserPosition(){}
	public void ShowPosition(int x,int y){
		JOptionPane jop = new JOptionPane();
		if((this).IfWhere(x,y)!=null){
			String positionName = (this).IfWhere(x,y)[0]+(this).IfWhere(x,y)[5];
			jop.showMessageDialog(null, positionName);
		}
		else
			jop.showMessageDialog(null, "�˵���ֵ");
	}
	public static String[] IfWhere(int x,int y){
		//����һ��String��������:String[0]Ϊ�ص�����,String[1]Ϊ�ص㳤,String[2]Ϊ�ص��
		//String[3]Ϊ��ʼ��X,String[4]Ϊ��ʼ��Y
		//String[5]Ϊ�㷨���
		String positionInfo[] = new String[6];
		if(x>40&&x<116&&y>64&&y<104){
			positionInfo[0] ="ѧ�����";
			positionInfo[1] = "76";
			positionInfo[2] = "40";
			positionInfo[3] = "40";
			positionInfo[4] = "64";
			positionInfo[5] = "v1";
			return positionInfo;
		}else if(x>41&&x<123&&y>185&&y<246){
			positionInfo[0] ="������";
			positionInfo[1] = "82";
			positionInfo[2] = "61";
			positionInfo[3] = "41";
			positionInfo[4] = "185";
			positionInfo[5] = "v3";
			return positionInfo;
		}else if(x>172&&x<240&&y>255&&y<358){
			positionInfo[0] ="�˶���1";
			positionInfo[1] = "68";
			positionInfo[2] = "103";
			positionInfo[3] = "172";
			positionInfo[4] = "255";
			positionInfo[5] = "v7";
			return positionInfo;
		}else if(x>89&&x<167&&y>256&&y<359){
			positionInfo[0] ="��¥";
			positionInfo[1] = "78";
			positionInfo[2] = "103";
			positionInfo[3] = "89";
			positionInfo[4] = "256";
			positionInfo[5] = "v4";
			return positionInfo;
		}else if(x>309&&x<382&&y>247&&y<337){
			positionInfo[0] ="�˶���2";
			positionInfo[1] = "60";
			positionInfo[2] = "80";
			positionInfo[3] = "309";
			positionInfo[4] = "247";
			positionInfo[5] = "v15";
			return positionInfo;
		}else if(x>54&&x<164&&y>363&&y<443){
			positionInfo[0] ="����";
			positionInfo[1] = "110";
			positionInfo[2] = "80";
			positionInfo[3] = "54";
			positionInfo[4] = "365";
			positionInfo[5] = "v5";
			return positionInfo;
		}else if(x>378&&x<442&&y>239&&y<328){
			positionInfo[0] ="����¥";
			positionInfo[1] = "70";
			positionInfo[2] = "90";
			positionInfo[3] = "378";
			positionInfo[4] = "239";
			positionInfo[5] = "v16";
			return positionInfo;
		}else if(x>38&&x<119&&y>110&&y<175){
			positionInfo[0] ="�������";
			positionInfo[1] = "75";
			positionInfo[2] = "60";
			positionInfo[3] = "40";
			positionInfo[4] = "119";
			positionInfo[5] = "v2";
			return positionInfo;
		}else if(x>166&&x<248&&y>184&&y<249){
			positionInfo[0] ="����/ӾӾ��";
			positionInfo[1] = "82";
			positionInfo[2] = "65";
			positionInfo[3] = "166";
			positionInfo[4] = "184";
			positionInfo[5] = "v6";
			return positionInfo;
		}else if(x>171&&x<239&&y>367&&y<429){
			positionInfo[0] ="ˮ��/ԡ��";
			positionInfo[1] = "68";
			positionInfo[2] = "62";
			positionInfo[3] = "171";
			positionInfo[4] = "367";
			positionInfo[5] = "v8";
			return positionInfo;
		}else if(x>176&&x<239&&y>437&&y<538){
			positionInfo[0] ="�Ļ��㳡";
			positionInfo[1] = "63";
			positionInfo[2] = "101";
			positionInfo[3] = "176";
			positionInfo[4] = "437";
			positionInfo[5] = "v9";
			return positionInfo;
		}else if(x>247&&x<305&&y>255&&y<307){
			positionInfo[0] ="ͼ���";
			positionInfo[1] = "58";
			positionInfo[2] = "52";
			positionInfo[3] = "247";
			positionInfo[4] = "255";
			positionInfo[5] = "v11";
			return positionInfo;
		}else if(x>246&&x<317&&y>317&&y<357){
			positionInfo[0] ="1�Ž�ѧ¥";
			positionInfo[1] = "71";
			positionInfo[2] = "40";
			positionInfo[3] = "246";
			positionInfo[4] = "317";
			positionInfo[5] = "v12";
			return positionInfo;
		}else if(x>294&&x<335&&y>365&&y<429){
			positionInfo[0] ="ʵ��¥";
			positionInfo[1] = "41";
			positionInfo[2] = "64";
			positionInfo[3] = "294";
			positionInfo[4] = "365";
			positionInfo[5] = "v13";
			return positionInfo;
		}else if(x>249&&x<358&&y>436&&y<536){
			positionInfo[0] ="����԰����";
			positionInfo[1] = "109";
			positionInfo[2] = "100";
			positionInfo[3] = "249";
			positionInfo[4] = "436";
			positionInfo[5] = "v14";
			return positionInfo;
		}else if(x>369&&x<418&&y>428&&y<474){
			positionInfo[0] ="ѧ����������";
			positionInfo[1] = "49";
			positionInfo[2] = "46";
			positionInfo[3] = "369";
			positionInfo[4] = "428";
			positionInfo[5] = "v17";
			return positionInfo;
		}else if(x>426&&x<472&&y>426&&y<472){
			positionInfo[0] ="�ۺ�¥";
			positionInfo[1] = "46";
			positionInfo[2] = "43";
			positionInfo[3] = "426";
			positionInfo[4] = "426";
			positionInfo[5] = "v18";
			return positionInfo;
		}else if(x>495&&x<599&&y>62&&y<119){
			positionInfo[0] ="ӡˢ��";
			positionInfo[1] = "104";
			positionInfo[2] = "57";
			positionInfo[3] = "495";
			positionInfo[4] = "62";
			positionInfo[5] = "v19";
			return positionInfo;
		}else if(x>493&&x<555&&y>123&&y<264){
			positionInfo[0] ="��̬԰";
			positionInfo[1] = "62";
			positionInfo[2] = "141";
			positionInfo[3] = "493";
			positionInfo[4] = "123";
			positionInfo[5] = "v20";
			return positionInfo;
		}else if(x>487&&x<594&&y>393&&y<437){
			positionInfo[0] ="4�Ž�ѧ¥";
			positionInfo[1] = "107";
			positionInfo[2] = "44";
			positionInfo[3] = "487";
			positionInfo[4] = "393";
			positionInfo[5] = "v21";
			return positionInfo;
		}else if(x>493&&x<544&&y>460&&y<499){
			positionInfo[0] ="3�Ž�ѧ¥";
			positionInfo[1] = "51";
			positionInfo[2] = "39";
			positionInfo[3] = "493";
			positionInfo[4] = "460";
			positionInfo[5] = "v22";
			return positionInfo;
		}else if(x>604&&x<683&&y>433&&y<487){
			positionInfo[0] ="����԰��Ӿ��";
			positionInfo[1] = "79";
			positionInfo[2] = "54";
			positionInfo[3] = "604";
			positionInfo[4] = "433";
			positionInfo[5] = "v23";
			return positionInfo;
		}else if(x>680&&x<810&&y>399&&y<507){
			positionInfo[0] ="���ع㳡";
			positionInfo[1] = "129";
			positionInfo[2] = "108";
			positionInfo[3] = "673";
			positionInfo[4] = "399";
			positionInfo[5] = "v24";
			return positionInfo;
		}else if(x>252&&x<304&&y>204&&y<243){
			positionInfo[0] ="������";
			positionInfo[1] = "52";
			positionInfo[2] = "39";
			positionInfo[3] = "252";
			positionInfo[4] = "204";
			positionInfo[5] = "v10";
			return positionInfo;
		}else if(x>811&&x<870&&y>364&&y<401){
			positionInfo[0] ="c17��117";
			positionInfo[1] = "59";
			positionInfo[2] = "37";
			positionInfo[3] = "811";
			positionInfo[4] = "364";
			positionInfo[5] = "v25";
			return positionInfo;
		}else if(x>0&&x<83&&y>300&&y<316){
			positionInfo[0] ="����-���";
			positionInfo[1] = "83";
			positionInfo[2] = "16";
			positionInfo[3] = "0";
			positionInfo[4] = "300";
			positionInfo[5] = "v26";
			return positionInfo;
		}
		else{
			return null;
		}
	}
	
	public static String IfWhere(Point one){
		int x = (int)one.getX();
		int y = (int)one.getY();
		if(x>40&&x<116&&y>64&&y<104){
			return "v1";
		}else if(x>41&&x<123&&y>185&&y<246){
			return "v3";
		}else if(x>172&&x<240&&y>255&&y<358){
			return "v7";
		}else if(x>89&&x<167&&y>256&&y<359){
			return "v4";
		}else if(x>309&&x<382&&y>247&&y<337){
			return "v15";
		}else if(x>54&&x<164&&y>363&&y<443){
			return "v5";
		}else if(x>378&&x<442&&y>239&&y<328){
			return "v16";
		}else if(x>38&&x<119&&y>110&&y<175){
			return "v2";
		}else if(x>166&&x<248&&y>184&&y<249){
			return "v6";
		}else if(x>171&&x<239&&y>367&&y<429){
			return "v8";
		}else if(x>176&&x<239&&y>437&&y<538){
			return "v9";
		}else if(x>247&&x<305&&y>255&&y<307){
			return "v11";
		}else if(x>246&&x<317&&y>317&&y<357){
			return "v12";
		}else if(x>294&&x<335&&y>365&&y<429){
			return "v13";
		}else if(x>249&&x<358&&y>436&&y<536){
			return "v14";
		}else if(x>369&&x<418&&y>428&&y<474){
			return "v17";
		}else if(x>426&&x<472&&y>426&&y<472){
			return "v18";
		}else if(x>495&&x<599&&y>62&&y<119){
			return "v19";
		}else if(x>493&&x<555&&y>123&&y<264){
			return "v20";
		}else if(x>487&&x<594&&y>393&&y<437){
			return "v21";
		}else if(x>493&&x<544&&y>460&&y<499){
			return "v22";
		}else if(x>604&&x<683&&y>433&&y<487){
			return "v23";
		}else if(x>680&&x<810&&y>399&&y<507){
			return "v24";
		}else if(x>252&&x<304&&y>204&&y<243){
			return "v10";
		}else if(x>811&&x<870&&y>364&&y<401){
			return "v25";
		}else if(x>0&&x<83&&y>300&&y<316){
			return "v26";
		}
		else{
			return null;
		}
	}
	
	public static Point IfWhere(String vex,int x,int y){
		//����v1,v2,v3--�ҵ�����ͼ�е����ĵ�
		String positionInfo[] = TellUserPosition.IfWhere(x, y);
		Point p = null;
		if(positionInfo[5].equals(vex)){
			Integer height = Integer.parseInt(positionInfo[1]);
			Integer width = Integer.parseInt(positionInfo[2]);
			Integer centerX = Integer.parseInt(positionInfo[3])+width/2;
			Integer centerY = Integer.parseInt(positionInfo[4])+height/2;
			p = new Point(centerX,centerY);
			return p;
		}
		return p;
	}
	
	public final static String[][] posi = new String[][]{
		{"v1","76","81","ѧ�����"},
		{"v2","82","152","�������"},
		{"v3","82","214","������"},
		{"v4","128","309","��¥"},
		{"v5","111","406","����"},
		{"v6","206","223","����/��Ӿ��"},
		{"v7","205","305","�˶���1"},
		{"v8","202","396","ˮ��/ԡ��"},
		{"v9","207","487","�Ļ��㳡"},
		{"v10","277","223","������"},
		{"v11","278","277","ͼ���"},
		{"v12","280","340","1�Ž�ѧ¥"},
		{"v13","315","397","ʵ��¥"},
		{"v14","301","488","����԰����"},
		{"v15","342","292","�˶���2"},
		{"v16","410","284","����¥"},
		{"v17","395","451","ѧ����������"},
		{"v18","450","446","�ۺ�¥"},
		{"v19","548","90","ӡˢ��"},
		{"v20","525","194","��̬԰"},
		{"v21","543","413","4�Ž�ѧ¥"},
		{"v22","514","477","3�Ž�ѧ¥"},
		{"v23","641","461","����԰��Ӿ��"},
		{"v24","736","452","���ع㳡"},
		{"v25","839","380","c17��117"},
		{"v26","42","309","����"}};
	
	public static Point IfWhere(String vex){
		Point p = null;
		for(int i=0;i<posi.length;++i){
			if(posi[i][0].equals(vex)){
				int x = Integer.parseInt(posi[i][1]);
				int y = Integer.parseInt(posi[i][2]);
				p = new Point(x,y);
				return p;
			}
		}
		return p;
	}
	public static void main(String[] args) {
		Point p = TellUserPosition.IfWhere("v9");
		System.out.println(p);
	}
}
